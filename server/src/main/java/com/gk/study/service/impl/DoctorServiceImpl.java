package com.gk.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.study.entity.Doctor;
import com.gk.study.mapper.DoctorMapper;
import com.gk.study.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {
    @Autowired
    DoctorMapper mapper;

    @Override
    public List<Doctor> getDoctorList() {
        return mapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void createDoctor(Doctor doctor) {
        System.out.println(doctor);
        mapper.insert(doctor);
    }

    @Override
    public void deleteDoctor(String id) {
        mapper.deleteById(id);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        mapper.updateById(doctor);
    }
}
