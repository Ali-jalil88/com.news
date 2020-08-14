package com.news.service;

import com.news.exception.ServiceException;

public interface Service<T> {

    public void create (T entity) throws ServiceException;
    public T read(int id)throws ServiceException;
    public void update(T entity) throws ServiceException;
    public  void delete(T entity) throws ServiceException;

}
