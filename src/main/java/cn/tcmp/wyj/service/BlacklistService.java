package cn.tcmp.wyj.service;

import cn.tcmp.entity.Blacklist;
import cn.tcmp.entity.Client;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BlacklistService {

    //  查询 //分页
    PageInfo<Blacklist> queryAllBlick(Blacklist blacklist,Integer pageNo, Integer pageSize);
    //修改用户状态
    Integer updateByClientByBlackState(Integer blacklist);
    //查详情
    Integer queryBlickId(Integer clientid);
    //添加黑名单备注及客户名称
    Integer upBlacklist(Blacklist  blacklist);
    //查黑名单客户名称
    Client queryBlickCName(Integer id);

    //查blacklist的id详情
    Blacklist queryByid(Integer blackid);


}
