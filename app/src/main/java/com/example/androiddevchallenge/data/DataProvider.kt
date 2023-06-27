package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.model.Food

object DataProvider {

    val food =
        Food(
            id = 1,
            title = "Fried Beef",
            type = "Main Meal",
            ingredients = "1.5 to 2 pounds (680 to 900 grams) beef (such as chuck or stewing beef), cut into cubes\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 large onion, diced\n" +
                    "3 cloves garlic, minced\n" +
                    "2 carrots, sliced\n" +
                    "2 celery stalks, sliced\n" +
                    "2 tablespoons tomato paste\n" +
                    "2 cups beef broth (you can use store-bought or homemade)\n" +
                    "1 cup red wine (optional)\n" +
                    "2 bay leaves\n" +
                    "1 teaspoon dried thyme\n" +
                    "Salt and pepper to taste\n" +
                    "Chopped fresh parsley for garnish (optional)",
            description = "Heat the vegetable oil in a large, heavy-bottomed pot or Dutch oven over medium heat.\n" +
                    "Add the beef cubes to the pot in batches, browning them on all sides. Remove the browned beef from the pot and set it aside.\n" +
                    "In the same pot, add the diced onion and minced garlic. Sauté them for a few minutes until they become fragrant and slightly translucent.\n" +
                    "Add the sliced carrots and celery to the pot and cook for another 3-4 minutes, stirring occasionally.\n" +
                    "Stir in the tomato paste and cook for about a minute to coat the vegetables.\n" +
                    "Return the browned beef to the pot and pour in the beef broth and red wine (if using). The liquid should cover the beef and vegetables.\n" +
                    "Add the bay leaves and dried thyme to the pot. Season with salt and pepper to taste.\n" +
                    "Bring the mixture to a simmer, then reduce the heat to low. Cover the pot with a lid and let it cook for about 2 to 3 hours, or until the beef becomes tender and easily falls apart.\n" +
                    "Stir occasionally during the cooking process and check the liquid level. If it reduces too much, you can add more broth or water as needed.\n" +
                    "Once the beef is tender, taste and adjust the seasoning if necessary.\n" +
                    "Remove the bay leaves from the pot before serving.\n" +
                    "Serve the wet fried beef hot, garnished with chopped fresh parsley if desired. It pairs well with mashed potatoes, rice, or crusty bread.",
            FoodImageId = R.drawable.img1
        )

