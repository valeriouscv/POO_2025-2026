package aula02;
public class Animal {
    //caracteristicas (atributos) - o que TEM
    String nome;
    String especie;
    int altura;
    int peso;
    char genero;

        //construtor
    public Animal(){
        nome = "";
        especie = "";
        altura = 0;
        peso = 0;
        genero=' ';
    }
    public Animal(String novoNome){
        nome = novoNome;
        especie = "";
        altura = 0;
        peso = 0;
        genero=' ';
    }
    public Animal(String novoNome, String novaEspecie, int novaAltura, int novoPeso, char novoGenero){
        nome = novoNome;
        especie = novaEspecie;
        altura = novaAltura;
        peso = novoPeso;
        genero=novoGenero;
    }


    //comportamento (metodos) - o que FAZ
    void come(){
        System.out.println(nome+" come..");
    }
    void dorme(){
        System.out.println(nome+" dorme..");
    }
}