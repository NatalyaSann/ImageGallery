package com.sannikova.natalya.imagegallery.api;


import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private static YandexApi yandexApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://cloud-api.yandex.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        yandexApi = retrofit.create(YandexApi.class);
    }

    public static YandexApi getApi() {
        return yandexApi;
    }

}
