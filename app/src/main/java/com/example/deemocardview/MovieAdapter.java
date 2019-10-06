package com.example.deemocardview;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>  {
    private List<Movie> movies;
    private Activity context;

    public MovieAdapter(List<Movie> movies, Activity context) {
        this.movies = movies;
        this.context = context;
    }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
    return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    final Movie movie=movies.get(position);

        holder.movieIV.setImageResource(movie.getImage());
        holder.nameTV.setText(movie.getMovieName());
        holder.directorNameTV.setText(movie.getDerectorName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,MovieDetailsActivity.class);
                intent.putExtra("Image",movie.getImage());
                intent.putExtra("Name",movie.getMovieName());
                intent.putExtra("DirectorName",movie.getDerectorName());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {

        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView movieIV;
        private TextView nameTV,directorNameTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieIV=itemView.findViewById(R.id.movieIV);
            nameTV=itemView.findViewById(R.id.nameTV);
            directorNameTV=itemView.findViewById(R.id.directorNameTV);



        }
    }
}
