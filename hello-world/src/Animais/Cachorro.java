package Animais;

public class Cachorro extends Animal {


    //atributos

    static int numeroDeCachorros;
    private int tamanhoDoRabo;


    //Construtores

    public Cachorro(String nome, String cor, int altura, int tamanhoDoRabo, double peso, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }



    //metodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

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

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au Au");;
    }
}
