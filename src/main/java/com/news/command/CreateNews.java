package com.news.command;

import com.news.entities.Author;
import com.news.entities.News;
import com.news.entities.Tag;
import com.news.exception.ServiceException;
import com.news.service.Service;
import com.news.service.impl.NewsService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class CreateNews implements Command {
    private final Service<News> service = new NewsService();

    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        News news = new News();
        news.setTitle("what");
        news.setShortText("World's");
        news.setFullText("is likely to peak");
        Author author = new Author();
        author.setId(1);
        news.setAuthor(author);
        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag("test-1",21));
        tags.add(new Tag("test-2",21));
        tags.add(new Tag("test-3",21));
        tags.add(new Tag("test-4",21));
        tags.add(new Tag("test-5",21));
        tags.add(new Tag("test-6",21));
        tags.add(new Tag("test-7",21));
        tags.add(new Tag("test-8",21));
        news.setTags(tags);
        service.create(news);
        Page page = new Page("/",true);
        return null;
    }
}
