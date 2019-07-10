package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;

import java.util.List;

public interface GUserService {

    //查询全部预约信息
    List<Appointment> queryAllApppointment();

}
