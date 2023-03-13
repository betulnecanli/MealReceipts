package com.betulnecanli.mealreceipts;



public class MealModel {

    private String mealTitle;
    private String mealDesc;

    public MealModel(String mealTitle, String mealDesc) {
        this.mealTitle = mealTitle;
        this.mealDesc = mealDesc;
    }

    public String getMealTitle() {
        return mealTitle;
    }

    public void setMealTitle(String mealTitle) {
        this.mealTitle = mealTitle;
    }

    public String getMealDesc() {
        return mealDesc;
    }

    public void setMealDesc(String mealDesc) {
        this.mealDesc = mealDesc;
    }
}
