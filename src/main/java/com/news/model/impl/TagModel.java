package com.news.model.impl;

import com.news.entities.Tag;
import com.news.exception.DaoException;
import com.news.model.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TagModel implements Repository<Tag> {
    private static final String INSERT = "insert into tags (news_id,name)values(?,?)";
    private static final String UPDATE = "update tags set name=? where id=?";
    private static final String DELETE = "delete from tags where id=?";
    private static final String SELECT_BY_NEWS_ID = "select * from tags where news_id=?";
    private static final String SELECT_BY_TAG_ID = "select * from tags where id=?";



    @Override
    public void insert(Tag entity)throws DaoException {

        try {
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setInt(1,entity.getId());
            statement.setString(2,entity.getName());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("tag can't insert");
        }

    }

    @Override
    public Tag select(int id)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_TAG_ID);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Tag tag = new Tag();
            if (resultSet.next()){
                int userId = resultSet.getInt("user_id");
                String name = resultSet.getString("name");
                tag.setId(userId);
                tag.setName(name);
            }
            return tag;
        } catch (SQLException throwables) {
            throw new DaoException("tag can't select");
        }
    }

    public List<Tag> selectByNewsId(int id)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_NEWS_ID);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            List<Tag> tags = new ArrayList<>();
            while (resultSet.next()){
                int userId = resultSet.getInt("news_id");
                String name = resultSet.getString("name");
                Tag tag = new Tag();
                tag.setId(userId);
                tag.setName(name);
                tags.add(tag);
            }
            return tags;
        } catch (SQLException throwables) {
            throw new DaoException("tag can't select");
        }
    }

    @Override
    public void update(Tag entity)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1,entity.getName());
            statement.setInt(2,entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new  DaoException("tag can't update");
        }

    }

    @Override
    public void delete(Tag entity) throws DaoException{
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1, entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("tag can't delete");
        }

    }
}
