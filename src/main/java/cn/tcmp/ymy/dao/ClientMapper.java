package cn.tcmp.ymy.dao;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import org.apache.ibatis.annotations.Param;

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
}
