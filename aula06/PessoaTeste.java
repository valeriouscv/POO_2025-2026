package aula06;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa zinsky = new Pessoa("Zinsky", 19);
        Pessoa helder = new Pessoa("Helder",19,182);
        helder.setGenero('f');
        System.out.println(helder.mostra());
        zinsky.setGenero('m');
        zinsky.setPeso(120);
        zinsky.setAltura(181);
        //System.out.println("Nome: "+helder.getNome());
        //System.out.println(zinsky.toString());
        //System.out.println(zinsky);
        //System.out.println(helder);
    }
}
