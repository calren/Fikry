package com.caren.android.fikry.kotlin.network;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "work", strict = false)
public class Work {
    @Element
    public int ratings_count;

    public Work() {}
}
