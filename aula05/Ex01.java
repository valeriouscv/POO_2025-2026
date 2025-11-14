package aula05;

public class Ex01 {
    int idade = 16;
    public static void mostra(){
        int idade = 13; //variavel local
        System.out.println("idade: "+idade);
    }
    public static void main(String[] args) {
        final double PI = 3.1415; //final - modificador usado para constantes
        System.out.println("PI: "+PI);    

        //tipos de dados primitivos
        int idade=19;
        System.out.println("idade: "+idade);

        //zinsky e kelly sao variavel de referencia;
        Animal zinsky = new Animal("Zinsky", "Homo Sapiens"); 
        zinsky.idade = 19;
        System.out.println("Idade Zinsky: "+zinsky.idade);
        //idade - variavel de Objetos ou de Instância
        Animal kelly = new Animal("Kelly", "Homo Sapiens"); 
        kelly.idade = 16;
        System.out.println("Idade Kelly: "+kelly.idade);

       System.out.println("Zinsy Ano: "+zinsky.ano);
       System.out.println("Kely Ano: "+kelly.ano);
       zinsky.ano = 2026; //ano - variavel de Classes ou Estáticas
       System.out.println("Zinsy Ano: "+zinsky.ano);
       System.out.println("Kely Ano: "+kelly.ano);

       mostra();
       
    }
}
