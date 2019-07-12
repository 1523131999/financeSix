package cn.tcmp.ymy.service;

import cn.tcmp.entity.Cert;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClientServiceImplTest {
        @Autowired
        private ClientService service;
    @Test
    public void queryCiYao() {
        Secondarymanager secondarymanager=new Secondarymanager();
        Cert cert=new Cert();
        Client client=new Client();
        secondarymanager.setClient(client);

    }

    @Test
    public void queryAdd() {
        Client client=new Client();
        client.setFmid(1);
        Cert cert=new Cert();
        client.setCert(cert);
       PageInfo<Client>list=service.queryAdd(client,1,3);
        for (Client client1 : list.getList()) {
            System.out.println(client1);
        }
    }
}