package com.mystic.movieshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class DetailActivity extends SingleFragmentActivity {

    public static final String MOVIE_OBJECT = "movie";
    @Override
    protected Fragment createFragment() {
        Movie movie = (Movie) getIntent().getSerializableExtra(MOVIE_OBJECT);
      return DetailFragment.newInstance(movie);
    }

}