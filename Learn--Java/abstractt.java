abstract class Trabka {
    int trabniecia = 0;

    abstract void makeSound();
}

class puzon extends Trabka {
    public void makeSound() {
        System.out.println("puuu");
    }
}

public class abstractt {
    public static void main(String[] args) {
        puzon pz = new puzon();
        pz.makeSound();
    }
}
/*
 * abstract oznacza, że klasa nie może być bezpośrednio tworzona jako obiekt i
 * służy jako baza dla innych klas.
 * Może zawierać metody bez implementacji, które podklasy muszą obowiązkowo
 * zaimplementować.
 */