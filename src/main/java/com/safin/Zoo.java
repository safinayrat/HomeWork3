package com.safin;

import com.safin.animals.*;
import com.safin.aviary.Aviary;
import com.safin.food.*;
import com.safin.size.Size;


public class Zoo {
  public static void main(String[] args) {
    Cow cow = new Cow("Cow");
    Duck duck = new Duck("Duck");
    Fish fish = new Fish("Fish");
    Lion lion = new Lion("Lion");
    Shark shark = new Shark("Shark");
    Wolf wolf = new Wolf("Wolf");

    Food algae = new Algae();
    Food beef = new Beef();
    Food fishMeat = new FishMeat();
    Food hay = new Hay();

    Animal[] pond = {duck, fish, shark};
    for (Animal animal : pond) {
      Swim swimAnimal = (Swim) animal;
      swimAnimal.swim();
    }
    System.out.println(cow.getSatiety());
    Aviary<Animal> aviary = new Aviary<>(Size.SMALL);
    aviary.add(duck);
    aviary.add(shark);

    Worker worker = new Worker();
    worker.feed(cow, hay);
    worker.feed(lion, beef);
    worker.feed(duck, fishMeat);
    worker.feed(wolf, algae);
    worker.getVoice(cow);
  }
}
