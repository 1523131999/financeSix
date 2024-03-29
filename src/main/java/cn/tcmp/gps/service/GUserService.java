package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import cn.tcmp.entity.Item_sheet;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GUserService {

    //查询全部预约信息
    PageInfo<Appointment> queryAllApppointment(Integer pageNo, Integer pageSize, Appointment appointment, Client client, Item_sheet item_sheet);
    //查询客户联系人
    Contacts selectContacts(Integer id);
    //增加客户预约信息
    Integer insertAppointment(Appointment appointment);

}
