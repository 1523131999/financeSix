package cn.tcmp.gps.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GClientServiceImplTest {

    @Autowired
    private  GClientService gClientService;

    @Test
    public void queryTotalByDate() {
        Integer yi= gClientService.queryTotalByDate("2019-01-01","2019-01-30",1);
        System.out.println(yi);

    }
}