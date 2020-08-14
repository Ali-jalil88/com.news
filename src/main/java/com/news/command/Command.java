package com.news.command;

import com.news.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;

public interface Command {
    Page page = new Page("/html/login.jsp", true);

    Page execute(HttpServletRequest req)throws ServiceException;

}
