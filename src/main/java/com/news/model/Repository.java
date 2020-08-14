package com.news.model;

import com.news.exception.DaoException;

import java.sql.Connection;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public interface Repository<T> {

    Connection connection = ConnectionBuilder.getConnection();

    void insert(T entity) throws DaoException;

    T select(int id) throws DaoException;

    void update(T entity) throws DaoException;

    void delete(T entity) throws DaoException;

     default LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
