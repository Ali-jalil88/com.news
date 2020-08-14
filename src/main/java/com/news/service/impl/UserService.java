package com.news.service.impl;

import com.news.entities.Role;
import com.news.entities.User;
import com.news.exception.DaoException;
import com.news.exception.ServiceException;
import com.news.model.Repository;
import com.news.model.impl.RoleModel;
import com.news.model.impl.UserModel;
import com.news.service.Service;

public class UserService implements Service<User> {
    private final UserModel repository = new UserModel();
    private final Repository<Role> roleRepository = new RoleModel();

    @Override
    public void create(User entity) throws ServiceException {
        try {
            repository.insert(entity);
        } catch (DaoException e) {
            throw new  ServiceException("user can't add");
        }
    }
    public User createByLogin(String login , String password) throws ServiceException{
        try {
            return repository.selectByLogin(login, password);
        } catch (DaoException e) {
            throw new ServiceException("user can't find");
        }
    }

    @Override
    public User read(int id) throws ServiceException {
        try {
            User user = repository.select(id);
            Role role = roleRepository.select(id);
            user.setRole(role);
            return  user;
        } catch (DaoException e) {
            throw new ServiceException("user can't add");
        }

    }

    @Override
    public void update(User entity) throws ServiceException {
        try {
            repository.update(entity);
        } catch (DaoException e) {
            throw new ServiceException("user can't add");
        }

    }

    @Override
    public void delete(User entity) throws ServiceException {
        try {
            repository.delete(entity);
        } catch (DaoException e) {
            throw new ServiceException("user can't add");
        }

    }
}
