package com.news.command;

import com.news.entities.News;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.NewsService;

import javax.servlet.http.HttpServletRequest;

public class UpdateNews implements Command {
    private final Service<News> service = new NewsService();
    @Override
    public Page execute(HttpServletRequest req)throws ServiceException {
        News news = new News();
        news.setId(1);
        news.setTitle("As Trump test 1");
        news.setShortText("As the pandemic worsens");
        news.setFullText("leading America much as its pandemic worsens");
        service.update(news);
        return null;
    }
}
