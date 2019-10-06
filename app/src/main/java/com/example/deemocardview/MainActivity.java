package com.example.deemocardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.PictureInPictureParams;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList;
    private RecyclerView recyclerView;
    private MovieAdapter adapter;
    private Toolbar toolbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setdata();
    }

    private void setdata() {
        movieList.add(new Movie(R.drawable.image,"Shawshank Redemption","Frank Darabont"));
        movieList.add(new Movie(R.drawable.forrest,"Forrest Gump","Robert Zemeckis"));
        movieList.add(new Movie(R.drawable.pulp,"Pulp Fiction","Quentin Tarantino"));
        movieList.add(new Movie(R.drawable.saving,"Saving private Ryan","Steven Spielberg"));
        adapter.notifyDataSetChanged();
    }

    private void init() {
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("DemoCardView");
        setSupportActionBar(toolbar);
        movieList=new ArrayList<>();
        recyclerView=findViewById(R.id.movieRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MovieAdapter(movieList,this);
        recyclerView.setAdapter(adapter);
    }
}
