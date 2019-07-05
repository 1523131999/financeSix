package cn.tcmp.tiantian.controller;

import cn.tcmp.entity.Client;
import cn.tcmp.tiantian.service.TTClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ttClientController")
public class TTClientController {


    @Autowired
    private TTClientService service;

    @RequestMapping("addClient")
    public String addClient(Client client){
        service.addClient(client);
        return "/tiantian/client-add";
    }

    @RequestMapping("addjigouClient")
    public String addjigouClient(Client client){
        service.addClient(client);
        return "/tiantian/jigouclient-add";
    }

}
