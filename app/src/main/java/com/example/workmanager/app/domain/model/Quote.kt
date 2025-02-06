package com.example.workmanager.app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Quote")
data class Quote(
    @PrimaryKey
    val id: Int,
    val quote: String,
    val author: String,
    val workType: String = "",
    val time: Long = System.currentTimeMillis()
)
