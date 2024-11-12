package com.task.librarysystem;

public class Book {
    private int id;
    private String title;
    private String authorname;
    private int publishyear;

   
    public Book() {}

    public Book(int id, String title, String authorname, int publishyear) {
        this.id = id;
        this.title = title;
        this.authorname = authorname;
        this.publishyear = publishyear;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(int publishyear) {
        this.publishyear = publishyear;
    }
}
