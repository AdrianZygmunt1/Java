/* Sa daw typy wyjatkow sprawdzone i niezaznaczone roznia sie tym
ze wyjatki sprawdzone sa podczas kompilacji kodu uruchomienia go a wyjatki 
niezaznaczone  sa sprawdzane podczas uzywania kodu 
przykladem takiego spradzonego jest Thread.sleep() rzuca wyjątkiem InterruptedException*/
public class typywyjatkow {
  public static void main(String[ ] args) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //spradzone typ wyjatku
    }
    /* natomiast takim ktore sa sprawdzane w czasie wykonywania kody moze byc przyklad */
    int value = 7;
    value = value /0;//Przykład (podczas próby podzielenia przez 0):

  }
}
