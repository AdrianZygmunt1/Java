import java.util.HashSet;
import java.util.LinkedHashSet;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volvo");//duplicate element will not be added
        cars.add("Mazda");
        System.out.println(cars);//print the hashset
        System.out.println(cars.size());//size of the hashset
        System.out.println(cars.contains("Mazda"));//check if the hashset contains a specific element
        cars.remove("Volvo");//remove an element from the hashset
        System.out.println(cars);//print the hashset after removing an element
        LinkedHashSet<String> linkedlistset = new LinkedHashSet<String>();
        linkedlistset.add("Volvo");
        linkedlistset.add("BMW");
        linkedlistset.add("Volvo");//duplicate element will not be added
        linkedlistset.add("Mazda");
        System.out.println(linkedlistset);//print the linkedhashset
    }
}
//hashset is a collection that contains no duplicate elements. It is based on the hash code of the elements.
//linkedhashset is a hashset that maintains the order of the elements. It is based on a hash table and a linked list.