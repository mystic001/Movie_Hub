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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ComedyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComedyFragment extends Fragment {

    RecyclerView mRecyclerView ;
    List<Movie> comedymovieList;
    MoviesLab moviesLab;
    MovieAdapter adapter;


    public ComedyFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ComedyFragment newInstance(String param1, String param2) {
        ComedyFragment fragment = new ComedyFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        moviesLab = new MoviesLab();

        comedymovieList = moviesLab.getComedyMovieList();
        adapter = new MovieAdapter(comedymovieList,getActivity());

        adapter.setOnAdapterListener(new MovieAdapter.CustomeAdapterListener() {
            @Override
            public void adapterListener(int position) {
                Movie movie = comedymovieList.get(position);
                Intent intent = new Intent(getActivity(),DetailActivity.class);
                intent.putExtra(DetailActivity.MOVIE_OBJECT,movie);
                startActivity(intent);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_genericview, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(adapter);
        return view;
    }
}