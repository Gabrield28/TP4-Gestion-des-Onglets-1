package com.example.gestiononglets.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gestiononglets.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        switch (position) {
            case 0:
                return SeasonsFragment.newInstance();
            case 1:
                return SeasonFragment.newInstance(R.drawable.spring);
            case 2:
                return SeasonFragment.newInstance(R.drawable.summer);
            case 3:
                return SeasonFragment.newInstance(R.drawable.autumn);
            case 4:
                return SeasonFragment.newInstance(R.drawable.winter);
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.titre_seasons).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.titre_spring).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.titre_summer).toUpperCase(l);
            case 3:
                return mContext.getString(R.string.titre_autumn).toUpperCase(l);
            case 4:
                return mContext.getString(R.string.titre_winter).toUpperCase(l);
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 5 total pages.
        return 5;
    }
}