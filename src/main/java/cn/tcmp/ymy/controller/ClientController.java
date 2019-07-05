package cn.tcmp.ymy.controller;

import cn.tcmp.entity.Cert;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import cn.tcmp.ymy.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
    @RequestMapping("toreling")
    public  String renling1() {
            return  "ymy/renling";
    }
    @RequestMapping("queryDelete")
    public String deleteQuery(Model model, Secondarymanager secondarymanager,String pagenum,String pagesize,HttpServletRequest request) {
        pagesize=request.getParameter("pagesize");
        if (pagesize == null) {
            pagesize="10";
        }else {

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
        model.addAttribute("pageInfo",service.queryCiYao(secondarymanager,pageSize,pageNum));
        return  "ymy/delete";
    }
}
