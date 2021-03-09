package com.safin.animals;

import com.safin.exception.WrongFoodException;
import com.safin.food.Food;
import com.safin.size.Size;

import java.util.Objects;

public abstract class Animal {
  protected int satiety;
  String name;
  Size size;

  public Animal(String name) {
    this.satiety = 1;
    this.name = name;
  }

  public abstract void eat(Food food) throws WrongFoodException;

  public int getSatiety() {
    return satiety;
  }

  public String getName() {
    return name;
  }

  public Size getSize() {
    return size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Animal)) return false;
    Animal animal = (Animal) o;
    return name.equals(animal.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
