interface Biblioteka{
    public void czytanie();
    public void krzyk();
}

class Biblioteka1 implements Biblioteka{
    public void czytanie(){
        System.out.println("Dziady");
    }
    public void krzyk(){
        System.out.println("aaaaaaa");
    }
}

public class Interfejsy {
    public static void main(String[] args) {
        Biblioteka1 bib = new Biblioteka1();
        bib.czytanie();
        bib.krzyk();
    }
}
/*
Interfejs to całkowicie abstrakcyjna klasa, która zawiera tylko metody abstrakcyjne.

Niektóre specyfikacje dla interfejsów:

- Zdefiniowane za pomocą słowa kluczowego interface.

- Mogą zawierać tylko statyczne, finalne zmienne.

- Nie mogą zawierać konstruktora, ponieważ interfejsy nie mogą być tworzone.

- Interfejsy mogą rozszerzać inne interfejsy.

- Klasa może implementować dowolną ilość interfejsów.


*/