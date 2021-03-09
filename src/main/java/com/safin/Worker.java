package com.safin;

import com.safin.animals.Animal;
import com.safin.animals.Voice;
import com.safin.exception.WrongFoodException;
import com.safin.food.Food;

public class Worker {
  public void feed(Animal animal, Food food) {
    try {
      animal.eat(food);
    } catch (WrongFoodException e) {
      e.printStackTrace();
    }
  }

  public void getVoice(Voice animal) {
    System.out.println(animal.voice());
  }
}
