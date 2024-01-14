package com.example.marketplace.Retrofit;

import com.example.marketplace.models.Article;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ArticleApi {
    @GET("/api/articles")
    Call<List<Article>> getAllArticles();

    @GET("/api/articles/{id}")
    Call<Article> getArticleById(@Path("id") Long id);

    @POST("/api/articles")
    Call<Article> createArticle(@Body Article article);

    @PUT("/api/articles/{id}")
    Call<Article> updateArticle(@Path("id") Long id, @Body Article article);

    @DELETE("/api/articles/{id}")
    Call<Void> deleteArticle(@Path("id") Long id);
}

