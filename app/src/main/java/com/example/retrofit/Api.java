package com.example.retrofit;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {

    String base_url = "https://13-dot-gpschat.appspot.com/StudentApi/";

    @GET("classesandsubject")
    Call<FilteredClasses> getModelClass();

}
