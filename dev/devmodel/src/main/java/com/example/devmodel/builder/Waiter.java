package com.example.devmodel.builder;

public class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        mealBuilder.buildDessert();
        return mealBuilder.getMeal();
    }
}
