package cn.tcmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @RequestMapping("toHome")
    public  String toHome(){
        return  "ziranren";
    }



}
