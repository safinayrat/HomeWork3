package com.safin.animals;

import com.safin.exception.WrongFoodException;
import com.safin.food.Food;
import com.safin.food.Grass;

public abstract class Herbivore extends Animal {

  public Herbivore(String name) {
    super(name);
  }

  @Override
  public void eat(Food food) throws WrongFoodException {
    if (food instanceof Grass) {
      satiety += food.getAmountOfFood();
      System.out.println("The animal is fed");
    } else {
      throw new WrongFoodException("This food is not grass");
    }
  }
}
