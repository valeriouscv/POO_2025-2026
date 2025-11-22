package aula06;

public class AutomovelTeste {
    public static void main(String[] args) {
        Automovel ferrari = new Automovel("Ferrari", "ST-AA-00");
        ferrari.setCilindrada(2500);
        Automovel renault = new Automovel("Renault", "ST-AB-01",2000);
        renault.setMatricula("ST-01-VA");
        //renault.mostra();

        //ferrari.diffCilindrada(renault);
        //renault.diffCilindrada(ferrari);
        Automovel.diffCilindrada(renault, ferrari);
        
        //Quantidade de instancias criadas
        System.out.println("Quantidade de instancias criadas: "+Automovel.getQtd());
        
    }
}
