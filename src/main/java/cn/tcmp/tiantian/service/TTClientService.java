package cn.tcmp.tiantian.service;

import cn.tcmp.entity.Cert;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTClientService {
    //创建潜在客户
    Integer addClient(Client client);
    //创建联系电话
    Integer addcontacts(Contacts contacts );
    //创建机构客户
    Integer addjigouClient(Client client);
    //查询个人客户
    PageInfo<Client> querygerenAll(Integer pagesize, Integer pagenum, Client client);
    //证件查询
    List<Cert> queryCertAll(Cert cert);
}
