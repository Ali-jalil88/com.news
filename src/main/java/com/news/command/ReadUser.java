package com.news.command;

import com.news.entities.User;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.UserService;

import javax.servlet.http.HttpServletRequest;

public class ReadUser implements Command {
    private final Service<User> service = new UserService();
    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        User user = service.read(1);
        System.out.println(user);
        return null;

    }
}
