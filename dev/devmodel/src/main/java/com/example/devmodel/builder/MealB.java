package com.example.devmodel.builder;

public class MealB extends MealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("Sprite");
    }

    @Override
    public void buildFood() {
        meal.setFood("Pizza");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Cake");
    }
}
