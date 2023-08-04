package com.example.marstest.Model.Remoto

import com.example.marstest.Model.Remoto.MarsRealState
import retrofit2.Response
import retrofit2.http.GET

interface MarsApi {

    @GET("realestate")
    suspend fun fetchMarsDataCoroutines(): Response<List<MarsRealState>>

}