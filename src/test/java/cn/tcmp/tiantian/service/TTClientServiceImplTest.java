package cn.tcmp.tiantian.service;

import cn.tcmp.entity.Client;
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
public class TTClientServiceImplTest {

    @Autowired
    private TTClientService service;
    @Test
    public void addClient() {
        Client client = new Client();
        service.addClient(client);
    }

    @Test
    public void addcontacts() {
    }

    @Test
    public void addjigouClient() {
    }

    @Test
    public void querygerenAll() {
        PageInfo<Client> clientPageInfo = service.querygerenAll(4, 1, new Client());
        for (Client client : clientPageInfo.getList()) {
            System.out.println(client);
        }
    }
}