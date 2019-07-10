package cn.tcmp.gps.dao;

import cn.tcmp.entity.Appointment;

import java.util.List;

public interface GUserMapper {

    //查询全部预约信息
    List<Appointment> queryAllApppointment();

}
