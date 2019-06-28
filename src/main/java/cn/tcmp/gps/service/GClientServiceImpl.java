package cn.tcmp.gps.service;

import cn.tcmp.entity.Client;
import cn.tcmp.gps.dao.GClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GClientServiceImpl implements GClientService {
    @Autowired
    private GClientMapper clientMapper;


    @Override
    public Client query(Integer id) {
        return clientMapper.query(id);
    }
}
