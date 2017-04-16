package com.edupointbd.amirul.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by amirul on 16-Apr-17.
 */

  public class FragmentFour extends Fragment {


    View v4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v4 = inflater.inflate(R.layout.fragment_four,container,false);

        return v4;
    }
}