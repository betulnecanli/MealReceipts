package com.betulnecanli.mealreceipt;



public class MealsModel {

    private String mealTitle;
    private String mealDesc;

    public MealsModel(String mealTitle, String mealDesc) {
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
