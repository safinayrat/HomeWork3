package com.safin.animals;

import com.safin.size.Size;

public class Shark extends Carnivorous implements Swim {
  public Shark(String name) {
    super(name);
    size = Size.LARGE;
  }

  @Override
  public void swim() {
    System.out.println("Shark is swimming");
  }
}
