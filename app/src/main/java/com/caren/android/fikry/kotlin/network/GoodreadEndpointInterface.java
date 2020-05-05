package com.caren.android.fikry.kotlin.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoodreadEndpointInterface {

    @GET("review_counts.json")
    Call<BookResult> getBookRating(@Query("key") String apiKey, @Query("isbns") String isbn);
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