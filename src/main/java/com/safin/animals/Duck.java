package com.safin.animals;

import com.safin.size.Size;

public class Duck extends Herbivore implements Fly, Voice, Swim {
  public Duck(String name) {
    super(name);
    size = Size.SMALL;
  }

  @Override
  public void fly() {
    System.out.println("Duck is flying");
  }

  @Override
  public String voice() {
    return "Quack";
  }

  @Override
  public void swim() {
    System.out.println("Duck is swimming");
  }
}
