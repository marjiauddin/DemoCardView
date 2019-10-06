package com.example.deemocardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailsActivity extends AppCompatActivity {
    private ImageView imageIV;
    private TextView movieNameTV,directorTV;
    private String image,movie,director;
    private int imageLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
       init();

       getdata();

       setdata();
    }

    private void setdata() {
        imageIV.setImageResource(imageLink);
        movieNameTV.setText(movie);
        directorTV.setText(director);

    }

    private void getdata() {
        //image=getIntent().getStringExtra("image");
        imageLink=getIntent().getIntExtra("Image",R.drawable.forrest);
        movie=getIntent().getStringExtra("Name");
        director=getIntent().getStringExtra("DirectorName");

    }

    private void init() {
        imageIV=findViewById(R.id.imageIV);
        movieNameTV=findViewById(R.id.shawshankTV);
        directorTV=findViewById(R.id.frankTV);
    }
}
