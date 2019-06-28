package cn.tcmp.ymy.controller;

import cn.tcmp.entity.Client;
import cn.tcmp.ymy.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ClientController {
        @Autowired
        private ClientService service;

        @RequestMapping("queryClient")
        public  String queryAll(String pagesize, String pagenum, Client client, Model model , HttpServletRequest request) {
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




            model.addAttribute("pageinfo",service.queryAll(client,pageSize,pageNum,startTime,endTime));

            return "ymy/list";
        }

}
