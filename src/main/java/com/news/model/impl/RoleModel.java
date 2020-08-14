package com.news.model.impl;

import com.news.entities.Role;
import com.news.exception.DaoException;
import com.news.model.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.postgresql.jdbc.EscapedFunctions.INSERT;

public class RoleModel implements Repository<Role> {
    private static final String INSERT = "insert into roles(id,role)values (?,?)";
    private static final String UPDATE = "update roles set role=? where id=?";
    private static final String DELETE = "delete from roles where id =?";
    private static final String SELECT_BY_ID = "select * from roles where id=?";
    @Override
    public void insert(Role entity) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setInt(1, entity.getId());
            statement.setString(2, entity.getRole());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("role can't insert");
        }

    }

    @Override
    public Role select(int id) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Role role = new Role();
            if (resultSet.next()){
                String roleName = resultSet.getString("role");
                role.setId(id);
                role.setRole(roleName);
            }
            return role;
        } catch (SQLException throwables) {
            throw new DaoException("role can't select");
        }
    }

    @Override
    public void update(Role entity) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1, entity.getRole());
            statement.setInt(2, entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("role can't update");
        }
    }

    @Override
    public void delete(Role entity) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1, entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("role can't delete");
        }


    }
}
