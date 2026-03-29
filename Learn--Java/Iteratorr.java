import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iteratorr {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Iterator<String> it = cars.iterator();
        String firstcar = it.next();// returns the first element in the linkedlist
        System.out.println(firstcar);
        String secondcar = it.next();// returns the second element in the linkedlist
        System.out.println(secondcar);
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> itt = list.iterator();
        itt.next();// returns the first element in the arraylist
        System.out.println(itt.next());// returns the second element in the arraylist
        //20
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Giraffe");
        Iterator<String> ittt = animals.iterator();
        while (ittt.hasNext()) {// returns true if there is a next element in the linkedlist
            System.out.println(ittt.next());// returns the next element in the linkedlist
        }
    }
}
