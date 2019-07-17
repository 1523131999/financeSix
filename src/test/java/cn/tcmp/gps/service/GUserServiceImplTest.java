package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import cn.tcmp.entity.Item_sheet;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GUserServiceImplTest {

    @Autowired
    private  GUserService gUserService;

    @Test
    public void queryAllApppointment() {
        Appointment appointment1=new Appointment();
        List<Integer> list=new ArrayList<>();
            list.add(1);
        appointment1.setRrstatelist(list);
        Client client=new Client();
        client.setClientName("张飞日");
        Item_sheet item_sheet=new Item_sheet();

        PageInfo<Appointment> pageInfo=gUserService.queryAllApppointment(1,3,appointment1,client,item_sheet);
        for (Appointment appointment : pageInfo.getList()) {
            System.out.println(appointment);
        }
    }

    @Test
    public void queryAllApppointment1() {
    }

    @Test
    public void selectContacts() {
        Contacts contacts=gUserService.selectContacts(1);
        System.out.println(contacts);


    }

    @Test
    public void insertAppointment() {


    }
}