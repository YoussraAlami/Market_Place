package com.example.marketplace.Retrofit;

import com.example.marketplace.models.Store;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface StoreApi {
    @GET("/api/stores")
    Call<List<Store>> getAllStores();

    @GET("/api/stores/{id}")
    Call<Store> getStoreById(@Path("id") Long id);

    @POST("/api/stores")
    Call<Store> createStore(@Body Store store);

    @PUT("/api/stores/{id}")
    Call<Store> updateStore(@Path("id") Long id, @Body Store store);

    @DELETE("/api/stores/{id}")
    Call<Void> deleteStore(@Path("id") Long id);

    @GET("/api/stores/all-with-articles")
    Call<List<Store>> getAllStoresWithArticles();
}
