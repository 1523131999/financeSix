package cn.tcmp.wyj.dao;

import cn.tcmp.entity.Blacklist;
import cn.tcmp.entity.Client;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlacklistMapper {
        //查询所有黑名单
        List<Blacklist> queryAllBlickByClient(Blacklist blacklist);
        //添加黑名单备注及客户名称
        Integer upBlacklist(Blacklist  blacklist);
        //修改用户状态
        Integer updateByClientByBlackState(Integer blacklist);
        //查黑名单客户状态详情
        Integer queryBlickId(Integer clientid);
        //查黑名单客户名称
        Client queryBlickCName(Integer id);
        //查blacklist的id详情
        @Select(" SELECT * FROM  blacklist WHERE blackid=#{blackid}")
        Blacklist queryByid(Integer blackid);





}
