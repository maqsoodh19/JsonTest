package com.example.maqso.jsontest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Path;

/**
 * Created by maqso on 10/30/2017.
 */

public class UserServiceSingleton {
    private static WebServices service;


    public static WebServices getInstance() {

        if (service == null) {
            String url = "http://10.0.2.2:8000/";
            Retrofit builder = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create()).build();

            service = builder.create(WebServices.class);

        }
        return service;
    }

    public UserServiceSingleton() {
    }
}
