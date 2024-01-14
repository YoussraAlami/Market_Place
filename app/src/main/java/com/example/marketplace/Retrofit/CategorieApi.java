package com.example.marketplace.Retrofit;

import com.example.marketplace.models.Categorie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CategorieApi {
    @GET("/api/categories")
    Call<List<Categorie>> getAllCategories();

    @GET("/api/categories/{id}")
    Call<Categorie> getCategorieById(@Path("id") Long id);

    @POST("/api/categories")
    Call<Categorie> createCategorie(@Body Categorie categorie);

    @PUT("/api/categories/{id}")
    Call<Categorie> updateCategorie(@Path("id") Long id, @Body Categorie categorie);

    @DELETE("/api/categories/{id}")
    Call<Void> deleteCategorie(@Path("id") Long id);
}
