public class wyjatki {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            System.out.println(a[5]);//nie ma w tablicy wartosci 5
        }catch(Exception e){
            System.out.println("error");
        }
    }
}
/* Wyjątek to problem, który pojawia się podczas wykonywania programu. Wyjątki powodują nieprawidłowe zakończenie programu.

Obsługa wyjątków to potężny mechanizm, który obsługuje błędy występujące w czasie wykonania programu, aby utrzymać normalny przepływ aplikacji.

Wyjątek może wystąpić z wielu różnych powodów. Oto kilka przykładów:

- Użytkownik wprowadził nieprawidłowe dane.

- Plik, który należy otworzyć, nie może być znaleziony.

- Połączenie sieciowe zostało przerwane w trakcie komunikacji.

- Niewystarczająca pamięć i inne problemy związane z zasobami fizycznymi. */