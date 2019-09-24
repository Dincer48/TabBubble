package com.example.dincerkizildere.tabbubble;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FakeAdapter extends FragmentStatePagerAdapter {
    public FakeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            default:
                return FakeFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
