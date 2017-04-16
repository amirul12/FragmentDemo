package com.edupointbd.amirul.fragmentdemo;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager pager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = (TabLayout) findViewById(R.id.myTablayout);
        pager = (ViewPager) findViewById(R.id.myViewpager);

        setUpmyViewPager(pager);

        tabLayout.setupWithViewPager(pager);

    }

    void setUpmyViewPager(ViewPager vp){

        MyViewPageAdapter mva = new MyViewPageAdapter(getSupportFragmentManager());
        mva.addMyFragment(new FragmentOne(),"ICT HUB");
        mva.addMyFragment(new FragmentTwo()," 5th Chapter Question");
        mva.addMyFragment(new FragmentThree(),"Qustion Answer");
        mva.addMyFragment(new FragmentFour(),"ict web site");

        vp.setAdapter(mva);
    }



    class MyViewPageAdapter extends FragmentPagerAdapter {

        List<Fragment> my_list = new ArrayList<Fragment>();
        List<String> my_title = new ArrayList<String>();

        public MyViewPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return  my_list.get(position);
        }


        @Override
        public int getCount() {
            return my_list.size();
        }

        void addMyFragment(Fragment f, String title){
            my_list.add(f);
            my_title.add(title);

        }

        @Override
        public CharSequence getPageTitle(int position) {
             return  my_title.get(position);
        }
    }
}
