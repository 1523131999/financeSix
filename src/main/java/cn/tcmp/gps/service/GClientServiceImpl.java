package cn.tcmp.gps.service;

import cn.tcmp.entity.Assets;
import cn.tcmp.entity.Assetsrecord;
import cn.tcmp.entity.Client;
import cn.tcmp.gps.dao.GClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GClientServiceImpl implements GClientService {
    @Autowired
    private GClientMapper gClientMapper;


    @Override
    public Client query(Integer id) {
        return gClientMapper.query(id);
    }

    @Override
    public List<Assetsrecord> queryAllByClientId(Integer id) {
        return gClientMapper.queryAllByClientId(id);
    }

    @Override
    public Integer queryTotalByDate(String startDate, String endDate, Integer id) {
        return gClientMapper.queryTotalByDate(startDate,endDate,id);
    }

    @Override
    public List<Assets> queryAllAssets(Integer id) {
        return gClientMapper.queryAllAssets(id);
    }

}
