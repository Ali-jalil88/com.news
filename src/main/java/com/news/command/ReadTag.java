package com.news.command;

import com.news.entities.Tag;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.TagService;

import javax.servlet.http.HttpServletRequest;

public class ReadTag implements Command {
    private final Service<Tag> service = new TagService();
    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        Tag tag = service.read(1);
        System.out.println(tag);
        return null;
    }
}
