package com.safin.food;

public abstract class Food {
  private int amountOfFood;

  public Food(int amountOfFood) {
    this.amountOfFood = amountOfFood;
  }

  public int getAmountOfFood() {
    return amountOfFood;
  }
}
