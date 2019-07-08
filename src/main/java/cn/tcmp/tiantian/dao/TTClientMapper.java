package cn.tcmp.tiantian.dao;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TTClientMapper {

    //创建潜在客户
    Integer addClient(Client client);
    //创建联系电话
    Integer addcontacts(Contacts contacts );

    //创建潜在客户
    Integer addjigouClient(Client client);

    //查询个人客户
    List<Client> querygerenAll();

}
