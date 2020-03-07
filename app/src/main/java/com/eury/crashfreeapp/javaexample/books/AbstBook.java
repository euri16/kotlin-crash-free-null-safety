package com.eury.crashfreeapp.javaexample.books;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.eury.crashfreeapp.javaexample.Author;

public abstract class AbstBook {
    private int id;
    private String title;
    private Integer year;
    private Author author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    abstract Drawable getIcon(Resources resources);
}
