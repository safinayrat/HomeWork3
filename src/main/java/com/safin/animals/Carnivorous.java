package com.safin.animals;

import com.safin.exception.WrongFoodException;
import com.safin.food.Food;
import com.safin.food.Meat;

public abstract class Carnivorous extends Animal {

  public Carnivorous(String name) {
    super(name);
  }

  @Override
  public void eat(Food food) throws WrongFoodException {
    if (food instanceof Meat) {
      satiety += food.getAmountOfFood();
      System.out.println("The animal is fed");
    } else {
      throw new WrongFoodException("This food is not meat");
    }
  }
}
