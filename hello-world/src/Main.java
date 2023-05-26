import Animais.Cachorro;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("Pup");
        cachorro1.setNome("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);

        cachorro1.latir();
        cachorro1.pegar();
        System.out.println(cachorro1.pegar());

        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("vai dormir"));
        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("nada"));

    }
}