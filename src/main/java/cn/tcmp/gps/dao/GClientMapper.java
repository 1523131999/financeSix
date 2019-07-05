package cn.tcmp.gps.dao;

import cn.tcmp.entity.Assets;
import cn.tcmp.entity.Assetsrecord;
import cn.tcmp.entity.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GClientMapper {

    //查询客户详细
    Client query(Integer id);
    //查询客户资产变动信息
    List<Assetsrecord> queryAllByClientId(Integer id);
    //查询客户资产总额变动信息（主页折现图）
    Integer queryTotalByDate(@Param("startDate") String startDate,@Param("endDate") String endDate , @Param("clientid") Integer id);
    //查询客户产品类型
    List<Assets>  queryAllAssets(Integer id);
    //查询到历史最高资产
    Integer  queryTotalassets(Integer id);
    //查询到当前月最高资产
    Integer queryTotalByNowDate(@Param("startDate") String startDate,@Param("endDate") String endDate , @Param("clientid") Integer id);



}
