package com.safin.aviary;

import com.safin.animals.Animal;
import com.safin.size.Size;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
  private Size aviarySize;
  private Map<String, T> animals = new HashMap<>();

  public Aviary(Size aviarySize) {
    this.aviarySize = aviarySize;
  }

  public void add(T animal) {
    if (animal.getSize() == aviarySize) {
      animals.put(animal.getName(), animal);
      System.out.println("The animal was added");
    } else {
      System.out.println("Aviary size does not fit for" + animal.getName());
    }
  }

  public void remove(T animal) {
    animals.remove(animal.getName());
    System.out.println("The animal was removed");
  }

  public T getAnimal(String name) {
    return animals.get(name);
  }
}
