class Animal {
    public void makeSound() {
        System.out.println("Hi");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
}