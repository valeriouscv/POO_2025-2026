package aula05;

public class Animal {
    private String nome;
    private String especie;
    public int idade;            //idade - variavel de Objetos ou de Instância
    public static int ano =2025; //ano   - variavel de Classes ou Estáticas

    public Animal(String novoNome, String novaEspecie) {
        nome = novoNome;
        especie = novaEspecie;
        idade = 0;
    }

    
}
