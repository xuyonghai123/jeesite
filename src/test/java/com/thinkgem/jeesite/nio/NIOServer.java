package com.thinkgem.jeesite.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Thinkpad on 17/10/22.
 **/
public class NIOServer {
    //标识数字
    private int flag = 0 ;
    //缓冲区大小
    private int BLOCK = 4096;
    //接收数据缓冲区
    private ByteBuffer sendByteBuffer = ByteBuffer.allocate(BLOCK);
    //发送数据缓冲区
    private ByteBuffer receiveByteBuffer = ByteBuffer.allocate(BLOCK);
    //选择器
    private Selector selector;
    /**
     * 构造器
     * */
    public NIOServer(int port) throws IOException {
        //打开服务器套接字通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //服务器配置为非阻塞
        serverSocketChannel.configureBlocking(false);
        //检索与此通道关联的服务器套接字
        ServerSocket serverSocket = serverSocketChannel.socket();
        //进行服务的绑定
        serverSocket.bind(new InetSocketAddress(port));
        //通过Open（）方法找到Selector
        selector = Selector.open();
        //注册到selector，等待连接
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("Server Start ---- 8888");
    }

    //监听
    private void listen() throws IOException{
        while (true){
            //选择一组键，并且相应的通道已打开
            selector.select();
            //返回此选择器的的已选择键集
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                iterator.remove();
                handlekey(selectionKey);
            }
        }
    }

    //处理请求
    private  void handlekey(SelectionKey selectionKey) throws IOException{
        //接收请求
        ServerSocketChannel serverSocketChannel = null;
        SocketChannel socketChannel = null;
        String receiveText;
        String sendText;
        int count = 0;
        //测试此键的通道是否已准备好接收新的套接字连接
        if (selectionKey.isAcceptable()){
            //返回为之创建的此键的通道
            serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
            //接收到此通道套接字的连接
            //此方法返回的套接字通道（如果有）将处于阻塞模式
            socketChannel = serverSocketChannel.accept();
            //配置为非阻塞模式
            socketChannel.configureBlocking(false);
            //注册到selector，等待连接。
            socketChannel.register(selector,SelectionKey.OP_READ);
        }else if(selectionKey.isReadable()){
            //返回为之创建的此键的通道
            socketChannel = (SocketChannel) selectionKey.channel();
            //将缓冲区清空以备下次读取
            receiveByteBuffer.clear();
            //读取服务器发送来的数据到缓冲区
            count = socketChannel.read(receiveByteBuffer);
            if (count>0){
                receiveText = new String(receiveByteBuffer.array(),0,count);
                System.out.println("服务器端接收客户端数据==:"+receiveText);
                socketChannel.register(selector,SelectionKey.OP_WRITE);
            }
        }else if (selectionKey.isWritable()){
            //将缓冲区清空以备下次写入
            sendByteBuffer.clear();
            // 返回为之创建此键的通道
            socketChannel = (SocketChannel) selectionKey.channel();
            sendText = "message form server- - "+flag++;
            //向缓冲区中输入数据
            sendByteBuffer.put(sendText.getBytes());
            //将缓冲区各标志复位,因为向里面put了数据标志被改变要想从中读取数据发向服务器,就要复位
            sendByteBuffer.flip();
            //输出到通道
            socketChannel.write(sendByteBuffer);
            System.out.println("服务器端向客户端发送数据--:"+sendText);
            socketChannel.register(selector,SelectionKey.OP_READ);
        }
    }

    public static void main(String[] args) throws IOException {
        int port=8888;
        NIOServer nioServer = new NIOServer(port);
        nioServer.listen();

    }

}
