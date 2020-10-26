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
 * Use the {@link ActionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActionFragment extends Fragment {


    RecyclerView mRecyclerView ;
    List<Movie> actionmovieList;
    MoviesLab moviesLab;
    MovieAdapter adapter;

    public ActionFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ActionFragment newInstance() {
        return new ActionFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        moviesLab = new MoviesLab();

        actionmovieList = moviesLab.getActionMovieList();
        adapter = new MovieAdapter(actionmovieList,getActivity());
        adapter.setOnAdapterListener(new MovieAdapter.CustomeAdapterListener() {
            @Override
            public void adapterListener(int position) {
                Movie movie = actionmovieList.get(position);
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