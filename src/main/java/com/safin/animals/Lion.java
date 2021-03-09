package com.safin.animals;

import com.safin.size.Size;

public class Lion extends Carnivorous implements Run, Voice {
  public Lion(String name) {
    super(name);
    size = Size.MEDIUM;
  }

  @Override
  public void run() {
    System.out.println("Lion is running");
  }

  @Override
  public String voice() {
    return "Roar";
  }
}
