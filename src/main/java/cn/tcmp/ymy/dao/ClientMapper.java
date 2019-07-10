package cn.tcmp.ymy.dao;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Brokeragerelations;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ClientMapper {
    //查看所有已认领客户
    List<Client> queryAll(@Param("client") Client client,@Param("startTime")String starTime,@Param("endTime")String endTime);
    //查询要认领的客户
   Client queryClientByFour(Client client);
    //修改客户经理状态
    Integer updateManager(@Param("id") Integer id,@Param("fmid") Integer fmid);
    //查询用户次要关系
    List<Secondarymanager> queryCiYao(Secondarymanager secondarymanager);
    //查询客户是否有预约存在
    Appointment queryAppoint(Integer id);
    //删除经纪关系
    @Delete("delete from Secondarymanager where smid=#{id}")
    Integer delete(Integer id);
    //查询是事实客户的列表
    List<Client> queryAllFact(Client client);
    //单独查询事实客户
    Client detail(Integer id);
    //修改经理
    @Update("update client set fmid=#{fmid} where clientid=#{clientid}")
    Integer update(Client client);
    @Insert("insert into secondarymanager values(null,1,#{managerid},#{client.clientid},#{addresason},#{mianmanage})")
    public  Integer insertmanage(Secondarymanager secondarymanager);
    //查询用户 作为主要经理的客户
   List<Client> queryAdd(Client client);
   //查询经纪更改信息
    List<Brokeragerelations> queryBroke(@Param("bro") Brokeragerelations brokeragerelations,@Param("startDate")String startDate,@Param("endDate")String endDate);
    @Insert("insert into brokeragerelations values(null,#{submissiondate},#{client.clientid},#{Initiator},'原理财经理',1,null)")
    Integer addBro(Brokeragerelations brokeragerelations);
}
