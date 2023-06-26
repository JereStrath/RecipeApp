package com.example.myapplication3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.data.model.Food
import com.example.myapplication3.ui.theme.RecipeApp

class ProfileActivity : AppCompatActivity() {

    private val food: Food by lazy {
        intent?.getSerializableExtra(FOOD_ID) as Food
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeApp {
                //ProfileScreen(food)
            }
        }
    }

    companion object {
        private const val FOOD_ID = "food_id"
        fun newIntent(context: Context, food: Food) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(FOOD_ID, food)
            }
    }
}