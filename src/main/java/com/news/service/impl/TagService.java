package com.news.service.impl;

import com.news.entities.Tag;
import com.news.exception.DaoException;
import com.news.exception.ServiceException;
import com.news.model.Repository;
import com.news.model.impl.TagModel;
import com.news.service.Service;

import java.util.List;

public class TagService implements Service<Tag> {
    private final TagModel repository = new TagModel();

    @Override
    public void create(Tag entity) throws ServiceException {
        try {
            repository.insert(entity);
        } catch (DaoException e) {
            throw new ServiceException("tag can't add");
        }

    }

    @Override
    public Tag read(int id) throws ServiceException {
        try {
            return repository.select(1);
        } catch (DaoException e) {
            throw new ServiceException("tag can't add");
        }
    }

    public List<Tag> readByNewsId(int id) throws ServiceException {
        try {
            return repository.selectByNewsId(id);
        } catch (DaoException e) {
            throw new ServiceException("tag can't find");
        }
    }

    @Override
    public void update(Tag entity) throws ServiceException {
        try {
            repository.update(entity);
        } catch (DaoException e) {
            throw new ServiceException("tag can't add");
        }

    }

    @Override
    public void delete(Tag entity) throws ServiceException {
        try {
            repository.delete(entity);
        } catch (DaoException e) {
            throw new ServiceException("tag can't add");
        }

    }
}
