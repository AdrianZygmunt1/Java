class Machine {
    public void start() {
        System.out.println("strat...");
    }
}

public class anonimowe {
    public static void main(String[] args) {
        Machine m1 = new Machine() {
            @Override
            public void start() {
                System.out.println("woooo");
            }
        };
        Machine m2 = new Machine();
        m2.start();
    }
}
// Anonimowe klasy to sposób na rozszerzanie istniejących klas na bieżąco