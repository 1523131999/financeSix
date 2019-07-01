package cn.tcmp.tiantian.controller;

import cn.tcmp.entity.Client;
import cn.tcmp.tiantian.service.TTClientService;


public class TTClientController {


    private TTClientService service;


    public String addClient(Client client){
        service.addClient(client);
        return "/tiantian/client-add";
    }
}
