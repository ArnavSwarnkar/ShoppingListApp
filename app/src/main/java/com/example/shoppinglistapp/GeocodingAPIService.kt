package com.example.shoppinglistapp

import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingAPIService {

    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlng: String,
        @Query("key") apikey: String): GeocodingResponse

}