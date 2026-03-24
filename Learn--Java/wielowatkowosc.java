class A extends Thread {//podstawowy program

    public void run() {
        System.out.println("Hello");
    }

public class wielowatkowosc {
    public static void main(String[] args) {

        A object = new A();   // tworzymy obiekt wątku
        object.start();       // uruchamiamy wątek

    }
}
}
/* 
Java to wielowątkowy język programowania. Oznacza to, że nasz program może optymalnie wykorzystać dostępne zasoby poprzez równoczesne działanie
dwóch lub więcej komponentów, z których każdy obsługuje inne zadanie.
Możesz podzielić konkretne operacje w ramach pojedynczej aplikacji na indywidualne wątki, które wszystkie działają równolegle.

Kazdy watek ma priorytet aby pomoc okreslic kolejnosc 
Priorytet jest ustawiony automatycznie na 5
mozna go ustawic za pomoca "setPriority()" od 1 do 10
*/