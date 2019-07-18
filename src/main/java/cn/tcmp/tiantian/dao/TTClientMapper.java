package cn.tcmp.tiantian.dao;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Cert;
import cn.tcmp.entity.Contacts;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TTClientMapper {

    //创建潜在客户
    Integer addClient(Client client);
    //创建联系电话
    Integer addcontacts(Contacts contacts );
    //创建机构客户
    Integer addjigouClient(Client client);
    //查询个人客户
    List<Client> querygerenAll(@Param("client") Client client);
    //证件查询
    List<Cert> queryCertAll(@Param("cert")Cert cert);
    //查询机构客户
    List<Client> queryjigouAll(@Param("client") Client client);
    //联系人查询
    List<Contacts> queryContactsAll(Contacts contacts);
    //查询个人客户详情信息
    Client detailByclient(Integer id);
    //修改个人信息
    Integer updateClient(Client client);


}
