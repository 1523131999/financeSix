package cn.tcmp.ymy.service;

import cn.tcmp.entity.Client;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ClientService {
    PageInfo<Client> queryAll(Client client,Integer pageSize,Integer pageNum,String startTime,String endTime);
    Integer queryClientByFour(Client client);
}
