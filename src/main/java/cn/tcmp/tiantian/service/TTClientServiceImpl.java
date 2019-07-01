package cn.tcmp.tiantian.service;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import cn.tcmp.tiantian.dao.TTClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
