package cn.tcmp.gps.controller;

import cn.tcmp.entity.*;
import cn.tcmp.gps.service.GClientService;
import cn.tcmp.gps.service.GUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("client")
public class GClientController {

    @Autowired
    private GClientService gClientService;
    @Autowired
    private GUserService gUserService;

    //查询客户详情
    @RequestMapping("queryClientDetail")
    public  String queryClient(Integer id, Model model){
        //项目未集成 所以id 暂时写死
      //  id=1;
        Client client=gClientService.query(id);
        List<Assetsrecord> alist=gClientService.queryAllByClientId(id);
        List<Assets> assetsList=gClientService.queryAllAssets(id);
        for (Assets assets : assetsList) {

            if (assets.getPruduct().getItemID().getItemtypeID().getItemTypeID() == 1) {

                model.addAttribute("xintuo",1);
            }
            if (assets.getPruduct().getItemID().getItemtypeID().getItemTypeID() == 2) {
                System.out.println(assets.getPruduct().getItemID().getItemtypeID().getItemTypeID());
                model.addAttribute("jijin",2);
            }
            if (assets.getPruduct().getItemID().getItemtypeID().getItemTypeID() == 3) {
                model.addAttribute("guanli",3);
            }
            System.out.println(assets);
        }
      //  model.addAttribute("assetsList",assetsList);
        model.addAttribute("client",client);
        model.addAttribute("alist",alist);
        System.out.println(client);
        if(client.getClientType()==1){//是否是自然人

            if(client.getFact()==1){
                return  "gps/ziranren";
            }else{
                return "gps/qianzai";
            }
        }else {
            return "gps/d";
        }


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
        if(yi==null){
            yi=0;
        }
        if(er==null){
            er=0;
        }
        if(san==null){
            san=0;
        }
        if(si==null){
            si=0;
        }
        if(wu==null){
            wu=0;
        }
        if(liu==null){
            liu=0;
        }
        if(qi==null){
            qi=0;
        }
        if(ba==null){
            ba=0;
        }
        if(jiu==null){
            jiu=0;
        }
        if(shi==null){
            shi=0;
        }
        if(sy==null){
            sy=0;
        }
        if(se==null){
            se=0;
        }

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



    @ResponseBody
    @RequestMapping("queryTotal")
    private  Map<String,Integer> getTotalAssets(String startDate ,String endDate,Integer id){
            Map<String,Integer> map=new HashMap<>();
            //历史最高资产
            Integer total=gClientService.queryTotalassets(id);
            //当前月资产
            Integer Nowtotal=gClientService.queryTotalByNowDate(startDate,endDate,id);
            Integer yemianxianshi=total-Nowtotal;

            map.put("total",yemianxianshi);
            map.put("now",Nowtotal);
            return  map;
    }



    @RequestMapping("queryNowAssets")
    public  String to(Integer pageNo,Integer pageSize,Integer id, Integer ProductClassificationID,Product_list product_list,Model model){
//        if(ProductClassificationID==null){
//            ProductClassificationID=1;
//
//        }
//        if (product_list == null) {
//
//            product_list= new Product_list();
//        }
//        Product_classification_table table=new Product_classification_table(ProductClassificationID,"");
//        product_list.setProductClassificationID(table);
        id=1;
        if(null == pageNo){
            pageNo=1;
        }
        if(null==pageSize){
            pageSize=3;
        }
        PageInfo<Assets> pageInfo =gClientService.queryNowAssetsBycliendId(product_list,id,pageNo,pageSize);
         System.out.println(pageInfo);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("ProductName",product_list.getProductName());
        model.addAttribute("Distributionchannel",product_list.getDistributionchannel());
        model.addAttribute("Incometype",product_list.getIncometype());
        return "gps/zichan";
    }


    @RequestMapping(value = "queryAllAssetsBycliendId",method = RequestMethod.GET)
    public  String queryAllAssetsBycliendId(Product_list product_list,Integer id,Integer pageNo,Integer pageSize,Model model){
        id=1;
        if(null == pageNo){
            pageNo=1;
        }
        if(null==pageSize){
            pageSize=3;
        }
        PageInfo<Assets> pageInfo=gClientService.queryAllAssetsBycliendId(null,id,pageNo,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("ProductName",product_list.getProductName());
        model.addAttribute("Distributionchannel",product_list.getDistributionchannel());
        model.addAttribute("Incometype",product_list.getIncometype());
        return  "gps/zichan";
    }


    //跳转预约信息

    @RequestMapping(value = "toyuyue",method = RequestMethod.GET)
    public  String toyuyue(Integer pageNo, Integer pageSize,Appointment appointment, Client client, Item_sheet item_sheet,Model model,Integer[] arrivalslist,Integer[] appoislist,Integer[] rrstatelist){
        if (appointment==null ){
            appointment=new Appointment();
        }
        if (client==null){
            client=new Client();
        }
        if (item_sheet==null){
            item_sheet=new Item_sheet();
        }

        if(null == pageNo){
            pageNo=1;
        }
        if(null==pageSize){
            pageSize=3;
        }
        if(appoislist!=null && appoislist.length!=0){
            for(int i=0;i<appoislist.length;i++){
                if(appoislist[i].toString()!=""){
                        String a=appoislist[i].toString().replace("[","").trim();
                        String b=a.replace("]","").trim();
                        Integer.parseInt(b);
                    Integer c=Integer.valueOf(b);
                    appoislist[i]=c;
                }

            }  appointment.setAppoislist(null);
            appointment.setAppoislist(Arrays.asList(appoislist));
        }

        if(rrstatelist!=null &&  rrstatelist.length!=0){
            for(int i=0;i<rrstatelist.length;i++){
                if(rrstatelist[i].toString()!=""){
                    String a=rrstatelist[i].toString().replace("[","").trim();
                    String b=a.replace("]","").trim();
                    Integer.parseInt(b);
                    Integer c=Integer.valueOf(b);
                    rrstatelist[i]=c;
                }

            }

            appointment.setRrstatelist(null);
            appointment.setRrstatelist(Arrays.asList(rrstatelist));
        }

        if(arrivalslist!=null &&  arrivalslist.length!=0){
            for(int i=0;i<arrivalslist.length;i++){
                if(arrivalslist[i].toString()!=""){
                    String a=arrivalslist[i].toString().replace("[","").trim();
                    String b=a.replace("]","").trim();
                    Integer.parseInt(b);
                    Integer c=Integer.valueOf(b);
                    arrivalslist[i]=c;
                }

            }
            appointment.setArrivalslist(null);
            appointment.setArrivalslist(Arrays.asList(arrivalslist));
        }
        PageInfo<Appointment> pageInfo=gUserService.queryAllApppointment(pageNo,pageSize,appointment,client,item_sheet);
        model.addAttribute("pageInfo",pageInfo);
        return  "gps/yuyue";
    }




    @RequestMapping(value = "tolianxiren",method = RequestMethod.GET)
    public  String tojingji(Integer id,Model model){
        id=1;
        Contacts contacts=gUserService.selectContacts(id);
        model.addAttribute("Contacts",contacts);
        return "gps/lianxinren";
    }
    @RequestMapping(value = "tojingjiren",method = RequestMethod.GET)
    public  String tojingjiren(){
        return "gps/jingjiguanxi";
    }

    @RequestMapping(value = "toqianzai",method = RequestMethod.GET)
    public  String toqianzai(){
        return "gps/qianzai";
    }




}
