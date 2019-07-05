package cn.tcmp.gps.service;

import cn.tcmp.entity.Assets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

    @Test
    public void query() {
    }

    @Test
    public void queryAllByClientId() {
    }

    @Test
    public void queryAllAssets() {
        List<Assets> s=gClientService.queryAllAssets(1);
        for (Assets assetsVO : s) {
            System.out.println(assetsVO.getPruduct().getItemID().getItemtypeID());
        }

    }
}