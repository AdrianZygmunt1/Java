import java.util.ArrayList;
public class arraylist {

    public static void main(String[] args) {
        ArrayList colors = new ArrayList();//bez okreslenia pojemnosci
        ArrayList<String> color = new ArrayList<String>(10); // ArrayList o typie String z początkowym rozmiarem 10
        color.add("red");//dodawanie do tablicy
        color.add("blue");//dodawanie do tablicy
        color.add("yellow");//dodawanie do tablicy
        color.add("orange");//dodawanie do tablicy
        color.add("black");//dodawanie do tablicy
        System.out.println(color);
        System.out.println(color.contains("orange"));
        System.out.println(color.size());
        System.out.println(color.get(2));
    }
}

/*contains(): Zwraca true, jeśli lista zawiera określony element

-get(int index): Zwraca element na określonej pozycji na liście

-size(): Zwraca liczbę elementów na liście

-clear(): Usuwa wszystkie elementy z listy */