import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        //Classe classeDeReferencia = new objeto(construtor)
        Cachorro cachorro1 = new Cachorro("nilo","Bege", 30,5,6,"Feliz");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Animal gato2 = new Gato("Maverick", "Siames", 3);
        Animal animal1 = new Passaro("Batman", "preto", 4);

        cachorro1.soar();
        gato1.soar();
        animal1.soar();



        //Usado pro Polimorfismo
//        Cachorro cachorro1 = new Cachorro("Rex", "Marrom", 25, 5, 5.5, "nada");
//
//        Passaro passaro1 = new Passaro("Roger", "Azul", 0.5);


        //usado pro polimorfismo
//        PetShop petShop = new PetShop();
//
//        petShop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//        petShop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//        petShop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//        petShop.deixarNoHotel(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//        petShop.deixarNoHotel(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());

    }
}