package com.viewpager.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;

import android.os.Bundle;


import com.viewpager.R;
import com.viewpager.model.MovieModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
{

    ArrayList<MovieModel> movieModels;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        movieModels = new ArrayList<>();
        movieModels.add(new MovieModel("Passengers", "Science fiction", "December 23, 2020", R.drawable.img, 4.6f));
        movieModels.add(new MovieModel("The Tomorrow War", "Science fiction", "December 15, 2020", R.drawable.img_1, 4.8f));
        movieModels.add(new MovieModel("Annihilation", "Science fiction", "December 10, 2020", R.drawable.img_2, 3.5f));
        movieModels.add(new MovieModel("The Martian", "Science fiction", "December 1, 2020", R.drawable.img_3, 5f));
        movieModels.add(new MovieModel("Passengers", "Science fiction", "December 23, 2020", R.drawable.img, 4.6f));
        movieModels.add(new MovieModel("The Tomorrow War", "Science fiction", "December 15, 2020", R.drawable.img_1, 4.8f));
        movieModels.add(new MovieModel("Annihilation", "Science fiction", "December 10, 2020", R.drawable.img_2, 3.5f));
        movieModels.add(new MovieModel("The Martian", "Science fiction", "December 1, 2020", R.drawable.img_3, 5f));
        movieModels.add(new MovieModel("Passengers", "Science fiction", "December 23, 2020", R.drawable.img, 4.6f));
        movieModels.add(new MovieModel("The Tomorrow War", "Science fiction", "December 15, 2020", R.drawable.img_1, 4.8f));
        movieModels.add(new MovieModel("Annihilation", "Science fiction", "December 10, 2020", R.drawable.img_2, 3.5f));
        movieModels.add(new MovieModel("The Martian", "Science fiction", "December 1, 2020", R.drawable.img_3, 5f));


        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
        compositePageTransformer.addTransformer((page, position) ->
        {
            float r = 1 - Math.abs(position);
            page.setScaleY(0.75f + r * 0.15f);
        });


    }
}