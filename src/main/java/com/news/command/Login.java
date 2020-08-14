package com.news.command;

import com.news.entities.User;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.UserService;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {
    private final UserService service = new UserService();
    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        System.out.println("from login command");
        String login = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(login);
        System.out.println(password);
        User user= service.createByLogin(login,password);
        if (user == null){
            System.out.println("not authorized");
        }else {
            System.out.println("authorized");
        }
        return null;
    }
}
