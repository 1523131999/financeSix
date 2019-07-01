package cn.tcmp.gps.controller;

import cn.tcmp.entity.Client;
import cn.tcmp.gps.service.GClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("client")
public class GClientController {

    @Autowired
    private GClientService gClientService;


    //查询客户详情
    @RequestMapping("queryClientDetail")
    public  String queryClient(Integer id, Model model){
        //项目未集成 所以id 暂时写死
        id=1;
        Client client=gClientService.query(id);
        model.addAttribute("client",client);
        System.out.println(client);
        return  "ziranren";

    }

}
