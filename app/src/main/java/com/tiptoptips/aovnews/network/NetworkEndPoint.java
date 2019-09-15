package com.tiptoptips.aovnews.network;

import com.tiptoptips.aovnews.model.ServerResponse;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkEndPoint {

    @FormUrlEncoded
    @POST("get-heroes.php")
    ServerResponse getHeroes(@Query("get_heroes") String getHeroes);
}
