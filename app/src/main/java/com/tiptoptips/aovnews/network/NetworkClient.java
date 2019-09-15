package com.tiptoptips.aovnews.network;

import com.tiptoptips.aovnews.constants.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {

    private static Retrofit retrofit;

    public static Retrofit getApiClient() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    public static <S> S cteateService(Class<S> serviceClass) {

        return retrofit.create(serviceClass);
    }
}
