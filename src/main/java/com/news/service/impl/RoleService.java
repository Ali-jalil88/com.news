package com.news.service.impl;

import com.news.entities.Role;
import com.news.exception.DaoException;
import com.news.exception.ServiceException;
import com.news.model.Repository;
import com.news.model.impl.RoleModel;
import com.news.service.Service;

public class RoleService implements Service<Role> {
    private final Repository<Role> repository = new RoleModel();


    @Override
    public void create(Role entity) throws ServiceException {
        try {
            repository.insert(entity);
        } catch (DaoException e) {
            throw new ServiceException("role can't add");
        }
    }

    @Override
    public Role read(int id) throws ServiceException {
        try {
           return repository.select(id);
        } catch (DaoException e) {
            throw new ServiceException("role can't read");
        }
    }
    @Override
    public void update(Role entity) throws ServiceException {
        try {
            repository.update(entity);
        } catch (DaoException e) {
            throw new ServiceException("role can't add");
        }

    }

    @Override
    public void delete(Role entity) throws ServiceException {
        try {
            repository.delete(entity);
        } catch (DaoException e) {
            throw new ServiceException("role can't add");
        }

    }
}
