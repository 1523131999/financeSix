package cn.tcmp.tiantian.controller;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Cert;
import cn.tcmp.entity.TType;
import cn.tcmp.entity.Contacts;
import cn.tcmp.tiantian.service.TTClientService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TTClientController {


    @Autowired
    private TTClientService service;

    @RequestMapping("addClient")
    public String addClient(Client client,Contacts contacts){
        Contacts contacts1 = new Contacts();
        Cert cert = new Cert();
        cert.setCertid(1);
        contacts1.setContactid(1);
        client.setCert(cert);
        client.setContacts(contacts1);
        service.addClient(client);
        System.out.println(client.getCert());
        service.addcontacts(contacts);
        return "tiantian/client-add";
}

    @RequestMapping("toaddClient")
    public String toaddClient(Model model){
        Cert cert = new Cert();
        List<Cert> certs = service.queryCertAll(cert);
        System.out.println("-------------------------"+certs);
        model.addAttribute("cert",certs);
        return "tiantian/client-add";
    }

    @RequestMapping("addjigouClient")
    public String addjigouClient(Client client){
        service.addClient(client);
        return "tiantian/jigouclient-add";
    }

    @RequestMapping("queryAll")
    public String queryAll(Integer pagesize, Integer pagenum,String creatid,Client client, Model model,Integer[] xintuo,Integer[] jijin,Integer[] kehu){
        if(pagenum == null){
            pagenum = 1;
        }
        if (creatid != null){
            Cert c = new Cert();
            c.setCertid(Integer.parseInt(creatid));
            client.setCert(c);
        }
        //客户风险等级信托版
        if(xintuo != null && xintuo.length != 0){
            List<Integer> integers = Arrays.asList(xintuo);
            client.setTrisklevelTE(integers);
        }
        List<TType> dengji = new ArrayList<>();
        TType t1 = new TType();
        t1.setKey(1);
        t1.setValue("高级用户");
        TType t2 = new TType();
        t2.setKey(2);
        t2.setValue("VIP用户");
        dengji.add(t1);
        dengji.add(t2);
        System.out.println(dengji);
        model.addAttribute("dengji",dengji);
        //客户风险等级信托版
        if(jijin != null && jijin.length != 0){
            List<Integer> integers = Arrays.asList(jijin);
            client.setTrisklevelFE(integers);
        }
        //客户风险等级信托版
        if(kehu != null && kehu.length != 0){
            List<Integer> integers = Arrays.asList(kehu);
            client.setTclientlevel(integers);
        }

        System.out.println("-------------------"+client);
        PageInfo<Client> clientPageInfo = service.querygerenAll(5, pagenum, client);
        for (Client client1 : clientPageInfo.getList()) {
            System.out.println("========"+client1);
        }
        model.addAttribute("client",clientPageInfo);
        Cert c = new Cert();
        List<Cert> certs = service.queryCertAll(c);
        model.addAttribute("cert",certs);
        if(client.getCert() == null){
            Cert c2 = new Cert();
            c2.setCertid(0);
            client.setCert(c2);
        }
        model.addAttribute("clienthuixian",client);
        return "clientqueryAll";
    }

    @RequestMapping("toqueryAll")
    public String toqueryAll(Cert cert,Model model){
        List<Cert> certs = service.queryCertAll(cert);
        System.out.println("-------------------------"+certs);
        model.addAttribute("cert",certs);
        return "tiantian/clientqueryAll";
    }


    @RequestMapping("queryjigouAll")
    public String queryjigouAll(Integer pagesize, Integer pagenum,String creatid,String contactname, Client client,Model model){
        if(pagenum == null){
            pagenum = 1;
        }
        if (creatid != null){
            Cert c = new Cert();
            c.setCertid(Integer.parseInt(creatid));
            client.setCert(c);
        }
        if (contactname != null && contactname != ""){
            Contacts co = new Contacts();
            co.setContactname(contactname);
            client.setContacts(co);
        }else{
            Contacts co = new Contacts();
            co.setContactname("");
            client.setContacts(co);
        }
        PageInfo<Client> clientPageInfo = service.queryjigouAll(5, pagenum, client);
        model.addAttribute("client",clientPageInfo);
        Cert c = new Cert();
        List<Cert> certs = service.queryCertAll(c);
        model.addAttribute("cert",certs);
        if(client.getCert() == null){
            Cert c2 = new Cert();
            c2.setCertid(0);
            client.setCert(c2);
        }
        model.addAttribute("clienthuixian",client);
        return "tiantian/clientjigouqueryAll";
    }

    @RequestMapping("querygerenAll")
    public String querygerenAll(Integer pagesize, Integer pagenum,String creatid,Client client, Model model,Integer[] xintuo,Integer[] jijin,Integer[] kehu){
        if(pagenum == null){
            pagenum = 1;
        }
        System.out.println("-=-=-=-=-=-=-=-=-="+client);
        if (creatid != null){
            Cert c = new Cert();
            c.setCertid(Integer.parseInt(creatid));
            client.setCert(c);
        }
        //客户风险等级信托版
        if(xintuo != null && xintuo.length != 0){
            List<Integer> integers = Arrays.asList(xintuo);
            client.setTrisklevelTE(integers);
        }
        List<TType> dengji = new ArrayList<>();
        TType t1 = new TType();
        t1.setKey(1);
        t1.setValue("高级用户");
        TType t2 = new TType();
        t2.setKey(2);
        t2.setValue("VIP用户");
        dengji.add(t1);
        dengji.add(t2);
        System.out.println(dengji);
        model.addAttribute("dengji",dengji);
        //客户风险等级信托版
        if(jijin != null && jijin.length != 0){
            List<Integer> integers = Arrays.asList(jijin);
            client.setTrisklevelFE(integers);
        }
        //客户风险等级信托版
        if(kehu != null && kehu.length != 0){
            List<Integer> integers = Arrays.asList(kehu);
            client.setTclientlevel(integers);
        }

        System.out.println("-------------------"+client);
        PageInfo<Client> clientPageInfo = service.querygerenAll(5, pagenum, client);
        for (Client client1 : clientPageInfo.getList()) {
            System.out.println("========"+client1);
        }
        model.addAttribute("client",clientPageInfo);
        Cert c = new Cert();
        List<Cert> certs = service.queryCertAll(c);
        model.addAttribute("cert",certs);
        if(client.getCert() == null){
            Cert c2 = new Cert();
            c2.setCertid(0);
            client.setCert(c2);
        }
        client.setClientName("");
        System.out.println("=================="+client);
        model.addAttribute("clienthuixian",client);
        return "tiantian/clientqueryAll";
    }

    @RequestMapping("toquerygerenAll")
    public String toquerygerenAll(Cert cert,Model model){
        List<Cert> certs = service.queryCertAll(cert);
        System.out.println("-------------------------"+certs);
        model.addAttribute("cert",certs);
        return "tiantian/clientqueryAll";
    }




}
