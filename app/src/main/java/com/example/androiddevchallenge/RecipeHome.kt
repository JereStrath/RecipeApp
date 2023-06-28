package com.example.androiddevchallenge

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.DataProvider
import com.example.androiddevchallenge.data.model.Food

@Composable
fun RecipeHomeContent(navigateToProfile: (Food) -> Unit) {
<<<<<<< HEAD
    val foods = remember { DataProvider.foodList }
=======
    val puppies = remember { DataProvider.foodList }
>>>>>>> parent of 41c177f (new)
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
<<<<<<< HEAD
            items = foods,
=======
            items = puppies,
>>>>>>> parent of 41c177f (new)
            itemContent = {
                RecipeListItem(food = it, navigateToProfile)
            }
        )
    }
}
