package com.arfaoui.alemni.service;

import com.arfaoui.alemni.dao.RoleDao;
import com.arfaoui.alemni.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
