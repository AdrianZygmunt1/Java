public class enumy {
    enum Planeta {

        MERKURY(57),
        WENUS(108),
        ZIEMIA(150),
        MARS(228);

        private int odleglosc;

        Planeta(int odleglosc) {
            this.odleglosc = odleglosc; // this okresla zmienna tej klasy
        }

        public int getOdleglosc() {
            return odleglosc;
        }
    }

    enum Status {

        NOWY("Nowe zamówienie"),
        W_TRAKCIE("Realizacja"),
        GOTOWE("Zakończone");

        private String opis;

        Status(String opis) {
            this.opis = opis;
        }

        public String getOpis() {
            return opis;
        }
    }

    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN

    }

    public static void main(String[] args) {
        System.out.println(Planeta.ZIEMIA.getOdleglosc());
        System.out.println(Status.NOWY.getOpis());

        Rank a = Rank.SOLDIER;
        System.out.println(a);
    }
}
// enum stala wartosc