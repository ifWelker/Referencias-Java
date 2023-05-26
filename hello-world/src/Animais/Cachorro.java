package Animais;

public class Cachorro {


    //atributos

    private String nome, cor;
    private int altura, tamanhoDoRabo;
    private double peso;
    private String estadoDeEspirito;

    //Construtores

    public Cachorro()
    {

    }
    public Cachorro(String nome, String cor, int altura, int tamanhoDoRabo, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }


    //metodos

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void comer() {

    }

    public void latir() {
        System.out.println("AU AU!!!");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bavo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "tliste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }
        return estadoDeEspirito;
    }

}
