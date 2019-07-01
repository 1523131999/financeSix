package cn.tcmp.wyj.dao;

import cn.tcmp.entity.Blacklist;

import java.util.List;

public interface BlacklistMapper {
        //查询所有黑名单
        List<Blacklist> queryAllBlickByClient();




        //添加黑名单备注及客户名称
        Integer addBlacklist(Blacklist  blacklist);
        //修改用户状态
        Integer updateByClientByBlackState(Integer blacklist);




}
