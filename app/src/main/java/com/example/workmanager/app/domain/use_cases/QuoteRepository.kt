package com.example.workmanager.app.domain.use_cases

import com.example.workmanager.app.domain.model.Quote
import kotlinx.coroutines.flow.Flow

interface QuoteRepository {
    fun getQuote()
    fun getAllQuotes(): Flow<List<Quote>>
    fun setPeriodicWorkRequest()

}