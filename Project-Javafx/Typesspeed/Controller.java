import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.time.*;
import java.util.Random;

public class Controller {

    @FXML
    private Button easyButton;
    @FXML
    private Button mediumButton;
    @FXML
    private Button hardButton;
    @FXML
    private VBox Buttons;
    @FXML
    private Text mainlabel;
    @FXML
    private Text Tekst;
    @FXML
    private TextField pobieranie;
    @FXML
    private TextArea Area;
    @FXML
    private Button Exit;

    @FXML
    public void initialize() {
        mainlabel.setVisible(true);
        Buttons.setVisible(true);
        Tekst.setVisible(false);
        pobieranie.setVisible(false);
        Area.setVisible(false);
        Exit.setVisible(false);

        pobieranie.setOnAction(e -> sprawdz());
    }

    public void Exit() {
        mainlabel.setVisible(true);
        Buttons.setVisible(true);
        Tekst.setVisible(false);
        pobieranie.setVisible(false);
        Area.setVisible(false);
        Exit.setVisible(false);
        Area.clear();
        Tekst.setText("");
        liczbaSlow = 0;
        bledy = 0;
    }

    public void easyklikniecie() {
        Buttons.setVisible(false);
        mainlabel.setVisible(false);
        Tekst.setVisible(true);
        pobieranie.setVisible(true);
        String[] easyWords = {
                "cat", "dog", "sun", "sky", "map", "pen", "cup", "bed", "car", "box",
                "hat", "red", "run", "eat", "toy", "pie", "ice", "day", "boy", "girl"
        };
        String easyInfo = "1 błąd = +2s";
        String easyconajmniej = "\n-Wymagany czas do zaliczenia: 20 s";
        start(easyWords, LocalTime.of(0, 0, 20), 2, easyInfo, easyconajmniej);
    }

    public void mediumklikniecie() {
        Buttons.setVisible(false);
        mainlabel.setVisible(false);
        Tekst.setVisible(true);
        pobieranie.setVisible(true);

        String[] mediumWords = {
                "apple", "table", "chair", "water", "bread", "money", "phone", "light", "house", "plant",
                "beach", "train", "clock", "glass", "sugar", "paper", "river", "stone", "music", "power",
                "dream", "world", "smile", "story", "happy", "quick", "clean", "drive", "write", "learn"
        };
        String mediumInfo = "1 błąd = +4s";
        String mediumconajmniej = "\n-Wymagany czas do zaliczenia: 25 s";
        start(mediumWords, LocalTime.of(0, 0, 25), 4, mediumInfo, mediumconajmniej);
    }

    public void hardklikniecie() {
        Buttons.setVisible(false);
        mainlabel.setVisible(false);
        Tekst.setVisible(true);
        pobieranie.setVisible(true);

        String[] hardWords = {
                "computer", "keyboard", "internet", "education", "knowledge", "beautiful", "different", "important",
                "language", "adventure", "solution", "practice", "training", "business", "engineer", "software",
                "database", "security", "strategy", "analysis", "technology", "development", "environment",
                "communication", "responsibility", "organization", "opportunity", "information", "creativity",
                "productivity"
        };
        String hardInfo = "1 błąd = +5s";
        String hardconajmniej = "\n-Wymagany czas do zaliczenia: 35 s";
        start(hardWords, LocalTime.of(0, 0, 35), 5, hardInfo, hardconajmniej);
    }

    Random rand = new Random();
    int liczbaSlow = 0;
    int bledy = 0;
    String info;
    LocalTime start;
    LocalTime end;
    private String rinfoz;
    private String[] rWords;
    private int rBlad;
    private LocalTime rRekord;
    private String rconajmniej;

    public void start(String[] words, LocalTime rekord, int blad, String infoz, String conajmniej) {
        start = LocalTime.now();
        Tekst.setText(words[rand.nextInt(words.length)]);
        rinfoz = infoz;
        rWords = words;
        rRekord = rekord;
        rBlad = blad;
        rconajmniej = conajmniej;
    }

    public void sprawdz() {
        String text = pobieranie.getText();

        if (!text.equals(Tekst.getText())) {
            bledy++;
        }

        pobieranie.clear();
        liczbaSlow++;

        if (liczbaSlow < 10) {
            Tekst.setText(rWords[rand.nextInt(rWords.length)]);
        } else {
            end = LocalTime.now();
            int plussekundy = bledy * rBlad;
            Duration diff = Duration.between(start, end);
            diff = diff.plusSeconds(plussekundy);
            long hours = diff.toHours();
            long minutes = diff.toMinutes() % 60;
            long seconds = diff.getSeconds() % 60;
            Tekst.setVisible(false);
            pobieranie.setVisible(false);
            Area.setVisible(true);
            Exit.setVisible(true);
            LocalTime towjczas = LocalTime.of((int) hours, (int) minutes, (int) seconds);
            if (towjczas.equals(rRekord)) {
                info = "\n\nIdeolo";
            } else if (towjczas.isBefore(rRekord)) {
                info = "\n\nZa szybko!";
            } else {
                info = "\n\nZbyt wolno!";
            }
            Area.setEditable(false);
            this.Area.setText("- Czas rozpoczęcia: "
                    + String.format("%02d:%02d:%02d", start.getHour(), start.getMinute(),
                            start.getSecond())
                    + "\n- Czas zakończęnia: "
                    + String.format("%02d:%02d:%02d", end.getHour(), end.getMinute(),
                            end.getSecond())
                    + "\n- Liczba błedów: " + bledy + " |" + rinfoz + "\n- Całkowity czas: " + hours + " godzin, "
                    + minutes
                    + " minut, " + seconds + " sekund" + rconajmniej + info);
        }

    }
}
