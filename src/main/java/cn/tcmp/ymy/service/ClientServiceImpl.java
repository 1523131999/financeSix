package cn.tcmp.ymy.service;

import cn.tcmp.entity.Client;
import cn.tcmp.ymy.dao.ClientMapper;
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
        List<Client> list=mapper.queryAll(client,startTime,endTime);

        PageInfo<Client> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}
