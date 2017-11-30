package com.thinkgem.jeesite.common.utils;


import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.host.Host;
import com.zabbix4j.host.HostGetRequest;
import com.zabbix4j.host.HostGetResponse;
import com.zabbix4j.item.Item;
import com.zabbix4j.item.ItemGetRequest;
import com.zabbix4j.item.ItemGetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Thinkpad on 17/09/21.
 **/
public class ZabbixUtils {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    private static final String ZBX_URL = "http://45.77.68.69:8080/zabbix/api_jsonrpc.php";
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "zabbix";

    public static void main(String[] args) {
        ZabbixApi zabbixApi =new ZabbixApi(ZBX_URL);
        HostGetRequest hostGetRequest = new HostGetRequest();
        ItemGetRequest itemGetRequest = new ItemGetRequest();
        try {
            zabbixApi.login(USERNAME,PASSWORD);


            //获取Zabbix的item
            Item item = zabbixApi.item();
            ItemGetResponse itemGetResponse= item.get(itemGetRequest);
            System.out.println("itemSize:"+itemGetResponse.getResult().size());
            for (int i = 0; i < itemGetResponse.getResult().size(); i++) {
                System.out.println("item"+i+":"+itemGetResponse.getResult().get(i).getName());
            }
            //获取zabbix的host
            System.out.println("--------------------------------");
            Host host = zabbixApi.host();
            HostGetResponse hostGetResponse= host.get(hostGetRequest);
            System.out.println("host:"+hostGetResponse.getResult().get(0).getName());

        } catch (ZabbixApiException e) {
            e.printStackTrace();
        }






    }
}
