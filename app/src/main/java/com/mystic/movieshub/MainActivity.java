package com.mystic.movieshub;


import androidx.fragment.app.Fragment;




public class MainActivity extends Multiplefragment {


    @Override
    protected Fragment createFragment() {
        return  ActionFragment.newInstance();
    }
}