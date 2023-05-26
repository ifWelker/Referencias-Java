package Animais;

public class Gato extends Animal {

    //Atributos
    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");;
    }
}
