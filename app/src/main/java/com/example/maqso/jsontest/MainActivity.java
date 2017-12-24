package com.example.maqso.jsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MYTAG";
    // OkHttpClient okHttpClientclient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   Testing Json by OKHTTP3
//        okHttpClientclient = new OkHttpClient();
//        String url = "http://192.168.10.45:8000/api/view";
//        Request request = new Request.Builder().url(url).build();
//
//        okHttpClientclient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.d(TAG, "On Failure ");
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                Log.d(TAG, "Response " + response.body().string());
//            }
//        });
        ////  retrofit testing    getting all user

        Call<List<User>> call = UserServiceSingleton.getInstance().getUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> user = response.body();
                Toast.makeText(MainActivity.this, " " + user, Toast.LENGTH_SHORT).show();
                for (User x : user) {
                    Log.d(TAG, "onResponse: userName: " + x.getUsername() + "\n userEmail: " + x.getEmail() + "\n id" + x.getId());

                }

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Field", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "OnFailure  " + t);
            }
        });
    }


}

