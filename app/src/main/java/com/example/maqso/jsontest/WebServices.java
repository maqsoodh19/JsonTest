package com.example.maqso.jsontest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by maqso on 10/30/2017.
 */

public interface WebServices {

    @GET("/api/teacher")
    Call<List<User>> getUsers();

    @GET("/api/teacher/{u}")
    Call<List<User>> getUser(@Path("u") int id);
}
