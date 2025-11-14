package aula04;

public class DataTeste {
    public static void main(String[] args) {
        Data aniv = new Data(17, 14, 2006);
        //aniv.setMes(14);
        System.out.println(aniv.getDia() + "/"+ aniv.getMes()+"/"+aniv.getAno());
    }
}
