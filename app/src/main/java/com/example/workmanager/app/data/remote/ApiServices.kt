package com.example.workmanager.app.data.remote

import com.example.workmanager.app.data.model.QuoteDto
import retrofit2.http.GET

interface ApiServices {
    @GET("quotes/random")
    suspend fun getQuotes(): QuoteDto
}