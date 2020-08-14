package com.news.model.impl;

import com.news.entities.Author;
import com.news.exception.DaoException;
import com.news.model.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorModel implements Repository<Author> {
    private static final String INSERT = "insert into authors (first_name, last_name) values (?,?)";
    private static final String SELECT = "select * from authors where id=?";
    private static final String UPDATE = "update authors set first_name=?,last_name=? where id=?";
    private static final String DELETE = "delete from authors where id=?";
    @Override
    public void insert(Author entity) throws DaoException {
        try (PreparedStatement statement = connection.prepareStatement(INSERT)){
            statement.setString(1,entity.getName());
            statement.setString(2,entity.getLastName());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new DaoException("author can't insert");
        }
    }

    @Override
    public Author select(int id)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                int authorId = resultSet.getInt("id");
                String name = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Author author = new Author();
                author.setId(authorId);
                author.setName(name);
                author.setLastName(lastName);
                return author;
            }

        } catch (SQLException throwables) {
            throw new DaoException("author can't select");
        }
        return null;
    }

    @Override
    public void update(Author entity)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1,entity.getName());
            statement.setString(2,entity.getLastName());
            statement.setInt(3,entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("author can't update");
        }
    }

    @Override
    public void delete(Author entity)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1,entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("author can't delete");
        }


    }


}
