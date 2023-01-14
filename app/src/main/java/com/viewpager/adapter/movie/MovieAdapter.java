package com.viewpager.adapter.movie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.viewpager.R;
import com.viewpager.model.MovieModel;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>
{

    ArrayList<MovieModel> movieModels;

    public MovieAdapter(ArrayList<MovieModel> movieModels)
    {
        this.movieModels = movieModels;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position)
    {
        MovieModel model = movieModels.get(position);
        holder.roundedImageView.setImageResource(model.getPoster());
        holder.textMovieName.setText(model.getNameMovie());
        holder.textMovieCategory.setText(model.getCategoryMovie());
        holder.textMovieReleaseDate.setText(model.getReleaseMovie());
        holder.ratingMovieBar.setRating(model.getRatingMovie());
    }

    @Override
    public int getItemCount()
    {
        return movieModels.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder
    {

        private RoundedImageView roundedImageView;
        private TextView textMovieName, textMovieCategory, textMovieReleaseDate;
        private RatingBar ratingMovieBar;

        public MovieViewHolder(@NonNull View itemView)
        {
            super(itemView);


            roundedImageView = itemView.findViewById(R.id.item_img_round_poster_movie);
            textMovieName = itemView.findViewById(R.id.item_txt_name_movie);
            textMovieCategory = itemView.findViewById(R.id.item_txt_category_movie);
            textMovieReleaseDate = itemView.findViewById(R.id.item_txt_release_date_movie);
            ratingMovieBar = itemView.findViewById(R.id.item_rating_bar);
        }
    }
}
