package com.news.command;

import com.news.entities.Author;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.AuthorService;

import javax.servlet.http.HttpServletRequest;

public class CreateAuthor implements Command {

    private final Service<Author> service = new AuthorService();

    @Override
    public Page execute(HttpServletRequest req)throws ServiceException {
        Author author = new Author();
        String name = req.getParameter("user");
        author.setLastName(name);
        author.setName(name);
        service.create(author);
        return null;
    }

}
