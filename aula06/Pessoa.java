package aula06;

public class Pessoa {
    //atributos
    private String nome;
    private int idade; //em anos
    private int altura; //em cm
    private double peso; // em kg
    private char genero; //valores validos: 'f'.'F','m','M'

    //construtores
    public Pessoa(String nome, int idade, int altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0;
        this.genero=' ';
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.altura = 0;
        this.peso = 0;
        this.genero=' ';
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String mostra(){
        StringBuilder sb = new StringBuilder();
        sb.append("------------- Pessoa ---------------\n");
        sb.append("Nome: ");
        sb.append(this.nome);
        sb.append("\n");
        sb.append("Idade: ");
        sb.append(this.idade);
        sb.append("\n");
        sb.append("Peso: ");
        sb.append(this.peso);
        sb.append("\n");
        sb.append("Genero: ");
        switch (this.genero) {
            case 'm':
            case 'M':
                 sb.append("Masculino");
                break;
            case 'f':
            case 'F':
                 sb.append("Feminino");
                break;
            default: sb.append("Indefinido");
        }
        sb.append("\n------------------------------------\n");
        return sb.toString();
    }
    //Método toString
    @Override
    public String toString() {
        String pessoa = "\n---------- Pessoa -----------"+"\nNome: "+this.nome+"\nIdade: "+this.idade+" anos"+"\nAltura: "+this.altura+" cm"+"\nPeso: "+this.peso+" Kg";
        if(this.genero == 'm' || genero == 'M')
            return  pessoa+="\nGenero: Masculino"+"\n------------------------------";
        if (this.genero == 'f' || genero == 'F') {
            return  pessoa+="\nGenero: Feminino"+"\n------------------------------";
        }
        return  pessoa+="\nGenero: Indefinido"+"\n------------------------------";
    }
    

}
