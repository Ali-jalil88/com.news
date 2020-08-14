package com.news.command;

import com.news.entities.News;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.NewsService;

import javax.servlet.http.HttpServletRequest;

public class ReadNews implements Command {
    private final Service<News> service = new NewsService();
    @Override
    public Page execute(HttpServletRequest req)throws ServiceException {
        News news = service.read(2);
        System.out.println(news);
        return null;
    }
}
