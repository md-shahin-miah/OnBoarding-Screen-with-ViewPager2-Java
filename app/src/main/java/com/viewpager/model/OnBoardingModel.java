package com.viewpager.model;

public class OnBoardingModel
{

    private int imageOnBoarding;
    private String titleOnBoarding;
    private String descriptionOnBoarding;


    public OnBoardingModel()
    {
    }

    public OnBoardingModel(int imageOnBoarding, String titleOnBoarding, String descriptionOnBoarding)
    {
        this.imageOnBoarding = imageOnBoarding;
        this.titleOnBoarding = titleOnBoarding;
        this.descriptionOnBoarding = descriptionOnBoarding;
    }

    public int getImageOnBoarding() {
        return imageOnBoarding;
    }

    public void setImageOnBoarding(int imageOnBoarding) {
        this.imageOnBoarding = imageOnBoarding;
    }

    public String getTitleOnBoarding() {
        return titleOnBoarding;
    }

    public void setTitleOnBoarding(String titleOnBoarding) {
        this.titleOnBoarding = titleOnBoarding;
    }

    public String getDescriptionOnBoarding() {
        return descriptionOnBoarding;
    }

    public void setDescriptionOnBoarding(String descriptionOnBoarding) {
        this.descriptionOnBoarding = descriptionOnBoarding;
    }
}
