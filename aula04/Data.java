package aula04;

public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Data(int novoDia, int novoMes, int novoAno){
        //dia = novoDia;
        //mes = novoMes;
        //ano = novoAno;
         setDia(novoDia);
         setMes(novoMes);
         setAno(novoAno);
    }
    //metodos

    //getters e setters
    //ano
    public void setAno(int novoAno){
        if(novoAno < 0){
            System.out.println("Ano invalido. Nao pode ser negativo");
            return;
        }
        ano = novoAno;
    }
    public int getAno(){
        return ano;
    }
    //mes
    public void setMes(int novoMes){
        if(novoMes <1 || novoMes > 12){
            System.out.println("Mes invalido. Mes deve estar entre 1 a 12");
            mes = 1;
            return;
        }
        mes = novoMes;
    }
    public int getMes(){
        return mes;
    }
    //dia
    public void setDia(int novoDia){
        if(novoDia <1 || novoDia >31){
            System.out.println("Dia invalido. Dia deve estar entre 1 a 31");
            dia = 1;
        }
        dia = novoDia;
    }
    public int getDia(){
        return dia;
    }
}
