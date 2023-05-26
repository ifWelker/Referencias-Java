import Animais.Cachorro;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrim", 25, 5, 5.5,"nada");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getAltura());
        System.out.println(cachorro2.getPeso());

        System.out.println("O Cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O Cachorro esta " + cachorro1.interagir("vai dormir"));
        System.out.println("O Cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O Cachorro esta " + cachorro1.interagir("nada"));

    }
}