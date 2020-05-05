package com.caren.android.fikry.kotlin.network;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "book", strict = false)
public class Book {

    @Element
    public String title;

    @Element
    public Work work;

    @Element
    public String average_rating;

    public Book() {}
}
