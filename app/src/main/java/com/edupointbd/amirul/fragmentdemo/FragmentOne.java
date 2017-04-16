package com.edupointbd.amirul.fragmentdemo;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by amirul on 16-Apr-17.
 */

public class FragmentOne extends Fragment {

Button one;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_one,container,false);

        one = (Button)v.findViewById(R.id.mysite);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://amirulcsejust.blogspot.com"));
                startActivity(intent);
            }
        });

        return v;
    }
}
