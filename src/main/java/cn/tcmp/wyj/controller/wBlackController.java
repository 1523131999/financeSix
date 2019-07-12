package cn.tcmp.wyj.controller;

import cn.tcmp.entity.Blacklist;
import cn.tcmp.entity.Client;
import cn.tcmp.wyj.service.BlacklistService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("wblick")
public class wBlackController {

    @Autowired
    private BlacklistService blacklistService;

    //查询展示所有黑名单关联信息
    @RequestMapping(value = "queryAll", method = RequestMethod.GET)
    public String queryAll1(Blacklist blacklist, Integer pageNo, Integer pageSize, Model model) {
        System.out.println("+>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>+null" + blacklist);
        if (blacklist.getClient() == null) {
            Client client = new Client();
            client.setClientName("");
            blacklist.setClient(client);
        }


        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 2;
        }

        PageInfo<Blacklist> pageInfo = blacklistService.queryAllBlick(blacklist, pageNo, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("blist", blacklist);

        System.err.println("++++++>>>>>>>>>++++++++++:>>>>>>>>>>>>>>>>+::::" + pageNo);

        return "wyj/Blacklist";

    }


    @RequestMapping(value = "updateBlack", method = RequestMethod.POST)
    @ResponseBody
    public Map<Integer,String> updateBlack(String []ids,String[]smids,Integer clientid) {
        System.out.println(Arrays.toString(ids));
        Map<Integer, String> map = new HashMap<>();
        if(Arrays.toString(ids)==null){
            for (int i = 0; i < ids.length; i++) {
                if (blacklistService.queryBlickId(Integer.parseInt(ids[i])) == null) {
                    System.err.println(i + "1231246456");
                    Integer count = blacklistService.queryBlickId(clientid);
                    System.err.println(count + "1231246456");
                    if (count == 1) {
                        blacklistService.updateByClientByBlackState(Integer.parseInt(smids[i]));
                       // map.put(Integer.parseInt(ids[i]), "成功");
                        map.put(count,"成功!");
                    }

                    map.put(count,"已存在!");
                } else {


                    //map.put(Integer.parseInt(ids[i]), "用户在黑名单");

                }
                }
            }

        return map;
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String addBlack(Blacklist blacklist,Integer blackid) {
        Blacklist count=blacklistService.queryByid(blackid);
        System.err.println(count+"++++++?????????????????>>>>>>>>>>>");
        Integer count1 = blacklistService.upBlacklist(blacklist);
        System.err.println(count1+"++++++>>>>>>>>>>>++++++++++++++++++++++");
        return "redirect:/wblick/queryAll";
    }

    @RequestMapping(value = "queryBlickId", method = RequestMethod.GET)
    public Integer queryBlickId(Integer clientid) {
        return blacklistService.queryBlickId(clientid);
    }

    @RequestMapping(value = "queryBlickCName", method = RequestMethod.GET)
    public String queryBlickCName(Integer[] clientid, Model model) {
        List<Client> list=new ArrayList<>();
        for (Integer id : clientid) {
                Client client=new Client();
                client=blacklistService.queryBlickCName(id);
                list.add(client);
        }

        model.addAttribute("list",list);
        return "wyj/BlacklistAdd";
    }

}