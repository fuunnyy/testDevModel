package com.example.devmodel.builder;

public abstract class MealBuilder {
    public static final String TAG = "BUILDER";

    protected Meal meal = new Meal();

    public abstract void buildDrink();

    public abstract void buildFood();

    public abstract void buildDessert();

    public Meal getMeal() {
        return meal;
    }
}
