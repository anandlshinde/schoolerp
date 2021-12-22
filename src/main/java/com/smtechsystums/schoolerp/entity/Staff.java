package com.smtechsystums.schoolerp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String streetAddress;
    private String city;
    private int pincode;
    private String mobileNo;
    private String secondaryContactPerson;
    private String getSecondaryContactNo;
    private String email;
    private LocalDate joinDate;
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public School getSchool() {
        return school;
    }

}
