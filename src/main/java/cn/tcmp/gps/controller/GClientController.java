package cn.tcmp.gps.controller;

import cn.tcmp.entity.Assets;
import cn.tcmp.entity.Assetsrecord;
import cn.tcmp.entity.Client;
import cn.tcmp.gps.service.GClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Assetsrecord> alist=gClientService.queryAllByClientId(id);
        List<Assets> assetsList=gClientService.queryAllAssets(id);
        model.addAttribute("assetsList",assetsList);
        model.addAttribute("client",client);
        model.addAttribute("alist",alist);
        System.out.println(client);
        return  "gps/ziranren";

    }

    @ResponseBody
    @RequestMapping("queryTotalByDate")
    public Map<String,Integer>  getTotal(Integer id){
        Map<String,Integer> map= new HashMap<>();
        Integer yi= gClientService.queryTotalByDate("2019-01-01","2019-01-30",id);
        Integer er= gClientService.queryTotalByDate("2019-02-01","2019-02-28",id);
        Integer san= gClientService.queryTotalByDate("2019-03-01","2019-03-30",id);
        Integer si= gClientService.queryTotalByDate("2019-04-01","2019-04-30",id);
        Integer wu= gClientService.queryTotalByDate("2019-05-01","2019-05-30",id);
        Integer liu= gClientService.queryTotalByDate("2019-06-01","2019-06-30",id);
        Integer qi= gClientService.queryTotalByDate("2019-07-01","2019-07-30",id);
        Integer ba= gClientService.queryTotalByDate("2019-08-01","2019-08-30",id);
        Integer jiu= gClientService.queryTotalByDate("2019-09-01","2019-09-30",id);
        Integer shi= gClientService.queryTotalByDate("2019-10-01","2019-10-30",id);
        Integer sy= gClientService.queryTotalByDate("2019-11-01","2019-11-30",id);
        Integer se= gClientService.queryTotalByDate("2019-12-01","2019-12-30",id);
        map.put("yi",yi);
        map.put("er",er);
        map.put("san",san);
        map.put("si",si);
        map.put("wu",wu);
        map.put("liu",liu);
        map.put("qi",qi);
        map.put("ba",ba);
        map.put("jiu",jiu);
        map.put("shi",shi);
        map.put("sy",sy);
        map.put("se",se);
        System.out.println(liu);
        return  map;
    }


}
