package cn.tcmp.ymy.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.entity.Brokeragerelations;
import cn.tcmp.entity.Client;
import cn.tcmp.entity.Secondarymanager;
import cn.tcmp.ymy.dao.ClientMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Resource
    private ClientMapper mapper;

    @Override
    public PageInfo<Client> queryAll(Client client,Integer pageSize,Integer pageNum,String startTime,String endTime) {
        PageHelper.startPage(pageNum,pageSize);
        System.out.println(client);
        List<Client> list=mapper.queryAll(client,startTime,endTime);

        PageInfo<Client> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer queryClientByFour(Client client) {
        Client client1=mapper.queryClientByFour(client);
        Integer status=1;
        if (client1 == null) {
                status=2;
                return status;
        }
        if (client1.getFmid() != null) {
            status=3;
            return status;
        }
        mapper.updateManager(client1.getClientid(),1);
        return status;
    }

    @Override
    public PageInfo<Secondarymanager> queryCiYao(Secondarymanager secondarymanager, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
                            List<Secondarymanager> list=mapper.queryCiYao(secondarymanager);
        PageInfo<Secondarymanager> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Appointment queryAppoint(Integer id) {


        return mapper.queryAppoint(id);
    }

    @Override
    public Integer delete(Integer id) {
        return mapper.delete(id);
    }

    @Override
    public PageInfo<Client> queryAllFact(Client client, Integer pageSize, Integer pageNum) {
            PageHelper.startPage(pageNum,pageSize);
            List<Client> list=mapper.queryAllFact(client);
            PageInfo<Client> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Client detail(Integer id) {

        return mapper.detail(id);
    }

    @Override
    public Integer update(Client client) {
        return mapper.update(client);
    }

    @Override
    public Integer insertmanage(Secondarymanager secondarymanager) {
        return mapper.insertmanage(secondarymanager);
    }

    @Override
    public Integer updateManager(Integer id, Integer fmid) {
        return mapper.updateManager(id,fmid);
    }

    @Override
    public PageInfo<Client> queryAdd(Client client,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Client> list=mapper.queryAdd(client);
        PageInfo<Client> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Brokeragerelations> queryBroke(Brokeragerelations brokeragerelations, String startDate, String endDate,Integer pageSize,Integer pgaeNum) {
        PageHelper.startPage(pgaeNum,pageSize);
        List<Brokeragerelations> list=mapper.queryBroke(brokeragerelations,startDate,endDate);
        PageInfo<Brokeragerelations> pageinfo=new PageInfo<>(list);
        return pageinfo;
    }

    @Override
    public Client queryFour(Client client) {
        return mapper.queryClientByFour(client);
    }

    @Override
    public Integer addBro(Brokeragerelations brokeragerelations) {
        return mapper.addBro(brokeragerelations);
    }

    @Override
    public PageInfo<Brokeragerelations> queryByBro(Brokeragerelations brokeragerelations, String startDate, String endDate, Integer pageSize, Integer pageNum) {
       PageHelper.startPage(pageNum,pageSize);
        List<Brokeragerelations> list=mapper.queryByBro(brokeragerelations,startDate,endDate);
        PageInfo<Brokeragerelations> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer updateStatus(Brokeragerelations brokeragerelations) {
        return mapper.updateStatus(brokeragerelations);
    }


}
