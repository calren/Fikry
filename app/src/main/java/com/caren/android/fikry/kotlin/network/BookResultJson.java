package com.caren.android.fikry.kotlin.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookResultJson {

    @SerializedName("books")
    @Expose
    private List<BookJson> books = null;

    public List<BookJson> getBooks() {
        return books;
    }

    public void setBooks(List<BookJson> books) {
        this.books = books;
    }
}
