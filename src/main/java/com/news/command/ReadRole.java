package com.news.command;

import com.news.entities.Role;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.RoleService;

import javax.servlet.http.HttpServletRequest;

public class ReadRole implements Command {
    private final Service<Role> service = new RoleService();
    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        Role role = service.read(3);
        System.out.println(role);
        return null;
    }
}
