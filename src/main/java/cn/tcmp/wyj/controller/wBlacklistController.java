package cn.tcmp.wyj.controller;

import cn.tcmp.entity.Blacklist;
import cn.tcmp.wyj.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("wBlack")
public class wBlacklistController {

    @Autowired
    private BlacklistService blacklistService;

    //查询展示所有黑名单关联信息
    @RequestMapping("queryAllBlickByClient")
    public String queryAllBlickByClient(Model model){

        List<Blacklist>  blacklist=blacklistService.queryAllBlickByClient();
        model.addAttribute("blacklist",blacklist);
        return "Blacklist";

    }

}
