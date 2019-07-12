package cn.tcmp.wyj.service;

import cn.tcmp.entity.Blacklist;
import cn.tcmp.entity.Client;
import cn.tcmp.wyj.dao.BlacklistMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlacklistServiceImpl implements BlacklistService {

    @Autowired
    private BlacklistMapper blacklistMapper;

    //分页

    @Override
    public PageInfo<Blacklist> queryAllBlick( Blacklist blacklist,Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Blacklist> list=blacklistMapper.queryAllBlickByClient(blacklist);
        PageInfo<Blacklist> pageInfo=new PageInfo<>(list);

        return pageInfo;
    }

    @Override
    public Integer updateByClientByBlackState(Integer blacklist) {
        return blacklistMapper.updateByClientByBlackState(blacklist);
    }

    @Override
    public Integer queryBlickId(Integer clientid) {
        return blacklistMapper.queryBlickId(clientid);
    }

    @Override
    public Integer upBlacklist(Blacklist blacklist) {
        return blacklistMapper.upBlacklist(blacklist);
    }


    @Override
    public Client queryBlickCName(Integer id) {
        return blacklistMapper.queryBlickCName(id);
    }

    @Override
    public Blacklist queryByid(Integer blackid) {
        return blacklistMapper.queryByid(blackid);
    }


}
