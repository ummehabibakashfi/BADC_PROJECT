package com.example.final_project_2231447;

import java.time.LocalDate;

public class KnowledgeBaseArticle {
    private String articleId;
    private String title;
    private String content;
    private String category; // e.g., "Loans", "Seeds", "Pests"
    private String authorId; // Officer who created it
    private LocalDate lastUpdated;

    public KnowledgeBaseArticle(String articleId, String title, String content, String category, String authorId, LocalDate lastUpdated) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.category = category;
        this.authorId = authorId;
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "KnowledgeBaseArticle{" +
                "articleId='" + articleId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                ", authorId='" + authorId + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
