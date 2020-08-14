package com.news.command;

import com.news.entities.Author;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.AuthorService;

import javax.servlet.http.HttpServletRequest;

public class ReadAuthor implements Command {
    private final Service<Author> service = new AuthorService();
    @Override
    public Page execute(HttpServletRequest req)throws ServiceException {
        Author author =service.read(1);
        System.out.println(author);
        return null;
    }
}
