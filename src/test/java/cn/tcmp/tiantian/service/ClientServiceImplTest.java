package cn.tcmp.tiantian.service;

import cn.tcmp.entity.Client;
import cn.tcmp.entity.Contacts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {

    @Autowired
    private TTClientService service;

    @Test
    public void addClient() {
        Integer integer = service.addClient(new Client());
        System.out.println(integer);
    }

    @Test
    public void addcontacts() {
        Integer addcontacts = service.addcontacts(new Contacts());
        System.out.println(addcontacts);
    }
}