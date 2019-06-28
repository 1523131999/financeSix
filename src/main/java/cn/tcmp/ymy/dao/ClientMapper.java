package cn.tcmp.ymy.dao;

import cn.tcmp.entity.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientMapper {
    List<Client> queryAll(@Param("client") Client client,@Param("startTime")String starTime,@Param("endTime")String endTime);
}
