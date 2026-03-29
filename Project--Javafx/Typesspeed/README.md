# TypeSpeed JavaFX 🚀

Prosta i szybka gra zręcznościowa sprawdzająca szybkość pisania na klawiaturze, zbudowana w JavaFX.

## Wymagania
* **Java 26** (lub nowsza)
* **JavaFX SDK 26** (pobrany lokalnie)

## Jak uruchomić bez narzędzi budowania

Repozytorium zawiera tylko kod źródłowy (`src`). Aby uruchomić grę:

1. Pobierz **JavaFX SDK 26** ze strony [Gluon](https://gluonhq.com/products/javafx/).
2. Uruchom poniższe komendy w folderze projektu (zmień `SCIEZKA` na swoją):

```bash
# 1. Utwórz folder na pliki skompilowane
mkdir bin

# 2. Kompilacja plików Java
javac --module-path "SCIEZKA/lib" --add-modules javafx.controls,javafx.fxml -d bin src/*.java

# 3. Kopiowanie pliku widoku (Ważne!)
cp src/mainscene.fxml bin/

# 4. Uruchomienie gry
java --module-path "SCIEZKA/lib" --add-modules javafx.controls,javafx.fxml -cp bin Main

## Autor
* **Adrian Zygmunt** - [Adrian Zygmunt](https://github.com/AdrianZygmunt1)