package com.smtechsystums.schoolerp.service;

import com.smtechsystums.schoolerp.entity.Staff;

import java.util.List;

public interface StaffService {

    Staff registerStaff(Staff staff);

    Staff updateStaffData(Staff staff,Long staffId);

    List<Staff> getStaffs();

    Staff getStaffData(Long staffId);
}
