package aula06;

public class Automovel {
    //atributos
    private String marca;
    private String matricula;
    private int cilindrada;

    //construtores
    public Automovel(String marca, String matricula, int cilindrada) {
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }
    public Automovel(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = 1000;
    }

    
}
