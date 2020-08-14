package com.news.service.impl;

import com.news.entities.Author;
import com.news.entities.News;
import com.news.entities.Tag;
import com.news.exception.DaoException;
import com.news.exception.ServiceException;
import com.news.model.Repository;
import com.news.model.impl.AuthorModel;
import com.news.model.impl.NewsModel;
import com.news.model.impl.TagModel;
import com.news.service.Service;

import java.util.ArrayList;
import java.util.List;

public class NewsService implements Service<News> {

    private final Repository<News> repository = new NewsModel();
    private final Repository<Author> authorRepository = new AuthorModel();
    private final TagModel tagRepository = new TagModel();

    @Override
    public void create(News entity) throws ServiceException {
        try {
            repository.insert(entity);
            authorRepository.insert(entity.getAuthor());
            List<Tag> tags = entity.getTags();
            for (Tag t: tags) {
                tagRepository.insert(t);
            }
        } catch (DaoException e) {
            throw new ServiceException("news can't add");

        }
    }

    @Override
    public News read(int id) throws ServiceException {
        try {
            News news = repository.select(id);
            Author author = authorRepository.select(news.getAuthor().getId());
            news.setAuthor(author);
            List<Tag> tags = tagRepository.selectByNewsId(id);
            news.setTags(tags);
            return news;
        } catch (DaoException e) {
            throw new ServiceException("new can't read");
        }
    }

    @Override
    public void update(News entity) throws ServiceException {
        try {
            repository.update(entity);
        } catch (DaoException e) {
            throw new ServiceException("news can't add");
        }

    }

    @Override
    public void delete(News entity) throws ServiceException {
        try {
            repository.delete(entity);
        } catch (DaoException e) {
            throw new ServiceException("news can't delete");
        }

    }
}
