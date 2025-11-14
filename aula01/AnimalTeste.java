package aula01;
public class AnimalTeste {
    public static void main(String[] args) {

        Animal gato = new Animal();
        gato.nome = "Zinsky";
        gato.come();

        Animal cao = new Animal();
        cao.nome = "Uau uau";
        cao.dorme();
    }
}
