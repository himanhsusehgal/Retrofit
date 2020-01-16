package com.example.retrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppController extends Application {

    private static AppController mInstance;

    public Api api;
    public Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized AppController getInstance() {
        return mInstance;
    }


    public Retrofit getRetrofit() {
         if(retrofit == null)
         {
             retrofit = new Retrofit.Builder()
                     .baseUrl(Api.base_url)
                     .addConverterFactory(GsonConverterFactory.create())
                     .build();
         }
         return retrofit;
    }

    public Api getApi() {
        if(api== null){
           api = getRetrofit().create(Api.class);
        }
        return api;
    }
}
