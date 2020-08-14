package com.news.model.impl;

import com.news.entities.User;
import com.news.exception.DaoException;
import com.news.model.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel implements Repository<User> {
    private static final String INSERT = "insert into users (name, last_name, login, password, email) values (?,?,?,?,?)";
    private static final String UPDATE = "update users set name=?,last_name=?,password=?,login=?,email=? where id=?";
    private static final String SELECT = "select * from users where id=?";
    private static final String SELECT_BY_LOGIN ="select * from users where login=? and password = ?";

    @Override
    public void insert(User entity) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setString(1,entity.getName());
            statement.setString(2,entity.getLastName());
            statement.setString(3,entity.getLogin());
            statement.setString(4,entity.getPassword());
            statement.setString(5,entity.getEmail());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("user can't insert");
        }

    }

    @Override
    public User select(int id)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                int userId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String last_name = resultSet.getString("last_name");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                String email = resultSet.getString("ali.jalil@gmail.com");
                User user = new User();
                user.setId(userId);
                user.setName(name);
                user.setLastName(last_name);
                user.setLogin(login);
                user.setPassword(password);
                user.setEmail(email);
                return user;
            }
        } catch (SQLException throwables) {
            throw new DaoException("user can't select");
        }
        return null;
    }

    public User selectByLogin(String login, String password)throws DaoException{
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_LOGIN);
            statement.setString(1,login);
            statement.setString(2,password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                User user = new User();
                String login1 = resultSet.getString("login");
                String password1 = resultSet.getString("password");
                user.setLogin(login1);
                user.setPassword(password1);
                return user;
            }
            return null;
        } catch (SQLException throwables) {
            throw new DaoException("user can't select");
        }
    }

    @Override
    public void update(User entity)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1,entity.getName());
            statement.setString(2,entity.getLastName());
            statement.setString(3,entity.getPassword());
            statement.setString(4,entity.getLogin());
            statement.setString(5,entity.getEmail());
            statement.setInt(6,entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("user can't update");
        }
    }

    @Override
    public void delete(User entity)throws DaoException {

    }
}
