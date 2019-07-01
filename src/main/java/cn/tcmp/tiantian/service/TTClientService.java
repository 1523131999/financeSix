package cn.tcmp.tiantian.service;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;

public interface TTClientService {
    //创建潜在客户
    Integer addClient(Client client);
    //创建联系电话
    Integer addcontacts(Contacts contacts );
}
