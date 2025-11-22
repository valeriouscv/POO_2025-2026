package aula06;

public class Automovel {
    //atributos
    private String marca;
    private String matricula;
    private int cilindrada;
    private static int qtd=0;

    //construtores
    public Automovel(String marca, String matricula, int cilindrada) {
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        qtd++;
    }
    public Automovel(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = 1000;
        qtd++;
    }


    //getters and setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static int getQtd() {
        return qtd;
    }

    public void mostra(){
        System.out.println("Automovel com matrícula "+ matricula +" é um " + marca+" e tem cilindrada de "+cilindrada+" cc");
    }
    @Override
    public String toString() {
        return "Automovel com matrícula "+ matricula +" é um " + marca+" e tem cilindrada de "+cilindrada+" cc";  
    }
    //metodo estático - ou seja é um método da classe
    public static void diffCilindrada(Automovel auto1, Automovel auto2){
        int cilindradaAuto1 = auto1.getCilindrada();
        int cilindradaAuto2 = auto2.getCilindrada();
        int difCilind = 0;
        if(cilindradaAuto1 > cilindradaAuto2){
            System.out.println("O automovel "+ auto1.getMarca() + " tem cilindrada maior que " + auto2.getMarca());
            difCilind = cilindradaAuto1 - cilindradaAuto2;
        }else{
            if(cilindradaAuto2 > cilindradaAuto1)
                System.out.println("O automovel "+ auto2.getMarca() + " tem cilindrada maior que " + auto1.getMarca());
            else
                System.out.println("O automovel "+ auto2.getMarca() + " tem a mesma cilindrada  que o "+auto1.getMarca());
            difCilind = cilindradaAuto2 - cilindradaAuto1;
        }
        System.out.println("Diferenca Cilindrada: "+difCilind);
    }
}
