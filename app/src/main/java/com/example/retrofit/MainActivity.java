package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<FilteredClasses> getData = api.getModelClass();

        getData.enqueue(new Callback<FilteredClasses>() {
            @Override
            public void onResponse(Call<FilteredClasses> call, Response<FilteredClasses> response) {
                FilteredClasses filteredClasses = response.body();

                List<FilteredDatum> filteredData = filteredClasses.getFilteredData();

                for (FilteredDatum f : filteredData){
                    Log.d(TAG, "onResponse: FilteredClasses :" + f.getClasses());
                }
            }

            @Override
            public void onFailure(Call<FilteredClasses> call, Throwable t) {
                Log.d(TAG, "onFailure: FilteredClasses : "+t.getMessage());
            }
        });


    }



}