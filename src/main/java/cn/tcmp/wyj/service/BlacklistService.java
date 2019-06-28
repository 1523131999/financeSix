package cn.tcmp.wyj.service;

import cn.tcmp.entity.Blacklist;

import java.util.List;

public interface BlacklistService {
    //查询所有黑名单
    List<Blacklist> queryAllBlickByClient();

}
