package cn.tcmp.gps.service;

import cn.tcmp.entity.Client;
import cn.tcmp.gps.dao.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;


    @Override
    public Client query(Integer id) {
        return clientMapper.query(id);
    }
}
