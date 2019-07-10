package cn.tcmp.tiantian.controller;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Cert;
import cn.tcmp.tiantian.service.TTClientService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @RequestMapping("querygerenAll")
    public String querygerenAll(Integer pagesize, Integer pagenum,String creatid,Client client, Model model,String[] xintuo,String[] jijin,String[] kehu){
        if (creatid != null){
            Cert c = new Cert();
            c.setCertid(Integer.parseInt(creatid));
            client.setCert(c);
        }
        //客户等级
        if (kehu != null && kehu.length != 0) {
            String k = "";
            for (int i = 0; i < kehu.length; i++) {
                if (kehu.length - 1 == i) {
                    k += kehu[i];
                }else{
                    k += kehu[i]+"'"+",'";
                }

            }
            client.setTclientlevel(k);
        }
        //客户风险等级信托版
        if(xintuo != null && xintuo.length != 0){
            String k = "";
            for (int i = 0; i < xintuo.length; i++) {
                if (xintuo.length - 1 == i) {
                    k += xintuo[i];
                }else{
                    k += xintuo[i]+"'"+",'";
                }
            }
            client.setTrisklevelTE(k);
        }
        //客户风险等级基金版
        if (jijin != null && jijin.length != 0){
            String k = "";
            for (int i = 0; i < jijin.length; i++) {
                if (jijin.length - 1 == i) {
                    k += jijin[i];
                }else{
                    k += jijin[i]+",";
                }
            }
            client.setTrisklevelFE(k);
        }
        System.out.println("-------------------"+client);
        PageInfo<Client> clientPageInfo = service.querygerenAll(pagesize, pagenum, client);
        for (Client client1 : clientPageInfo.getList()) {
            System.out.println("========"+client1);
        }
        model.addAttribute("client",clientPageInfo);
        Cert c = new Cert();
        List<Cert> certs = service.queryCertAll(c);
        model.addAttribute("cert",certs);
        return "tiantian/client-queryAll";
    }

    @RequestMapping("toquerygerenAll")
    public String toquerygerenAll(Cert cert,Model model){
        List<Cert> certs = service.queryCertAll(cert);
        System.out.println("-------------------------"+certs);
        model.addAttribute("cert",certs);
        return "client-queryAll";
    }
}
