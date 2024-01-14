package com.example.marketplace.Retrofit;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private static final String BASE_URL = "http://192.168.8.110:8088";

    private static RetrofitService instance;
    private final Retrofit retrofit;

    private RetrofitService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    public static synchronized RetrofitService getInstance() {
        if (instance == null) {
            instance = new RetrofitService();
        }
        return instance;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
    public ClientApi getClientApi() {
        return retrofit.create(ClientApi.class);
    }
    public StoreApi getStoreApi() {
        return retrofit.create(StoreApi.class);
    }

    public ArticleApi getArticleApi() {
        return retrofit.create(ArticleApi.class);
    }

    public FournisseurApi getFournisseurApi() {
        return retrofit.create(FournisseurApi.class);
    }
}
