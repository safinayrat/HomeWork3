package com.safin.animals;

import com.safin.size.Size;

public class Wolf extends Carnivorous implements Run, Voice {
  public Wolf(String name) {
    super(name);
    size = Size.MEDIUM;
  }

  @Override
  public void run() {
    System.out.println("Wolf is running");
  }

  @Override
  public String voice() {
    return "wolf howl";
  }
}
