package com.viewpager2.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;

import android.os.Bundle;

import com.viewpager2.R;
import com.viewpager2.databinding.ActivityHomeBinding;
import com.viewpager2.model.MovieModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
{

    ActivityHomeBinding binding;
    ArrayList<MovieModel> movieModels;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        binding.textViewPager.setText("View Pager 2");

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

//        binding.movieViewPager.setClipToPadding(false);
//        binding.movieViewPager.setClipChildren(false);
//        binding.movieViewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
//        binding.movieViewPager.setOffscreenPageLimit(2);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
        compositePageTransformer.addTransformer((page, position) ->
        {
            float r = 1 - Math.abs(position);
            page.setScaleY(0.75f + r * 0.15f);
        });

//        binding.movieViewPager.setPageTransformer(compositePageTransformer);
//        binding.movieViewPager.setAdapter(new MovieAdapter(movieModels));
    }
}