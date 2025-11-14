package aula04;
public class Animal {
    //atributos
    private String nome;
    private String especie;
    private int altura;
    private int peso;
    private char genero;

    //construtor
    public Animal(String novoNome, String novaEspecie){
        nome = novoNome;
        especie = novaEspecie;
        altura = 0;
        peso = 0;
        genero = ' ';
    }
    //metodos
    public void mostraAnimal(){
        System.out.println("o '"+nome+ "' eh um animal da especie: "+especie+". Ele mede "+altura + " cm e pesa "+peso+" Kg");
    }

    //getters & setters 
    //set - para alterar valor do atributo. 
    //get - devolver o valor do atributo
    public int getAltura(){
        return altura;
    }
    public void setAlura(int novaAltura){
        altura = novaAltura;
    }

    public int getPeso(){
        return peso;
    }
    public void setPeso(int novoPeso){
        peso = novoPeso;
    }
}
