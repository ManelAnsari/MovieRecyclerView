package com.example.movierecyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Movie> moviesList;
    //Constructor
    public Adapter(List<Movie> moviesList)
    {
        Log.i("meee", "Constructor =");
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i("meee", "onCreateViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        Log.i("meee", "onBindViewHolder position = "+position);
        Movie x = moviesList.get(position);
        holder.title.setText(x.getTitle());
        holder.genre.setText(x.getGenre());
        holder.year.setText(x.getYear());
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.i("meee", "MyViewHolder interface ");
            title = itemView.findViewById(R.id.title);
            genre =itemView.findViewById(R.id.genre);
            year = itemView.findViewById(R.id.year);
        }
    }
    @Override
    public int getItemCount() {
        Log.i("meee", "getItemCount="+ moviesList.size());
        return moviesList.size();
    }
}
