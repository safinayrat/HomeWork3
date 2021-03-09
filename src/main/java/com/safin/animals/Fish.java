package com.safin.animals;

import com.safin.size.Size;

public class Fish extends Herbivore implements Swim {
  public Fish(String name) {
    super(name);
    size = Size.MINIMAL;
  }

  @Override
  public void swim() {
    System.out.println("Fish is swimming");
  }
}
