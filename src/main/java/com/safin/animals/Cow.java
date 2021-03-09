package com.safin.animals;

import com.safin.size.Size;

public class Cow extends Herbivore implements Run, Voice {

  public Cow(String name) {
    super(name);
    size = Size.LARGE;
  }

  @Override
  public void run() {
    System.out.println("Cow is running");
  }

  @Override
  public String voice() {
    return "Moo";
  }
}
