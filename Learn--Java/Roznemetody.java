class Animal {
    void bark() {
        System.out.println("Woof-Woof");
    }

    void meow() {
        System.out.println("Meow-Meow");
    }
}

public class Roznemetody {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.bark();

        Animal cat = new Animal();
        cat.meow();
    }
}
