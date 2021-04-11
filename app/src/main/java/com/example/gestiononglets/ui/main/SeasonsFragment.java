package com.example.gestiononglets.ui.main;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gestiononglets.R;

public class SeasonsFragment extends Fragment {
    ImageView spring, summer, autumn, winter;
    ViewPager viewPager;

    public SeasonsFragment() {
        // Empty constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment SeasonsFragment.
     */
    public static SeasonsFragment newInstance() {
        SeasonsFragment fragment = new SeasonsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewPager = getActivity().findViewById(R.id.view_pager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seasons, container, false);
        spring = view.findViewById(R.id.spring);
        spring.setOnClickListener(goToSpring);
        summer = view.findViewById(R.id.summer);
        summer.setOnClickListener(goToSummer);
        autumn = view.findViewById(R.id.autumn);
        autumn.setOnClickListener(goToAutumn);
        winter = view.findViewById(R.id.winter);
        winter.setOnClickListener(goToWinter);
        return view;
    }

    private View.OnClickListener goToSpring = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            viewPager.setCurrentItem(1);
        }
    };

    private View.OnClickListener goToSummer = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            viewPager.setCurrentItem(2);
        }
    };

    private View.OnClickListener goToAutumn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            viewPager.setCurrentItem(3);
        }
    };

    private View.OnClickListener goToWinter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            viewPager.setCurrentItem(4);
        }
    };


}