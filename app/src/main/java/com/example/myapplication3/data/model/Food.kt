package com.example.myapplication3.data.model

import android.icu.text.CaseMap.Title
import java.io.Serializable

data class Food(
    val id: Int,
    val title: String,
    val description: String,
    val foodImageId: Int = 0
) : Serializable