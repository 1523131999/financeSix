package cn.tcmp.ymy.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Brokeragerelations;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import com.github.pagehelper.Page;
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
    PageInfo<Client> queryAdd(Client client,Integer pageNum,Integer pageSize);
    PageInfo<Brokeragerelations> queryBroke(Brokeragerelations brokeragerelations,String startDate,String endDate,Integer pageSize,Integer pgaeNum);
    Client queryFour(Client client);
    Integer addBro(Brokeragerelations brokeragerelations);
    PageInfo<Brokeragerelations> queryByBro(Brokeragerelations brokeragerelations,String startDate,String endDate,Integer pageSize,Integer pageNum);
    Integer updateStatus(Brokeragerelations brokeragerelations);
    Brokeragerelations detailBro(Integer id);

}
