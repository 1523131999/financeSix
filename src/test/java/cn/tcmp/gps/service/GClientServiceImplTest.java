package cn.tcmp.gps.service;

import cn.tcmp.entity.Assets;
import cn.tcmp.entity.Product_list;
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



    @Test
    public void queryAllAssetsBycliendId() {
    }

    @Test
    public void queryNowAssetsBycliendId() {
        Product_list product_list=new Product_list();
        product_list.setIncometype("固定收益");
        product_list.setProductName("货币基金");
        System.out.println(gClientService.queryNowAssetsBycliendId(product_list,1,1,3));
    }
}