package com.example.han_ttb_ttv.tippin_han_ttv.views;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;

import com.example.han_ttb_ttv.tippin_han_ttv.Fragments.IntroduceSliderOne;
import com.example.han_ttb_ttv.tippin_han_ttv.Fragments.IntroduceSliderThree;
import com.example.han_ttb_ttv.tippin_han_ttv.Fragments.IntroduceSliderTwo;
import com.example.han_ttb_ttv.tippin_han_ttv.Fragments.TopScreenViewPaperAdapter;
import com.example.han_ttb_ttv.tippin_han_ttv.R;

public class TopActivity extends AppCompatActivity{
    //@BindView(R.id.btnLogin)
    Button btnLogin, btnRegister;
    ViewPager VPtopSrceen;
    TableLayout tabLayoutTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        initial();
    }

    private void initial() {
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnRegister = (Button)findViewById(R.id.btnRegister);
        VPtopSrceen = (ViewPager)findViewById(R.id.VPtopSrceen);
        tabLayoutTop = (TableLayout)findViewById(R.id.tabLayoutTop);

        //Pour adapter to ViewPaper
        TopScreenViewPaperAdapter adapter = new TopScreenViewPaperAdapter(getSupportFragmentManager());
        adapter.addFragment(new IntroduceSliderOne());
        adapter.addFragment(new IntroduceSliderTwo());
        adapter.addFragment(new IntroduceSliderThree());
        VPtopSrceen.setAdapter(adapter);
        //tabLayoutTop.set
    }
}
