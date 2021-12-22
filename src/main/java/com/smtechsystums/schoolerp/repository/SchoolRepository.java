package com.smtechsystums.schoolerp.repository;

import com.smtechsystums.schoolerp.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface SchoolRepository extends JpaRepository<School, Serializable> {
}
