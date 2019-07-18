package cn.tcmp.gps.dao;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import cn.tcmp.entity.Item_sheet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GUserMapper {

    //查询全部预约信息
    List<Appointment> queryAllApppointment(@Param("appointment") Appointment appointment,@Param("client") Client client , @Param("item") Item_sheet item_sheet);
    //查询客户联系人
    Contacts selectContacts(Integer id);
    //增加客户预约信息
    Integer insertAppointment(Appointment appointment);




}
