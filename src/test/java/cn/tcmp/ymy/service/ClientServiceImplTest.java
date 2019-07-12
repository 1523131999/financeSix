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
    public void queryAll() {
        Client client = new Client();
        PageInfo<Client> clientPageInfo = service.queryAllFact(client, 1, 2);

    }
}