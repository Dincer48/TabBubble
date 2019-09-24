package com.example.dincerkizildere.tabbubble;

import android.os.Bundle;

import com.github.florent37.bubbletab.BubbleTab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

public class BubbleTabMainActivity extends AppCompatActivity {
    @BindView(R.id.bubbleTab)
    BubbleTab bubbleTab;

    @BindView(R.id.viewPager)
    ViewPager viewPager;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bubbletab_avtivity_main);
        ButterKnife.bind(this);

        viewPager.setAdapter(new FakeAdapter(getSupportFragmentManager()));
        bubbleTab.setupWithViewPager(viewPager);
    }
}
