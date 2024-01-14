package com.example.marketplace.Retrofit;

import com.example.marketplace.models.Fournisseur;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface FournisseurApi {
    @GET("/api/fournisseurs")
    Call<List<Fournisseur>> getAllFournisseurs();

    @GET("/api/fournisseurs/{id}")
    Call<Fournisseur> getFournisseurById(@Path("id") Long id);

    @POST("/api/fournisseurs")
    Call<Fournisseur> createFournisseur(@Body Fournisseur fournisseur);

    @PUT("/api/fournisseurs/{id}")
    Call<Fournisseur> updateFournisseur(@Path("id") Long id, @Body Fournisseur fournisseur);

    @DELETE("/api/fournisseurs/{id}")
    Call<Void> deleteFournisseur(@Path("id") Long id);
}
