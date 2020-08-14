package com.news.command;

import com.news.entities.Author;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.AuthorService;

import javax.servlet.http.HttpServletRequest;

public class UpdateAuthor implements Command {
    private final Service<Author>  service= new AuthorService();

    @Override
    public Page execute(HttpServletRequest req)throws ServiceException {
        Author author = new Author();
        author.setId(2);
        author.setName("ali1");
        author.setLastName("hassans");
        service.update(author);
        return null;
    }
}
