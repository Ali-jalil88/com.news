package com.news.model.impl;

import com.news.entities.Author;
import com.news.entities.News;
import com.news.exception.DaoException;
import com.news.model.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class NewsModel implements Repository<News> {
    private static final String INSERT = "insert into news (author_id, title, short_text, full_text) values (?,?,?,?)";
    private static final String UPDATE = "update news set title=?,short_text=?,full_text=? where id=?";
    private static final String SELECT = "select * from news where id=?";
    private static final String DELETE ="delete from news where id=?";
    @Override
    public void insert(News entity)throws DaoException{
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setInt(1,entity.getAuthor().getId());
            statement.setString(2,entity.getTitle());
            statement.setString(3,entity.getShortText());
            statement.setString(4,entity.getFullText());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("news can't insert ");

        }

    }

    @Override
    public News select(int id)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
               int newsId =  resultSet.getInt("id");
               int authorId = resultSet.getInt("author_id");
               String title = resultSet.getString("title");
               String short_text = resultSet.getString("short_text");
               String full_text = resultSet.getString("full_text");
                Date published_in1 = resultSet.getDate("published_in");
                Date created_in1 = resultSet.getDate("created_in");
                LocalDate published_in = convertToLocalDateViaMilisecond(published_in1);
                LocalDate created_in = convertToLocalDateViaMilisecond(created_in1);
               News news = new News();
               Author author = new Author();
               news.setId(newsId);
               author.setId(authorId);
               news.setAuthor(author);
               news.setTitle(title);
               news.setShortText(short_text);
               news.setFullText(full_text);
               news.setPublishedIn(published_in);
               news.setCreatedIn(created_in);
               return news;
            }

        } catch (SQLException throwables) {
            throw new DaoException("new can't select");
        }

        return null;
    }

    @Override
    public void update(News entity)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1,entity.getTitle());
            statement.setString(2,entity.getShortText());
            statement.setString(3,entity.getFullText());
            statement.setInt(4,entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("news can't update");
        }
    }

    @Override
    public void delete(News entity)throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1,entity.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throw new DaoException("news can't delete");
        }
    }
}
