package cn.tcmp.gps.service;

import cn.tcmp.entity.Appointment;
import cn.tcmp.gps.dao.GUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GUserServiceImpl implements GUserService {
    @Autowired
    private GUserMapper gUserMapper;


    @Override
    public List<Appointment> queryAllApppointment() {
        return gUserMapper.queryAllApppointment();
    }
}
