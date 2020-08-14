package com.news.command;

import com.news.entities.Role;
import com.news.entities.User;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.RoleService;

import javax.servlet.http.HttpServletRequest;

public class CreateRole implements Command {
    private final Service<Role> service = new RoleService();
    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        Role role = new Role();
        role.setRole("admin");
        role.setId(3);
        service.create(role);
        return null;
    }
}
