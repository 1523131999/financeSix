package cn.tcmp.ymy.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ClientService {
    PageInfo<Client> queryAll(Client client, Integer pageSize, Integer pageNum, String startTime, String endTime);
    Integer queryClientByFour(Client client);
    PageInfo<Secondarymanager> queryCiYao(Secondarymanager secondarymanager,Integer pageSize,Integer pageNum);
    Appointment queryAppoint(Integer id);
    Integer delete(Integer id);
    PageInfo<Client> queryAllFact(Client client,Integer pageSize,Integer pageNum);
    Client detail(Integer id);
    Integer update(Client client);
    public  Integer insertmanage(Secondarymanager secondarymanager);
    Integer updateManager(@Param("id") Integer id, @Param("fmid") Integer fmid);
}
