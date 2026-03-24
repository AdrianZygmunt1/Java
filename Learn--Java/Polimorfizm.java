class Animal1 {
  public void makeSound() {
    System.out.println("Grr...");
  }
}

class Cat extends Animal1 {
  public void makeSound() {
    System.out.println("Meow");
  }
}

class Dog extends Animal1 {
  public void makeSound() {
    System.out.println("Woof");
  }
}

public class Polimorfizm {
  public static void main(String[] args) {
    Animal1 a = new Dog();
    Animal1 b = new Cat();
    a.makeSound();
    b.makeSound();
  }
}
/*
 * Polimorfizm w Javie to mechanizm programowania obiektowego,
 * który pozwala traktować obiekty różnych klas w jednolity sposób poprzez
 * wspólny typ nadrzędny,
 * przy czym wywołanie tej samej metody może prowadzić do różnych zachowań w
 * zależności od rzeczywistego typu obiektu,
 * który został utworzony w pamięci.
 */