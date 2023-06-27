package com.example.androiddevchallenge.data.model

import java.io.Serializable

data class Food(
    val id: Int,
    val title: String,
    val type: String,
    val ingredients: String,
    val description: String,
    val FoodImageId: Int = 0
) : Serializable
