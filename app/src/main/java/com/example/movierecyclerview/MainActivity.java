package com.example.movierecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<Movie> movieList = new ArrayList<>();
Adapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        fillList();
        myAdapter = new Adapter(movieList);
       RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(myAdapter);

       recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Movie movie = movieList.get(position);
                Toast.makeText(getApplicationContext(), movie.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }
    public void fillList()
    {
        Movie movie = new Movie("0-Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("1-Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);
        movie = new Movie("2-Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("3-Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("4-Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new Movie("5-The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Movie("6-Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("7-Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Movie("8-Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new Movie("9-The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new Movie("10-Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Movie("11-Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new Movie("12-Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new Movie("13-Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new Movie("14-Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new Movie("15-Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Movie("16-Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
    }
}
