package com.example.myapplication3.data

import com.example.myapplication3.R
import com.example.myapplication3.data.model.Food

object DataProvider {

    val foodList = listOf(
        Food(
            id = 1,
            title = "Mukimo with meat stew",
            description = "Brewery loves fetching you your favorite homebrew.",
            foodImageId = R.drawable.img5
        ),
        Food(
            id = 2,
            title = "Meat with Fried Potatoes",
            description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
            foodImageId = R.drawable.img6
        ),
        Food(
            id = 3,
            title = "Chapatis with dengus",
            description = "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
            foodImageId = R.drawable.images18
        ),
        Food(
            id = 4,
            title = "Mandazis",
            description = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
            foodImageId = R.drawable.images33
        ),
        Food(
            id = 5,
            title = "Chapatis",
            description = "Pippa likes to look out the window and write pup-poetry.",
            foodImageId = R.drawable.images35
        ),
        Food(
            id = 6,
            title = "Fried Meat",
            description = "Coco enjoys getting pampered at the local puppy spa.",
            foodImageId = R.drawable.img1
        ),
        Food(
            id = 7,
            title = "Ugali, Meat with Kales",
            description = "Brody is a good boy, waiting for your next command.",
            foodImageId = R.drawable.img2
        ),
        Food(
            id = 8,
            title = "Githeri",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            foodImageId =  R.drawable.img3
        ),
    )
}