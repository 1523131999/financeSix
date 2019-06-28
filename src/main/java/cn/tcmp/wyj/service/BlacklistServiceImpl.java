package cn.tcmp.wyj.service;

import cn.tcmp.entity.Blacklist;
import cn.tcmp.wyj.dao.BlacklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlacklistServiceImpl implements BlacklistService {

    @Autowired
    private BlacklistMapper blacklistMapper;

    @Override
    public List<Blacklist> queryAllBlickByClient() {
        return blacklistMapper.queryAllBlickByClient();
    }
}
