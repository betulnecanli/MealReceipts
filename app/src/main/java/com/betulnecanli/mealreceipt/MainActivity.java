package com.betulnecanli.mealreceipt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mealRecyclerView = findViewById(R.id.recycler_view_meal);

        ArrayList<MealsModel> mealsModelArrayList = new ArrayList<>();

        mealsModelArrayList.add(new MealsModel("Kale/Lemon Sandwiches","We had been traveling " +
                "and longed for GREENS, and when we got home only KALE was in the refrigerator." +
                " Lucky us for that day! This sandwich is stunningly delicious and tastes as good as " +
                "it is healthy. Any greens of choice will work. The lemon adds an almost sweet taste. " +
                "Be generous with it!"));

        mealsModelArrayList.add(new MealsModel("Mango-Lime Bean Salad","Everyone loves this, " +
                "so double or even triple the recipe! It vanishes in a flash, and also works well as a salsa. " +
                "It really is our all-time favorite summer salad. The red onion adds a dash of color and " +
                "the zest (the peel) intensifies the lime flavor."));

        mealsModelArrayList.add(new MealsModel("Sweet Potato and Lentil Soup with Shiitake Mushrooms",
                "This soup is so good Essy and I ate it ALL the first time I made it. " +
                        "If someone is hesitant about plant-based food, this has to be a convincer." +
                        " Red lentils keep this soup a beautiful orange color. If you don’t have leeks use onions." +
                        " Serve it alone or over rice with a big green salad."));

        mealsModelArrayList.add(new MealsModel("Lime Mousse","This is FABULOUS alone, " +
                "topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute." +
                " Use more or less lime according to taste. It is beautiful served in wine glasses topped with " +
                "fresh raspberries (or other berries) and sprinkled with mint."));

        mealsModelArrayList.add(new MealsModel("Red lentil and dill soup with mint",
                "This soup is adapted from a recipe of " +
                        "Kate Sherwood’s in the Nutrition Action newsletter. " +
                        "The red lentils, bits of tomato, and all the greens combine with the mint and " +
                        "dill to give the soup a well-rounded flavor. " +
                        "Nothing beats using fresh mint if you can find it. " +
                        "The 12 ounces of spinach seems like a lot but it vanishes so quickly. Be bold!"));


        mealsModelArrayList.add(new MealsModel("Fresh fig and arugula salad",
                "This is so delicious! Fresh figs are in season in early summer and then " +
                        "again in late summer through fall. Choose a slightly soft fig. " +
                        "A good balsamic vinegar, especially one that is fig-infused, " +
                        "is great in this salad and all the dressing it needs" +
                        " (www.olivetap.com is a good website for a won¬derful variety of balsamic vinegars, " +
                        "including fig-infused vinegar)! But don’t be deterred from making this if you" +
                        " don’t have fig balsamic vinegar—any balsamic vinegar works."));



        mealsModelArrayList.add(new MealsModel("Cucumber and kale open-faced sandwich",
                "The layer of kale and mustard together in this sandwich is delicious," +
                        " particularly when you use a great mustard. We love True Natural Taste Sweet " +
                        "and Spicy Creamy White Mustard, available at truenaturaltaste.com."));



        MealAdapter foodsAdapter = new MealAdapter(this, mealsModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mealRecyclerView.setLayoutManager(linearLayoutManager);
        mealRecyclerView.setAdapter(foodsAdapter);

    }






}