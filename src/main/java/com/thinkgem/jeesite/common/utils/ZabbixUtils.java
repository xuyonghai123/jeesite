package com.thinkgem.jeesite.common.utils;


import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.host.*;
import com.zabbix4j.item.Item;
import com.zabbix4j.item.ItemGetRequest;
import com.zabbix4j.item.ItemGetResponse;
import com.zabbix4j.item.ItemObject;

import java.util.List;

/**
 * Created by Thinkpad on 17/09/21.
 **/
public class ZabbixUtils {

    private static final String ZBX_URL = "http://45.77.68.69:8080/zabbix/api_jsonrpc.php";
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "zabbix";

    public static void main(String[] args) {
        ZabbixApi zabbixApi =new ZabbixApi(ZBX_URL);
        HostGetRequest hostGetRequest = new HostGetRequest();
        ItemGetRequest itemGetRequest = new ItemGetRequest();
        try {
            zabbixApi.login(USERNAME,PASSWORD);

            Item item = zabbixApi.item();
            ItemGetResponse itemGetResponse= item.get(itemGetRequest);
            for (int i = 0; i < itemGetResponse.getResult().size(); i++) {
                System.out.println(itemGetResponse.getResult().get(i).getName());
            }
            System.out.println(itemGetResponse.getResult().size());

//            Host host = zabbixApi.host();
//            HostGetResponse hostGetResponse= host.get(hostGetRequest);
//            System.out.println(hostGetResponse.getResult().get(0).getName());
//            System.out.println("--------------------------------");
        } catch (ZabbixApiException e) {
            e.printStackTrace();
        }






    }
}
