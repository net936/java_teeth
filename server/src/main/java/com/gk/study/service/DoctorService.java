package com.gk.study.service;



import com.gk.study.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctorList();
    void createDoctor(Doctor doctor);
    void deleteDoctor(String id);

    void updateDoctor(Doctor doctor);
}
