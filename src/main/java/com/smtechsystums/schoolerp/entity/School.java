package com.smtechsystums.schoolerp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String santhaName;
    private String registrationNo;
    private String streetAddress;
    private String city;
    private int pincode;
    private String teleNo;
    private String mobileNo;
    private int establishmentYear;
    private String chairPersonName;
    private Boolean isActive;
    private LocalDate enrollDate;
    private LocalDate getEnrollEndDate;



}
