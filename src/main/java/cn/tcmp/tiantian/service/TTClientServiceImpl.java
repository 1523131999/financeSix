package cn.tcmp.tiantian.service;

import cn.tcmp.entity.Cert;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import cn.tcmp.entity.Secondarymanager;
import cn.tcmp.tiantian.dao.TTClientMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTClientServiceImpl implements TTClientService {

    @Autowired
    private TTClientMapper clientMapper;

    @Override
    public Integer addClient(Client client) {
        return clientMapper.addClient(client);
    }

    @Override
    public Integer addcontacts(Contacts contacts) {
        return clientMapper.addcontacts(contacts);
    }

    @Override
    public Integer addjigouClient(Client client) {
        return clientMapper.addjigouClient(client);
    }

    @Override
    public PageInfo<Client> querygerenAll(Integer pageSize, Integer pageNum,Client client) {
        PageHelper.startPage(pageNum,pageSize);
        List<Client> list=clientMapper.querygerenAll(client);
        PageInfo<Client> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Cert> queryCertAll(Cert cert) {
        return clientMapper.queryCertAll(cert);
    }

    @Override
    public PageInfo<Client> queryjigouAll(Integer pageSize, Integer pageNum, Client client) {
        PageHelper.startPage(pageNum,pageSize);
        List<Client> clients = clientMapper.queryjigouAll(client);
        PageInfo<Client> pageInfo1=new PageInfo<>(clients);
        return pageInfo1;
    }

    @Override
    public List<Contacts> queryContactsAll(Contacts contacts) {
        return clientMapper.queryContactsAll(contacts);
    }

    @Override
    public Client detailByclient(Integer id) {
        return clientMapper.detailByclient(id);
    }

    @Override
    public Integer updateClient(Client client) {
        return clientMapper.updateClient(client);
    }


}
