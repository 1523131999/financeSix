package cn.tcmp.ymy.controller;

import cn.tcmp.entity.*;
import cn.tcmp.ymy.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class ClientController {
        @Autowired
        private ClientService service;

        @RequestMapping("queryClient")
        public  String queryAll(String pagesize, String pagenum, Client client, Model model , HttpServletRequest request) {
            pagesize=request.getParameter("pagesize");
            System.out.println(client);
            System.out.println(pagenum+"                 "+pagesize);
            if (pagesize == null) {
                pagesize="10";
            }else {

            }
            if (pagenum == null) {
                pagenum="1";
            }

            Integer pageNum=Integer.parseInt(pagenum);
            Integer pageSize=Integer.parseInt(pagesize);
            //获取表单时间
            String startTime=request.getParameter("startTime");
            String endTime=request.getParameter("endTime");

            model.addAttribute("client",client);
            model.addAttribute("startTime",startTime);
            model.addAttribute("endTime",endTime);
            model.addAttribute("pageSize",pagesize);



            model.addAttribute("pageinfo",service.queryAll(client,pageSize,pageNum,startTime,endTime));

            return "ymy/list";
        }

    @RequestMapping("renlingClient")
    @ResponseBody
    public String renling(Client client) {
            Integer status=service.queryClientByFour(client);
        if (status == 2) {
            return "该用户不存在";
        }
        if (status == 3) {
            return "该用户已有主要经理";
        }
        return  "认领客户成功";
    }

    @RequestMapping("doAddBro")
    @ResponseBody
    public String doAddBro(Client client) {

        Brokeragerelations brokeragerelations=new Brokeragerelations();
            Date date=new Date();
        brokeragerelations.setSubmissiondate(date);

        client=service.queryFour(client);

        if (client == null) {
            return  "更改申请失败，该用户不存在";
        }
        brokeragerelations.setClient(client);
        brokeragerelations.setInitiator("理财经理");
        service.addBro(brokeragerelations);
        return "更改已申请成功";

    }



    @RequestMapping("toreling")
    public  String renling1() {
            return  "ymy/renling";
    }
    @RequestMapping("queryDelete")
    public String deleteQuery(Model model, Secondarymanager secondarymanager,String pagenum,String pagesize,HttpServletRequest request) {
        pagesize=request.getParameter("pagesize");
        if (pagesize == null) {
            pagesize="3";
        }
        if (pagenum == null) {
            pagenum="1";
        }
        Integer pageNum=Integer.parseInt(pagenum);
        Integer pageSize=Integer.parseInt(pagesize);

        //如果Secondarymanager为空赋值
        if (secondarymanager.getClient() == null) {

            Cert cert=new Cert();
            Client client=new Client();
            client.setCert(cert);
            secondarymanager.setClient(client);
        }
        if (secondarymanager.getClient().getCert() == null) {
            Cert cert=new Cert();
            secondarymanager.getClient().setCert(cert);
        }
        model.addAttribute("smanager",secondarymanager);
        model.addAttribute("pagesize",pagesize);
        model.addAttribute("pageInfo",service.queryCiYao(secondarymanager,pageSize,pageNum));
        return  "ymy/delete";
    }







    @RequestMapping("queryAdd")
    public String queryAdd(Model model, Client client,String pagenum,String pagesize,HttpServletRequest request) {
        if (client.getFmid()==null){
             client.setFmid(1);
        }
            pagesize=request.getParameter("pagesize");
        if (pagesize == null) {
            pagesize="3";
        }
        if (pagenum == null) {
            pagenum="1";
        }
        Integer pageNum=Integer.parseInt(pagenum);
        Integer pageSize=Integer.parseInt(pagesize);

        if (client.getCert() == null) {
            Cert cert=new Cert();
            client.setCert(cert);
        }
        model.addAttribute("client",client);
        model.addAttribute("pagesize",pagesize);
        model.addAttribute("pageInfo",service.queryAdd(client,pageNum,pageSize));
        return  "ymy/tianjiaciyao";
    }
















    @RequestMapping("deleteManage")
    @ResponseBody
    public Map<Integer,String> deleteManage(String []ids,String[]smids) {
        System.out.println(Arrays.toString(ids));
            Map<Integer,String> map=new HashMap<>();
        for (int i = 0; i < ids.length; i++) {
            if (service.queryAppoint(Integer.parseInt(ids[i])) == null) {
                    service.delete(Integer.parseInt(smids[i]));
                map.put(Integer.parseInt(ids[i]), "成功");
            } else {
                map.put(Integer.parseInt(ids[i]),"用户存在预约");
            }
        }


        return  map;
    }

    @RequestMapping("queryFac")
    public  String queryFac(Client client,String pageSize,String pageNum,Model model) {
       if (pageNum==null){
           pageNum="1";
       }
       if (pageSize==null){
           pageSize="3";
       }
       Integer pagesize=Integer.parseInt(pageSize);
       Integer pagenum =Integer.parseInt(pageNum);



        if (client == null) {
                client=new Client();
        }
        if (client.getCert() == null) {
                Cert cert=new Cert();
                client.setCert(cert);
        }
        model.addAttribute("pageinfo",service.queryAllFact(client,pagesize,pagenum));
        model.addAttribute("client",client);
        model.addAttribute("pagesize",pageSize);
        return "ymy/zhuangyikehu";
    }

    @RequestMapping("toFenpei")
    public String toFenpei(Integer[] ids, Model model) {
        List<Client> list=new ArrayList<>();
        for (Integer id : ids) {
            Client client=service.detail(id);
            System.out.println(client);
            list.add(client);
        }
        model.addAttribute("list",list);
            return  "ymy/zhixingfenpai";
    }

    @RequestMapping("toAdd")
    public String toAdd(Integer[] ids, Model model) {
        List<Client> list=new ArrayList<>();
        for (Integer id : ids) {
            Client client=service.detail(id);
            System.out.println(client);
            list.add(client);
        }
        model.addAttribute("list",list);
        return  "ymy/add";
    }
    @RequestMapping("doAdd")
    public  String doAdd(Integer[] ids,Secondarymanager secondarymanager ,Model model){
        for (Integer id : ids) {
            Client client=new Client();
            client.setClientid(id);
            secondarymanager.setClient(client);
            if (secondarymanager.getMianmanage() == 1) {
                service.updateManager(id, secondarymanager.getManagerid());

            } else {
                service.insertmanage(secondarymanager);
            }
        }
        return "redirect:queryAdd";
    }




    @RequestMapping("doFenpei")
    public  String doFenpei(Integer[] ids,Secondarymanager secondarymanager ,Model model){
        for (Integer id : ids) {
            Client client=new Client();
            client.setClientid(id);
            secondarymanager.setClient(client);
            if (secondarymanager.getMianmanage() == 1) {
                service.updateManager(id, secondarymanager.getManagerid());

            } else {
                service.insertmanage(secondarymanager);
            }
        }
            return "redirect:queryFac";
    }
    @RequestMapping("queryBro")
    public String queryBro(Brokeragerelations brokeragerelations,String startDate,String endDate,Model model,String pagesize,String pagenum,HttpServletRequest request) {
            if (pagesize == null) {
            pagesize="10";
        }else {

        }
        if (pagenum == null) {
            pagenum="1";
        }
        if (brokeragerelations.getClient() == null) {
            Client client=new Client();
            brokeragerelations.setClient(client);
        }
        Integer pageNum=Integer.parseInt(pagenum);
        Integer pageSize=Integer.parseInt(pagesize);
        //获取表单时间

        model.addAttribute("bro",brokeragerelations);
        model.addAttribute("startDate",startDate);
        model.addAttribute("endDate",endDate);
        model.addAttribute("pageSize",pagesize);



        model.addAttribute("pageinfo",service.queryBroke(brokeragerelations,startDate,endDate,pageSize,pageNum));
        return "ymy/jingjigaunxi";
    }
    @RequestMapping("queryBybro")
    public String queryBybro(Brokeragerelations brokeragerelations,String startDate,String endDate,Model model,String pagesize,String pagenum,HttpServletRequest request) {
        if (pagesize == null) {
            pagesize="10";
        }else {

        }
        if (pagenum == null) {
            pagenum="1";
        }
        if (brokeragerelations.getClient() == null) {
            Client client=new Client();
            brokeragerelations.setClient(client);
        }
        Integer pageNum=Integer.parseInt(pagenum);
        Integer pageSize=Integer.parseInt(pagesize);
        //获取表单时间

        model.addAttribute("bro",brokeragerelations);
        model.addAttribute("startDate",startDate);
        model.addAttribute("endDate",endDate);
        model.addAttribute("pageSize",pagesize);



        model.addAttribute("pageinfo",service.queryByBro(brokeragerelations,startDate,endDate,pageSize,pageNum));
        return "ymy/daishenpijilucahxun";
    }
    @RequestMapping("toAddBro")
    public String addBro() {
            return  "ymy/biangengshenqing";
    }
    @RequestMapping("toShenpi")
    public  String toShenpi(String [] names,Integer [] ids,Model model) {
            List<Brokeragerelations> list=new ArrayList<>();
        for (int i=0;i<names.length;i++){
            Brokeragerelations brokeragerelations=new Brokeragerelations();
            Client client=new Client();
            brokeragerelations.setBlid(ids[i]);
            client.setClientName(names[i]);
            brokeragerelations.setClient(client);
            list.add(brokeragerelations);
        }
            model.addAttribute("list",list);


            return "ymy/zhixingshenpi";
    }

    @RequestMapping("doShenpi")
    public String doShenpi(String[] Name, Integer[] id, Brokeragerelations brokeragerelations) {
        for (Integer i : id) {
            brokeragerelations.setBlid(i);
            service.updateStatus(brokeragerelations);
        }
            return "redirect:queryBybro";
    }















}
