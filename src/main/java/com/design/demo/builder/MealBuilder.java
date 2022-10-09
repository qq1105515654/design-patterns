package com.design.demo.builder;

import com.design.demo.builder.impl.ChickenBurger;
import com.design.demo.builder.impl.Coke;
import com.design.demo.builder.impl.Pepsi;
import com.design.demo.builder.impl.VegBurger;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }


}
