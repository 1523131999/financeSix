package cn.tcmp.ymy.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import com.github.pagehelper.PageInfo;


import java.util.List;

public interface ClientService {
    PageInfo<Client> queryAll(Client client, Integer pageSize, Integer pageNum, String startTime, String endTime);
    Integer queryClientByFour(Client client);
    PageInfo<Secondarymanager> queryCiYao(Secondarymanager secondarymanager,Integer pageSize,Integer pageNum);
    Appointment queryAppoint(Integer id);
    Integer delete(Integer id);

}
