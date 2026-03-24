import java.util.LinkedList;
public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>(); 
        c.add("red");
        c.add("blue");
        c.add("yellow");
        c.add("orange");
        c.add("black");
        System.out.println(c);
        System.out.println(c.contains("orange"));
        System.out.println(c.size());
        System.out.println(c.get(2)+"\n");
        for(String s :c){
            System.out.println(s);
        }
    }
}
//Nie możesz określić początkowej pojemności dla LinkedList.
/* ArrayList jest lepszy do przechowywania i dostępu do danych, 
ponieważ jest bardzo podobny do normalnej tablicy.
LinkedList jest lepszy do manipulacji danymi, takimi jak liczne 
operacje wstawiania i usuwania. 
Oprócz przechowywania obiektu, LinkedList przechowuje adres pamięci elementu*/
