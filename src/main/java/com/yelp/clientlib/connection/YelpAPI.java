package com.yelp.clientlib.connection;

import com.yelp.clientlib.entities.Business;
import com.yelp.clientlib.entities.SearchResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface YelpAPI {

    @GET("/v2/business/{businessId}")
    Business getBusiness(@Path("businessId") String businessId);

    @GET("/v2/business/{businessId}")
    void getBusiness(@Path("businessId") String businessId, Callback<Business> callBack);

    /**
     * TODO: This is a temporary endpoint to test Retrofit with query params. It will be refactored in later branches.
     */
    @GET("/v2/search")
    SearchResponse searchByLocation(@Query("term") String term, @Query("location") String location);

}

