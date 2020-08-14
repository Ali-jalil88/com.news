package com.news.service.impl;

import com.news.entities.Author;
import com.news.exception.DaoException;
import com.news.exception.ServiceException;
import com.news.model.Repository;
import com.news.model.impl.AuthorModel;
import com.news.service.Service;

public class AuthorService implements Service<Author> {

private final Repository<Author> repository = new AuthorModel();

    @Override
    public void create(Author entity)throws ServiceException {
        try {
            repository.insert(entity);
        } catch (DaoException e) {
            throw new ServiceException("author can't add");
        }
    }

    @Override
    public Author read(int id)throws ServiceException {
        try {
            return repository.select(id);
        } catch (DaoException e) {
            throw new ServiceException("author can't add");
        }
    }

    @Override
    public void update(Author entity)throws ServiceException {
        try {
            repository.update(entity);
        } catch (DaoException e) {
            throw new ServiceException("author can't add");
        }

    }

    @Override
    public void delete(Author entity)throws ServiceException {
        try {
            repository.delete(entity);
        } catch (DaoException e) {
            throw new ServiceException("author can't add");
        }

    }
}
