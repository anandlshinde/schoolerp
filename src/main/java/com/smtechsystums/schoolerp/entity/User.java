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
@Table(name="tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @OneToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name="tbl_user_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Collection<Role> roles;

    private LocalDate createdDate;

    private String createdBy;
    private LocalDate updatedDate;
    private String updatedBy;
    private int failedLoginCount;
    private Boolean isDisable;
    private Boolean loggedIn;

    public Staff getStaff() {
        return staff;
    }

    public School getSchool() {
        return school;
    }
}
