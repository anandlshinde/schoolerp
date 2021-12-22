package com.smtechsystums.schoolerp.service;

import com.smtechsystums.schoolerp.entity.School;

public interface SchoolService {

    School registerSchool(School school);

    School updateSchoolData(School school);

    School getSchoolData(Long schoolId);

}
