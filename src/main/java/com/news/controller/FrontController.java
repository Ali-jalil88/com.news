package com.news.controller;

import com.news.command.Command;
import com.news.command.CommandFactory;
import com.news.command.Page;
import com.news.exception.ServiceException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doWork(req, resp);
        System.out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doWork(req, resp);
        System.out.println("post");
    }

    private void doWork(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("lkjgkl");
        String value = req.getParameter("command");
        System.out.println(value);
        Command command = CommandFactory.createCommand(value);
        try {
            Page page =  command.execute(req);
            if (page.isRedirect()){
                redirect(page.getUrl(),req,resp);
            }else {
                forward(page.getUrl(),req,resp);
            }
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
    public void forward(String url, HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException{
        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher(url);
        rd.forward(req,resp);
    }
    public void redirect(String url, HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        resp.sendRedirect(req.getContextPath() + url);
    }

}