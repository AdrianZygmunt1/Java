import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class sorttab {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Giraffe");
        Collections.sort(animals);//sort the arraylist in ascending order
        System.out.println(animals);
        System.out.println(Collections.max(animals));
        System.out.println(Collections.min(animals));
        Collections.reverse(animals);//reverse the order of the arraylist
        System.out.println(animals);
        Collections.shuffle(animals);//shuffle the elements of the arraylist(randomize the order)
        System.out.println(animals);

        }}   
    