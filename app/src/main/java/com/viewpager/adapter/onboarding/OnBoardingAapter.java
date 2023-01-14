package com.viewpager.adapter.onboarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.viewpager.R;
import com.viewpager.model.OnBoardingModel;

import java.util.List;

public class OnBoardingAapter extends RecyclerView.Adapter<OnBoardingAapter.OnBoardingViewHolder>
{

    List<OnBoardingModel> onBoardingModels;

    public OnBoardingAapter(List<OnBoardingModel> onBoardingModels)
    {
        this.onBoardingModels = onBoardingModels;
    }

    @NonNull
    @Override
    public OnBoardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_onboarding, parent, false);
        return new OnBoardingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoardingViewHolder holder, int position)
    {
       OnBoardingModel model = onBoardingModels.get(position);
       holder.imageViewOnBoarding.setImageResource(model.getImageOnBoarding());
       holder.textTitleOnBoarding.setText(model.getTitleOnBoarding());
       holder.textDescriptionOnBoarding.setText(model.getDescriptionOnBoarding());
    }

    @Override
    public int getItemCount()
    {
        return onBoardingModels.size();
    }

    public class OnBoardingViewHolder extends RecyclerView.ViewHolder
    {

        private ImageView imageViewOnBoarding;
        private TextView textTitleOnBoarding, textDescriptionOnBoarding;

        public OnBoardingViewHolder(@NonNull View itemView)
        {
            super(itemView);

            imageViewOnBoarding = itemView.findViewById(R.id.item_img_onboarding);
            textTitleOnBoarding = itemView.findViewById(R.id.item_txt_title);
            textDescriptionOnBoarding = itemView.findViewById(R.id.item_txt_description);
        }
    }
}