    val foodList = listOf(
        food,
        Food(
            id = 2,
            title = "Ugali Beef with Kales",
            type = "Main Meal",
            ingredients = "Ugali:\n" +
                    "\n" +
                    "2 cups maize flour (cornmeal)\n" +
                    "4 cups water\n" +
                    "Beef Stew:\n" +
                    "\n" +
                    "1.5 to 2 pounds (680 to 900 grams) beef, cut into cubes\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 large onion, diced\n" +
                    "3 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "2 tablespoons tomato paste\n" +
                    "2 cups beef broth (you can use store-bought or homemade)\n" +
                    "2 carrots, sliced\n" +
                    "2 potatoes, diced\n" +
                    "1 teaspoon dried thyme\n" +
                    "Salt and pepper to taste\n" +
                    "Kales (Collard Greens):\n" +
                    "\n" +
                    "1 bunch of kales (collard greens), washed and chopped\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 onion, sliced\n" +
                    "2 cloves garlic, minced\n" +
                    "1 tomato, diced\n" +
                    "Salt and pepper to taste",
            description = "Ugali:\n" +
                    "\n" +
                    "In a large saucepan, bring the water to a boil.\n" +
                    "Gradually add the maize flour while stirring continuously to avoid lumps.\n" +
                    "Reduce the heat to low and continue stirring until the mixture thickens and starts to pull away from the sides of the pan.\n" +
                    "Cover the saucepan and let the Ugali cook on low heat for about 10-15 minutes, allowing it to steam.\n" +
                    "Once cooked, remove the Ugali from the heat and let it rest for a few minutes before serving. Shape it into a ball or serve it as a thick porridge.\n" +
                    "Beef Stew:\n" +
                    "\n" +
                    "Heat the vegetable oil in a large pot or Dutch oven over medium heat.\n" +
                    "Add the beef cubes to the pot and brown them on all sides. Remove the beef and set it aside.\n" +
                    "In the same pot, add the diced onion and minced garlic. Sauté until they become fragrant and slightly translucent.\n" +
                    "Add the diced tomatoes and tomato paste. Cook for a few minutes until the tomatoes soften.\n" +
                    "Return the browned beef to the pot and pour in the beef broth. Add the sliced carrots, diced potatoes, dried thyme, salt, and pepper.\n" +
                    "Bring the mixture to a simmer, then reduce the heat to low. Cover the pot and let it cook for about 1.5 to 2 hours, or until the beef is tender and the flavors are well blended.\n" +
                    "Stir occasionally during the cooking process and check the liquid level. If it reduces too much, you can add more broth or water as needed.\n" +
                    "Kales (Collard Greens):\n" +
                    "\n" +
                    "Heat the vegetable oil in a separate pan over medium heat.\n" +
                    "Add the sliced onion and minced garlic. Sauté until they become fragrant and slightly golden.\n" +
                    "Add the diced tomato and cook for a few minutes until the tomato softens.\n" +
                    "Add the chopped kales (collard greens) to the pan. Stir well to combine with the onion and tomato mixture.\n" +
                    "Season with salt and pepper to taste.\n" +
                    "Cover the pan and let the kales cook for about 10-15 minutes, or until they wilt and become tender. Stir occasionally.\n" +
                    "Once everything is cooked, you can serve the Ugali, beef stew, and kales together. Place a portion of Ugali on a plate, and ladle the beef stew on one side, leaving space for the kales. Serve the kales alongside the Ugali and beef stew. Enjoy your meal!.",
            FoodImageId = R.drawable.img2
        ),
        Food(
            id = 3,
            title = "Githeri",
            type = "Main Meal",
            ingredients = "1 cup dried kidney beans (or any other variety you prefer)\n" +
                    "1 cup dried maize (corn)\n" +
                    "1 large onion, diced\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 teaspoon curry powder (optional)\n" +
                    "Salt and pepper to taste\n" +
                    "Water (for soaking and cooking)",
            description = "Rinse the kidney beans and maize thoroughly under cold water.\n" +
                    "In a large bowl, combine the kidney beans and maize, and cover them with water. Soak them overnight or for at least 6-8 hours to soften.\n" +
                    "After soaking, drain the water and rinse the beans and maize again.\n" +
                    "In a large pot, heat the vegetable oil over medium heat.\n" +
                    "Add the diced onion and minced garlic to the pot. Sauté until they become fragrant and slightly golden.\n" +
                    "Add the diced tomatoes and curry powder (if using) to the pot. Cook for a few minutes until the tomatoes soften.\n" +
                    "Add the soaked and rinsed kidney beans and maize to the pot. Stir well to combine with the onion and tomato mixture.\n" +
                    "Pour enough water into the pot to cover the beans and maize. The water level should be about 2 inches above the beans and maize.\n" +
                    "Season with salt and pepper to taste.\n" +
                    "Bring the mixture to a boil, then reduce the heat to low. Cover the pot and let it simmer for about 1.5 to 2 hours, or until the beans and maize are tender. Stir occasionally and check the water level. If it reduces too much, you can add more water as needed.\n" +
                    "Once the Githeri is cooked and the beans and maize are tender, taste and adjust the seasoning if necessary.\n" +
                    "Remove from heat and let it rest for a few minutes before serving.",
            FoodImageId = R.drawable.img3
        ),
        Food(
            id = 4,
            title = "Fufu with chicken Breast",
            type = "Main Meal",
            ingredients = "For Fufu:\n" +
                    "\n" +
                    "2 cups cassava flour (or yam flour or plantain flour)\n" +
                    "4 cups water\n" +
                    "For Chicken Stew:\n" +
                    "\n" +
                    "2 chicken breasts, boneless and skinless\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 onion, chopped\n" +
                    "3 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "1 bell pepper, diced\n" +
                    "2 tablespoons tomato paste\n" +
                    "2 cups chicken broth (you can use store-bought or homemade)\n" +
                    "1 teaspoon dried thyme\n" +
                    "1 teaspoon curry powder\n" +
                    "Salt and pepper to taste\n" +
                    "Fresh cilantro or parsley for garnish (optional)",
            description = "Fufu:\n" +
                    "\n" +
                    "In a large pot, bring 4 cups of water to a boil.\n" +
                    "Gradually add the cassava flour while stirring continuously to avoid lumps.\n" +
                    "Reduce the heat to low and continue stirring until the mixture thickens and starts to pull away from the sides of the pot.\n" +
                    "Cover the pot and let the Fufu cook on low heat for about 10-15 minutes, allowing it to steam.\n" +
                    "Once cooked, remove the Fufu from the heat and let it rest for a few minutes before serving.\n" +
                    "Chicken Stew:\n" +
                    "\n" +
                    "Cut the chicken breasts into bite-sized pieces.\n" +
                    "Heat the vegetable oil in a large skillet or pot over medium heat.\n" +
                    "Add the chopped onion and minced garlic to the skillet. Sauté until they become fragrant and slightly golden.\n" +
                    "Add the diced tomatoes and bell pepper. Cook for a few minutes until the vegetables soften.\n" +
                    "Add the chicken pieces to the skillet and cook until they are browned on all sides.\n" +
                    "Stir in the tomato paste, dried thyme, curry powder, salt, and pepper. Cook for another minute to coat the chicken and vegetables with the spices.\n" +
                    "Pour in the chicken broth, cover the skillet, and let the stew simmer on low heat for about 20-25 minutes, or until the chicken is cooked through and tender. Stir occasionally.\n" +
                    "Taste and adjust the seasoning if necessary.\n" +
                    "To serve, scoop a portion of Fufu onto a plate or in a bowl, and ladle the chicken stew over the top. You can garnish with fresh cilantro or parsley if desired. Fufu is traditionally eaten by tearing off a small portion with your fingers and using it to scoop up the stew. Enjoy this delicious and comforting West African meal!",
            FoodImageId = R.drawable.img4
        ),
        Food(
            id = 5,
            title = "Mukimo with beef",
            type = "Main Meal",
            ingredients = "For Mukimo:\n" +
                    "\n" +
                    "4 medium potatoes, peeled and diced\n" +
                    "1 cup maize kernels\n" +
                    "1 cup cooked kidney beans (or any other beans you prefer)\n" +
                    "2 cups chopped greens (such as collard greens, spinach, or kale)\n" +
                    "1 medium onion, finely chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tablespoons vegetable oil\n" +
                    "Salt to taste\n" +
                    "For Beef Stew:\n" +
                    "\n" +
                    "1.5 to 2 pounds (680 to 900 grams) beef, cut into cubes\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 large onion, diced\n" +
                    "3 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "2 tablespoons tomato paste\n" +
                    "2 cups beef broth (you can use store-bought or homemade)\n" +
                    "2 carrots, sliced\n" +
                    "2 potatoes, diced\n" +
                    "1 teaspoon dried thyme\n" +
                    "Salt and pepper to taste",
            description = "Mukimo:\n" +
                    "\n" +
                    "In a large pot, bring water to a boil and add the diced potatoes and maize kernels. Cook until the potatoes and maize are tender.\n" +
                    "Drain the cooked potatoes and maize, reserving some of the cooking water.\n" +
                    "In a separate pan, heat the vegetable oil over medium heat.\n" +
                    "Add the chopped onion and minced garlic to the pan. Sauté until they become fragrant and slightly golden.\n" +
                    "Add the chopped greens to the pan and cook until wilted.\n" +
                    "In a large mixing bowl, combine the cooked potatoes, maize, beans, sautéed greens, and the cooked onion and garlic mixture.\n" +
                    "Mash the ingredients together, adding some of the reserved cooking water as needed to achieve a moist and creamy consistency.\n" +
                    "Season with salt to taste. Keep warm until ready to serve.\n" +
                    "Beef Stew:\n" +
                    "\n" +
                    "Heat the vegetable oil in a large pot or Dutch oven over medium heat.\n" +
                    "Add the beef cubes to the pot and brown them on all sides. Remove the beef and set it aside.\n" +
                    "In the same pot, add the diced onion and minced garlic. Sauté until they become fragrant and slightly translucent.\n" +
                    "Add the diced tomatoes and tomato paste. Cook for a few minutes until the tomatoes soften.\n" +
                    "Return the browned beef to the pot and pour in the beef broth. Add the sliced carrots, diced potatoes, dried thyme, salt, and pepper.\n" +
                    "Bring the mixture to a simmer, then reduce the heat to low. Cover the pot and let it cook for about 1.5 to 2 hours, or until the beef is tender and the flavors are well blended.\n" +
                    "Stir occasionally during the cooking process and check the liquid level. If it reduces too much, you can add more broth or water as needed.\n" +
                    "To serve, place a generous scoop of Mukimo on a plate or in a bowl, and ladle the beef stew over the top. Mukimo can also be served alongside the beef stew. Enjoy this hearty and flavorful Kenyan meal!",
            FoodImageId = R.drawable.img5
        ),
        Food(
            id = 6,
            title = "Deep fried Potatoes with Nyama choma",
            type = "Main Meal",
            ingredients = "For Deep-Fried Potatoes:\n" +
                    "\n" +
                    "4 large potatoes\n" +
                    "Vegetable oil for frying\n" +
                    "Salt to taste\n" +
                    "For Nyama Choma:\n" +
                    "\n" +
                    "2 pounds (900 grams) of Nyama Choma (grilled meat) of your choice (such as beef, goat, or lamb)\n" +
                    "Salt and pepper to taste\n" +
                    "Lemon wedges for serving (optional)",
            description = "Deep-Fried Potatoes:\n" +
                    "\n" +
                    "Peel the potatoes and cut them into your desired shape, such as thick fries or wedges.\n" +
                    "Place the cut potatoes in a bowl of cold water and let them soak for about 30 minutes. This helps remove excess starch and makes the potatoes crispier when fried.\n" +
                    "After soaking, drain the potatoes and pat them dry with a clean kitchen towel.\n" +
                    "Heat vegetable oil in a deep fryer or a deep, heavy-bottomed pot to about 350°F (175°C).\n" +
                    "Carefully add the potatoes to the hot oil in small batches, making sure not to overcrowd the pot. Fry them for about 5-7 minutes, or until they turn golden brown and crispy.\n" +
                    "Use a slotted spoon or a spider skimmer to remove the fried potatoes from the oil and transfer them to a plate lined with paper towels to drain excess oil.\n" +
                    "Sprinkle the fried potatoes with salt while they are still hot. Toss gently to evenly distribute the salt.\n" +
                    "Repeat the frying process with the remaining batches of potatoes.\n" +
                    "Serve the deep-fried potatoes hot alongside the Nyama Choma.\n" +
                    "Nyama Choma:\n" +
                    "\n" +
                    "Preheat your grill or grill pan to medium-high heat.\n" +
                    "Season the Nyama Choma (grilled meat) with salt and pepper, or your preferred meat rub or marinade.\n" +
                    "Place the seasoned meat on the grill and cook until it reaches your desired level of doneness. The cooking time will vary depending on the thickness and type of meat. Ensure the meat is cooked thoroughly and reaches a safe internal temperature.\n" +
                    "Once cooked, remove the Nyama Choma from the grill and let it rest for a few minutes.\n" +
                    "Cut the Nyama Choma into smaller pieces or slices for serving.\n" +
                    "Serve the grilled meat hot with the deep-fried potatoes. You can also serve it with a side of Kenyan-style coleslaw or a fresh salad.\n" +
                    "Optionally, squeeze some lemon juice over the Nyama Choma before serving for added flavor.\n" +
                    "Enjoy the delicious combination of deep-fried potatoes and Nyama Choma, a popular Kenyan dish!",
            FoodImageId = R.drawable.img6
        ),
        Food(
            id = 7,
            title = "Rice, beef with potatoes",
            type = "Main Meal",
            ingredients = "1 cup rice\n" +
                    "2 cups water (for cooking rice)\n" +
                    "1 pound (450 grams) beef, cut into cubes\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 onion, diced\n" +
                    "3 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "2 tablespoons tomato paste\n" +
                    "2 cups beef broth (you can use store-bought or homemade)\n" +
                    "2 potatoes, diced\n" +
                    "1 teaspoon dried thyme\n" +
                    "Salt and pepper to taste",
            description = "Rice:\n" +
                    "\n" +
                    "Rinse the rice thoroughly under cold water.\n" +
                    "In a medium-sized pot, combine the rinsed rice and 2 cups of water.\n" +
                    "Bring the water to a boil over high heat, then reduce the heat to low.\n" +
                    "Cover the pot and let the rice simmer for about 15-20 minutes, or until the water is absorbed and the rice is cooked. The cooking time may vary depending on the type of rice you are using.\n" +
                    "Once cooked, remove the pot from the heat and let the rice rest, covered, for about 5 minutes. Fluff the rice with a fork before serving.\n" +
                    "Beef and Potatoes:\n" +
                    "\n" +
                    "Heat the vegetable oil in a large pot or Dutch oven over medium heat.\n" +
                    "Add the diced onion and minced garlic to the pot. Sauté until they become fragrant and slightly translucent.\n" +
                    "Add the diced tomatoes and tomato paste. Cook for a few minutes until the tomatoes soften.\n" +
                    "Add the beef cubes to the pot and cook until they are browned on all sides.\n" +
                    "Pour in the beef broth and add the diced potatoes, dried thyme, salt, and pepper.\n" +
                    "Bring the mixture to a simmer, then reduce the heat to low. Cover the pot and let it cook for about 1.5 to 2 hours, or until the beef is tender and the flavors are well blended. Stir occasionally during the cooking process and check the liquid level. If it reduces too much, you can add more broth or water as needed.\n" +
                    "Taste and adjust the seasoning if necessary.",
            FoodImageId = R.drawable.img7
        ),
        Food(
            id = 8,
            title = "Chapati Ndengu",
            type = "Main Meal",
            ingredients = "For Chapati:\n" +
                    "\n" +
                    "2 cups all-purpose flour\n" +
                    "1 teaspoon salt\n" +
                    "1 cup warm water\n" +
                    "2 tablespoons vegetable oil (plus more for cooking)\n" +
                    "For Ndengu:\n" +
                    "\n" +
                    "1 cup dried mung beans (ndengu), soaked overnight and drained\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 onion, finely chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "1 teaspoon ground cumin\n" +
                    "1 teaspoon ground coriander\n" +
                    "1 teaspoon turmeric\n" +
                    "1 teaspoon paprika (optional)\n" +
                    "Salt to taste\n" +
                    "Fresh cilantro for garnish (optional)",
            description = "Ndengu:\n" +
                    "\n" +
                    "In a large pot, bring water to a boil and add the soaked and drained mung beans.\n" +
                    "Cook the mung beans for about 30-40 minutes, or until they are tender but not mushy. Drain and set aside.\n" +
                    "In a separate pan, heat the vegetable oil over medium heat.\n" +
                    "Add the chopped onion and minced garlic to the pan. Sauté until they become fragrant and slightly golden.\n" +
                    "Add the diced tomatoes to the pan and cook until they soften.\n" +
                    "Stir in the ground cumin, ground coriander, turmeric, and paprika (if using). Cook for a minute to toast the spices.\n" +
                    "Add the cooked mung beans to the pan and mix well with the onion and tomato mixture.\n" +
                    "Season with salt to taste. If the mixture is too dry, you can add a little water or vegetable broth to achieve your desired consistency.\n" +
                    "Let the Ndengu simmer for a few minutes to allow the flavors to meld together.\n" +
                    "Garnish with fresh cilantro if desired. Keep warm until ready to serve.\n" +
                    "Chapati:\n" +
                    "\n" +
                    "In a large mixing bowl, combine the all-purpose flour and salt.\n" +
                    "Slowly add warm water to the flour mixture, mixing with your hands or a spoon until a dough forms.\n" +
                    "Drizzle 2 tablespoons of vegetable oil over the dough and knead it for about 5 minutes until it becomes smooth and elastic.\n" +
                    "Divide the dough into small golf ball-sized portions and roll each portion into a thin, round circle using a rolling pin.\n" +
                    "Heat a frying pan or griddle over medium heat.\n" +
                    "Place one rolled-out chapati on the heated pan and cook for about 1-2 minutes until bubbles start to form.\n" +
                    "Flip the chapati and cook the other side for another 1-2 minutes until it turns lightly golden and puffs up.\n" +
                    "Remove the cooked chapati from the pan and brush it with a little vegetable oil or butter if desired. Repeat the process with the remaining portions of dough.\n" +
                    "To serve, place a portion of Ndengu (mung bean curry) onto a plate or in a bowl, and serve it alongside a freshly cooked chapati. Chapati is torn into pieces and used to scoop up the Ndengu. Enjoy this classic Kenyan combination!",
            FoodImageId = R.drawable.img8
        ),
        Food(
            id = 9,
            title = "Chapati",
            type = "Main Meal or Snack",
            ingredients = "For Chapati:\n" +
                    "\n" +
                    "2 cups all-purpose flour\n" +
                    "1 teaspoon salt\n" +
                    "1 cup warm water\n" +
                    "2 tablespoons vegetable oil (plus more for cooking)",
            description = "In a large mixing bowl, combine the all-purpose flour and salt.\n" +
                    "Slowly add warm water to the flour mixture, mixing with your hands or a spoon until a dough forms.\n" +
                    "Drizzle 2 tablespoons of vegetable oil over the dough and knead it for about 5 minutes until it becomes smooth and elastic.\n" +
                    "Divide the dough into small golf ball-sized portions and roll each portion into a thin, round circle using a rolling pin.\n" +
                    "Heat a frying pan or griddle over medium heat.\n" +
                    "Place one rolled-out chapati on the heated pan and cook for about 1-2 minutes until bubbles start to form.\n" +
                    "Flip the chapati and cook the other side for another 1-2 minutes until it turns lightly golden and puffs up.\n" +
                    "Remove the cooked chapati from the pan and brush it with a little vegetable oil or butter if desired. Repeat the process with the remaining portions of dough.",
            FoodImageId = R.drawable.img9
        ),
        Food(
            id = 10,
            title = "Mandazi",
            type = "Snack",
            ingredients = "3 cups all-purpose flour\n" +
                    "1/2 cup sugar\n" +
                    "1 teaspoon baking powder\n" +
                    "1/4 teaspoon salt\n" +
                    "1/2 teaspoon ground cardamom (optional)\n" +
                    "1/4 teaspoon ground nutmeg (optional)\n" +
                    "1/4 cup melted butter or vegetable oil\n" +
                    "1/2 cup coconut milk (you can also use regular milk)\n" +
                    "1/2 cup water\n" +
                    "Oil for frying",
            description = "In a large mixing bowl, combine the all-purpose flour, sugar, baking powder, salt, ground cardamom, and ground nutmeg. Mix well to evenly distribute the dry ingredients.\n" +
                    "\n" +
                    "Create a well in the center of the dry ingredients and pour in the melted butter or vegetable oil, coconut milk, and water. Mix everything together until a soft dough forms. You can use your hands or a wooden spoon.\n" +
                    "\n" +
                    "Once the dough comes together, knead it on a lightly floured surface for about 5-10 minutes until it becomes smooth and elastic.\n" +
                    "\n" +
                    "Place the dough back into the mixing bowl, cover it with a clean kitchen towel, and let it rest for about 30 minutes to allow the gluten to relax.\n" +
                    "\n" +
                    "After the resting period, divide the dough into smaller portions. Roll each portion into a ball and then flatten it with your hands or a rolling pin to about 1/4 inch thickness.\n" +
                    "\n" +
                    "Heat oil in a deep frying pan or a large pot to medium heat. You'll need enough oil to submerge the Mandazi while frying.\n" +
                    "\n" +
                    "Carefully place a few pieces of flattened dough into the hot oil, making sure not to overcrowd the pan. Fry the Mandazi for about 2-3 minutes on each side or until they turn golden brown and crispy.\n" +
                    "\n" +
                    "Once fried, remove the Mandazi from the oil using a slotted spoon or tongs, and transfer them to a plate lined with paper towels to drain excess oil.\n" +
                    "\n" +
                    "Repeat the frying process with the remaining dough portions until all the Mandazi are cooked.\n" +
                    "\n" +
                    "Allow the Mandazi to cool slightly before serving. They can be enjoyed warm or at room temperature.\n" +
                    "\n" +
                    "Mandazi is often served with tea or coffee and can be enjoyed as a snack or breakfast treat. Sprinkle them with powdered sugar if desired. Enjoy your homemade Mandazi!",
            FoodImageId = R.drawable.img10
        ),
        Food(
            id = 11,
            title = "Baked chicken wings",
            type = "Accompaniment",
            ingredients = "2 pounds (900 grams) chicken wings\n" +
                    "2 tablespoons olive oil\n" +
                    "1 teaspoon garlic powder\n" +
                    "1 teaspoon paprika\n" +
                    "1 teaspoon salt\n" +
                    "1/2 teaspoon black pepper\n" +
                    "Optional sauces or seasonings for serving (e.g., buffalo sauce, barbecue sauce, or honey mustard)",
            description = "Preheat your oven to 425°F (220°C).\n" +
                    "\n" +
                    "Line a baking sheet with aluminum foil or parchment paper for easy cleanup.\n" +
                    "\n" +
                    "Pat the chicken wings dry with paper towels to remove any excess moisture.\n" +
                    "\n" +
                    "In a large bowl, combine the olive oil, garlic powder, paprika, salt, and black pepper. Mix well to create a marinade.\n" +
                    "\n" +
                    "Add the chicken wings to the bowl and toss them until they are well coated with the marinade.\n" +
                    "\n" +
                    "Arrange the chicken wings on the prepared baking sheet in a single layer, leaving some space between each wing.\n" +
                    "\n" +
                    "Place the baking sheet in the preheated oven and bake for about 40-45 minutes, or until the chicken wings are cooked through and crispy. Flip the wings halfway through the cooking time to ensure even browning.\n" +
                    "\n" +
                    "Remove the baking sheet from the oven and let the chicken wings rest for a few minutes.\n" +
                    "\n" +
                    "If desired, you can toss the baked chicken wings in your favorite sauce or seasoning while they are still hot. Some popular options include buffalo sauce, barbecue sauce, or honey mustard. Coat the wings evenly and return them to the oven for a few minutes if you want the sauce to caramelize slightly.\n" +
                    "\n" +
                    "Serve the baked chicken wings hot as an appetizer or main dish. They pair well with dips like ranch dressing or blue cheese dressing.\n" +
                    "\n" +
                    "Enjoy your delicious and crispy baked chicken wings!",
            FoodImageId = R.drawable.img11
        ),
        Food(
            id = 12,
            title = "Chapati Madondo",
            type = "Main Meal",
            ingredients = "For Chapati:\n" +
                    "\n" +
                    "2 cups all-purpose flour\n" +
                    "1 teaspoon salt\n" +
                    "1 cup warm water\n" +
                    "2 tablespoons vegetable oil (plus more for cooking)\n" +
                    "For Madondo (Spiced Beans):\n" +
                    "\n" +
                    "1 cup dried red kidney beans (Madondo), soaked overnight and drained\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1 onion, finely chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tomatoes, diced\n" +
                    "1 teaspoon ground cumin\n" +
                    "1 teaspoon ground coriander\n" +
                    "1 teaspoon turmeric\n" +
                    "1/2 teaspoon chili powder (adjust to taste)\n" +
                    "Salt to taste\n" +
                    "Fresh cilantro for garnish (optional)",
            description = "Madondo (Spiced Beans):\n" +
                    "\n" +
                    "In a large pot, bring water to a boil and add the soaked and drained kidney beans (Madondo).\n" +
                    "Cook the beans for about 1 to 1.5 hours, or until they are tender. Drain and set aside.\n" +
                    "In a separate pan, heat the vegetable oil over medium heat.\n" +
                    "Add the chopped onion and minced garlic to the pan. Sauté until they become fragrant and slightly golden.\n" +
                    "Add the diced tomatoes to the pan and cook until they soften.\n" +
                    "Stir in the ground cumin, ground coriander, turmeric, and chili powder. Cook for a minute to toast the spices.\n" +
                    "Add the cooked kidney beans to the pan and mix well with the onion and tomato mixture.\n" +
                    "Season with salt to taste. If the mixture is too dry, you can add a little water or vegetable broth to achieve your desired consistency.\n" +
                    "Let the Madondo simmer for a few minutes to allow the flavors to meld together.\n" +
                    "Garnish with fresh cilantro if desired. Keep warm until ready to serve.\n" +
                    "Chapati:\n" +
                    "\n" +
                    "In a large mixing bowl, combine the all-purpose flour and salt.\n" +
                    "Slowly add warm water to the flour mixture, mixing with your hands or a spoon until a dough forms.\n" +
                    "Drizzle 2 tablespoons of vegetable oil over the dough and knead it for about 5 minutes until it becomes smooth and elastic.\n" +
                    "Divide the dough into small golf ball-sized portions and roll each portion into a thin, round circle using a rolling pin.\n" +
                    "Heat a frying pan or griddle over medium heat.\n" +
                    "Place one rolled-out chapati on the heated pan and cook for about 1-2 minutes until bubbles start to form.\n" +
                    "Flip the chapati and cook the other side for another 1-2 minutes until it turns lightly golden and puffs up.\n" +
                    "Remove the cooked chapati from the pan and brush it with a little vegetable oil or butter if desired. Repeat the process with the remaining portions of dough.\n" +
                    "To serve, place a portion of Madondo (spiced beans) onto a plate or in a bowl, and serve it alongside a freshly cooked chapati. Chapati is torn into pieces and used to scoop up the Madondo. Enjoy the delightful combination of Chapati Madondo!",
            FoodImageId = R.drawable.img12
        ),
    )
}
