package com.mystic.movieshub;

import android.content.Context;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {

    List<Movie> movies;
    Context context;
    CustomeAdapterListener listener;


    public MovieAdapter(List<Movie> movies, Context context){
        this.movies = movies;
        this.context = context;

    }

    public void setOnAdapterListener(CustomeAdapterListener listener){
        this.listener = listener;
    }


    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template,parent,false);
        return new MovieHolder(view,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.TV_title.setText(movie.getName());
        holder.TV_year.setText(String.valueOf(movie.getYear()));

        if(movie.getDescription().length() < 199){
            holder.TV_description.setText(movie.getDescription());
        }else{
            holder.TV_description.setText(movie.getDescription().substring(0,200).concat("..."));
        }
        holder.TV_ratings.setRating(movie.getRating());
        Glide.with(context)
                .asBitmap()
                .load(Uri.parse(movie.getPosterImages()))
                .placeholder(R.drawable.camera)
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


    //This inner class serves as the viewHolder it holds the view that is repeated
    public static class MovieHolder extends RecyclerView.ViewHolder {
        CardView card;
        ImageView image ;
        TextView TV_title, TV_year,  TV_description;
        RatingBar TV_ratings;

        public MovieHolder(@NonNull View itemView, final CustomeAdapterListener listener) {
            super(itemView);
            card = itemView.findViewById(R.id.container_card);
            image = itemView.findViewById(R.id.avatar);
            TV_title = itemView.findViewById(R.id.title);
            TV_year = itemView.findViewById(R.id.year);
            TV_ratings = itemView.findViewById(R.id.ratingBar);
            TV_description = itemView.findViewById(R.id.description);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener != null){
                        int positon = getAdapterPosition();
                        if (positon != RecyclerView.NO_POSITION){
                            listener.adapterListener(positon);
                        }
                    }
                }
            });
        }
    }

    public interface CustomeAdapterListener{
        void adapterListener(int position);
    }
}
