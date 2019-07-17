package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.gps.dao.GUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GUserServiceImpl implements GUserService {
    @Autowired
    private GUserMapper gUserMapper;


    @Override
    public PageInfo<Appointment> queryAllApppointment(Integer pageNo, Integer pageSize,Appointment appointment, Client client, Item_sheet item_sheet) {
        PageHelper.startPage(pageNo,pageSize);
        List<Appointment>  list=gUserMapper.queryAllApppointment(appointment,client,item_sheet);
        PageInfo<Appointment> pageInfo=new PageInfo<>(list);
        return  pageInfo;


    }

    @Override
    public Contacts selectContacts(Integer id) {
        return gUserMapper.selectContacts(id);
    }

    @Override
    public Integer insertAppointment(Appointment appointment) {
        return gUserMapper.insertAppointment(appointment);
    }
}
