import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Rex", "Marrom", 25, 5, 5.5, "nada");

        Gato gato1 = new Gato("Felix", "Preto", 4.5);

        Passaro passaro1 = new Passaro("Roger", "Azul", 0.5);


        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}