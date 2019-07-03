package cn.tcmp.gps.service;

import cn.tcmp.entity.Assets;
import cn.tcmp.entity.Assetsrecord;
import cn.tcmp.entity.Client;

import java.util.List;

public interface GClientService {

    //查询客户详细
    Client query(Integer id);
    //查询客户资产变动信息
    List<Assetsrecord> queryAllByClientId(Integer id);
    //查询客户资产总额变动信息（主页折现图）
    Integer queryTotalByDate( String startDate, String endDate ,  Integer id);

    List<Assets>  queryAllAssets(Integer id);
}
