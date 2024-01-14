package com.example.marketplace.Retrofit;

import com.example.marketplace.models.Client;
import com.example.marketplace.models.Fournisseur;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ClientApi {
    // Utilisez relative URL dans les annotations, pas l'URL complète
    @GET("/api/clients")
    Call<List<Client>> getAllClients();

    @GET("/api/clients/{id}")
    Call<Client> getClientById(@Path("id") Long id);

    @POST("/api/clients")
    Call<Client> createClient(@Body Client client);

    @PUT("/api/clients/{id}")
    Call<Client> updateClient(@Path("id") Long id, @Body Client client);

    @DELETE("/api/clients/{id}")
    Call<Void> deleteClient(@Path("id") Long id);


}
