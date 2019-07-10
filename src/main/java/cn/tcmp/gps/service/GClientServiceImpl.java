package cn.tcmp.gps.service;

import cn.tcmp.entity.Assets;
import cn.tcmp.entity.Assetsrecord;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Product_list;
import cn.tcmp.gps.dao.GClientMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
    public Integer queryTotalassets(Integer id) {
        return gClientMapper.queryTotalassets(id);
    }

    @Override
    public Integer queryTotalByNowDate(String startDate, String endDate, Integer id) {
        return gClientMapper.queryTotalByNowDate(startDate,endDate,id);
    }

    @Override
    public PageInfo<Assets> queryNowAssetsBycliendId(Product_list product_list, Integer id,Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo ,pageSize);
        List<Assets>list=gClientMapper.queryNowAssetsBycliendId(product_list,id);
        PageInfo<Assets> pageInfo=new PageInfo<>(list);
        return  pageInfo;
    }

    @Override
    public  PageInfo<Assets> queryAllAssetsBycliendId(Product_list product_list, Integer id,Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo ,pageSize);
        List<Assets>list=gClientMapper.queryAllAssetsBycliendId(product_list,id);
        PageInfo<Assets> pageInfo=new PageInfo<>(list);
        return  pageInfo;
    }


}
