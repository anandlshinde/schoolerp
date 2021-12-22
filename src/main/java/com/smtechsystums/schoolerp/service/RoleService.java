package com.smtechsystums.schoolerp.service;

import com.smtechsystums.schoolerp.entity.Role;

import java.util.List;

public interface RoleService {

    Role saveRole(Role role);

    Role updateRole(Role role,Long roleId);

    List<Role> getRoles();

    Role getRole(Long roleId);

}
