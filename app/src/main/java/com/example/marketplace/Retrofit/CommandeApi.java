package com.example.marketplace.Retrofit;

import com.example.marketplace.models.Commande;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CommandeApi {
    @GET("/api/commandes")
    Call<List<Commande>> getAllCommandes();

    @GET("/api/commandes/{id}")
    Call<Commande> getCommandeById(@Path("id") Long id);

    @POST("/api/commandes")
    Call<Commande> createCommande(@Body Commande commande);

    @PUT("/api/commandes/{id}")
    Call<Commande> updateCommande(@Path("id") Long id, @Body Commande commande);

    @DELETE("/api/commandes/{id}")
    Call<Void> deleteCommande(@Path("id") Long id);
}
