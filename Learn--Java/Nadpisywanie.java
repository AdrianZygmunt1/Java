class Szkola {
    public void hi() {
        System.out.println("hello");
    }

}

class szkola2 extends Szkola {
    public void hi() {
        System.out.println("czescc");
    }
}

public class Nadpisywanie {
    public static void main(String[] args) {
        szkola2 sz = new szkola2();
        sz.hi();
    }
}
// nadpisujemy metode zmieniamy jej funkjce