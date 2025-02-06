package com.example.workmanager.app.domain.repository

import com.example.workmanager.app.domain.model.Quote
import com.example.workmanager.app.domain.use_cases.QuoteRepository
import kotlinx.coroutines.flow.Flow

class QuoteRepositoryImpl : QuoteRepository {
    override fun getQuote() {
        TODO("Not yet implemented")
    }

    override fun getAllQuotes(): Flow<List<Quote>> {
        TODO("Not yet implemented")
    }

    override fun setPeriodicWorkRequest() {
        TODO("Not yet implemented")
    }

}