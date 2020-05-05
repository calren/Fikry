package com.caren.android.fikry.kotlin.network;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "GoodreadsResponse", strict = false) // only works in non-strict mode
public class GoodreadsResponse {

    @Element
    public Book book;

    public GoodreadsResponse() {} // empty constructor required
}
