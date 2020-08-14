package com.news.command;

import com.news.entities.User;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.UserService;

import javax.servlet.http.HttpServletRequest;

public class CreateUser implements Command {
    private final Service<User> service = new UserService();

    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        User user = new User();
       String name = req.getParameter("name");
       String last_name = req.getParameter("last_name");
       String login = req.getParameter("login");
       String password = req.getParameter("pass");
       String email = req.getParameter("email");
        user.setName(name);
        user.setLastName(last_name);
        user.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);
        service.create(user);
        return null;

    }
}
