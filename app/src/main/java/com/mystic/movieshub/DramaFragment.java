package com.mystic.movieshub;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;



public class DramaFragment extends Fragment {
    RecyclerView mRecyclerView ;
    List<Movie> dramamovieList;
    MoviesLab moviesLab;
    MovieAdapter adapter;


    public DramaFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
   /* public static DramaFragment newInstance(String param1, String param2) {
        DramaFragment fragment = new DramaFragment();

        return fragment;
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        moviesLab = new MoviesLab();
        dramamovieList = moviesLab.getDramaMovieList();
        adapter = new MovieAdapter(dramamovieList,getActivity());
        adapter.setOnAdapterListener(new MovieAdapter.CustomeAdapterListener() {
            @Override
            public void adapterListener(int position) {
                Movie movie = dramamovieList.get(position);
                Intent intent = new Intent(getActivity(),DetailActivity.class);
                intent.putExtra(DetailActivity.MOVIE_OBJECT,movie);
                startActivity(intent);
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_genericview, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(adapter);
        return view;
    }
}