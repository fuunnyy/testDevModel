package com.example.devmodel.builder;

public class MealA extends MealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildFood() {
        meal.setFood("Hamburger");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Ice cream");
    }
}
