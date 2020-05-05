package com.caren.android.fikry.kotlin.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GoodreadEndpointInterface {

    @GET("review_counts.json")
    Call<BookResultJson> getBookRating(@Query("isbn") String isbn, @Query("key") String apiKey);

    @GET("isbn/{isbn}")
    Call<GoodreadsResponse> getBook(@Path("isbn") String isbn, @Query("key") String apiKey);

    // https://www.goodreads.com/book/isbn/0441172717?key=qWxJU2Tbp5dKEN9d7XfiA
}

//public interface MyApiEndpointInterface {
//    // Request method and URL specified in the annotation
//
//    @GET("users/{username}")
//    Call<User> getUser(@Path("username") String username);
//
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);
//
//    @POST("users/new")
//    Call<User> createUser(@Body User user);
//}