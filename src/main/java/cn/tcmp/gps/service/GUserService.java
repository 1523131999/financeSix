package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Item_sheet;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GUserService {

    //查询全部预约信息
    PageInfo<Appointment> queryAllApppointment(Integer pageNo, Integer pageSize, Appointment appointment, Client client, Item_sheet item_sheet);

}
