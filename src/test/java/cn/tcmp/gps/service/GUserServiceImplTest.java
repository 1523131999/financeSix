package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GUserServiceImplTest {

    @Autowired
    private  GUserService gUserService;

    @Test
    public void queryAllApppointment() {
        List<Appointment> list=gUserService.queryAllApppointment();
        for (Appointment appointment : list) {
            System.out.println(appointment);
        }
    }
}