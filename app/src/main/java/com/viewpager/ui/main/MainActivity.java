package com.viewpager.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
import com.viewpager.R;
import com.viewpager.adapter.onboarding.OnBoardingAapter;
import com.viewpager.model.OnBoardingModel;
import com.viewpager.ui.home.HomeActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private List<OnBoardingModel> onBoardingModels;
    private OnBoardingAapter onBoardingAapter;
    ViewPager2 viewPagerOnboarding;
    LinearLayout linearLayoutPageIndicator;
    MaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerOnboarding = findViewById(R.id.view_pager_onboarding);
        linearLayoutPageIndicator = findViewById(R.id.linear_onboarding_indicator);
        materialButton = findViewById(R.id.btn_action_onboarding);

        onBoardingModels = new ArrayList<>();
        onBoardingModels.add(new OnBoardingModel(R.drawable.food, "All kind of Foods", "We are proving breakfast ,lunch and dinner with various kind of food, Welcome Sir"));
        onBoardingModels.add(new OnBoardingModel(R.drawable.delivery, "Fastest Delivery", "Our delivery process is more faster than any other food delivery platform "));
        onBoardingModels.add(new OnBoardingModel(R.drawable.payment, "Payment system", "We’ve put together a list of all the different ways you can accept online payments. These options are easy, convenient, and seamless for you"));

        onBoardingAapter = new OnBoardingAapter(onBoardingModels);
        viewPagerOnboarding.setAdapter(onBoardingAapter);

        ImageView[] indicators = new ImageView[onBoardingAapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(10, 10, 10, 10);
        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive));
            indicators[i].setLayoutParams(layoutParams);
            linearLayoutPageIndicator.addView(indicators[i]);
        }

        setCurrentOnBoardingIndicator(0);


        viewPagerOnboarding.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentOnBoardingIndicator(position);
            }
        });

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPagerOnboarding.getCurrentItem() + 1 < onBoardingAapter.getItemCount()) {
                    viewPagerOnboarding.setCurrentItem(viewPagerOnboarding.getCurrentItem() + 1);
                } else {
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//                    getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new TestFragment()).commit();
//                    materialButton.setVisibility(View.GONE);
//                    viewPager2.setVisibility(View.GONE);
//                    linearLayoutDot.setVisibility(View.GONE);
                }
            }
        });
    }


    private void setCurrentOnBoardingIndicator(int index) {
        int childCount = linearLayoutPageIndicator.getChildCount();
        Log.d(TAG, "setCurrentOnBoardingIndicator: "+viewPagerOnboarding.getChildCount());
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView) linearLayoutPageIndicator.getChildAt(i);
            Log.d(TAG, "setCurrentOnBoardingIndicator: "+i+" "+index);
            if (i == index) {
                imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_active));
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive));
            }
        }
        if (index == onBoardingAapter.getItemCount() - 1) {
            materialButton.setText("Start");
        } else {
            materialButton.setText("Next");
        }
    }
}