package nlu.cdw_2023_backend.service;

import nlu.cdw_2023_backend.dao.RoleDao;
import nlu.cdw_2023_backend.entity.Role;
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
