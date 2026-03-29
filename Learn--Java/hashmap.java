import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> points = new HashMap<String , Integer>();
        points.put("Amy", 154);
        points.put("Lucy", 23);
        points.put("Adrian", 356);
        System.out.println(points.get("Adrian"));
    }

}
/* 
HashMap jest używany do przechowywania kolekcji 
danych jako pary klucz i wartość. Jeden obiekt jest używany jako klucz (indeks) 
do innego obiektu (wartość). 
Sa rozne metody np.put, remove i get
nie może zawierać duplikatów kluczy. Dodanie nowego elementu z kluczem, który już istnieje, 
nadpisuje stary element.
*/