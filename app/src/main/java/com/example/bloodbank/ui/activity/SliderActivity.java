package com.example.bloodbank.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.bloodbank.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SliderActivity extends AppCompatActivity {

    @BindView(R.id.Slider_Activity_Vp)
    ViewPager SliderActivityVp;
    @BindView(R.id.Slider_Activity_Btn_Skip)
    Button SliderActivityBtnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.Slider_Activity_Btn_Skip)
    public void onViewClicked() {
        Intent i = new Intent(SliderActivity.this , AuthActivity.class);
        startActivity(i);
        finish();

    }
}
