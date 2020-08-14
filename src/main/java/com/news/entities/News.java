package com.news.entities;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class News extends Entity {

    private String title;
    private String shortText;
    private String fullText;
    private LocalDate publishedIn;
    private LocalDate createdIn;
    private Author author;
    private List<Tag> tags;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public LocalDate getPublishedIn() {
        return publishedIn;
    }

    public void setPublishedIn(LocalDate publishedIn) {
        this.publishedIn = publishedIn;
    }

    public LocalDate getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(LocalDate createdIn) {
        this.createdIn = createdIn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public int hashCode(){
        return Objects.hash(title,shortText,fullText,publishedIn,createdIn,author,tags);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(this.author,news.author) &&
                Objects.equals(this.createdIn,news.createdIn) &&
                Objects.equals(this.fullText,news.fullText) &&
                Objects.equals(this.publishedIn,news.publishedIn) &&
                Objects.equals(this.shortText,news.shortText) &&
                Objects.equals(this.tags,news.tags) &&
                Objects.equals(this.title,news.title);
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", shortText='" + shortText + '\'' +
                ", fullText='" + fullText + '\'' +
                ", publishedIn=" + publishedIn +
                ", createdIn=" + createdIn +
                ", author=" + author +
                ", tags=" + tags +
                '}';
    }
}
