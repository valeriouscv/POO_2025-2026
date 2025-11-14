package aula05;

public class Tempo {
    //atributos
    private int hora;
    private int minuto;
    private int segundo;

    //construtor
    public Tempo(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    public Tempo(int novaHora, int novoMinuto, int novoSegundo){
        setHora(novaHora);
        setMinuto(novoMinuto);
        setSegundo(novoSegundo);
    }

    //getters & setters
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setHora(int novaHora){
        if(novaHora < 0 || novaHora > 23){
            System.out.println("Erro. Hora invalida");
            return;
        }
        hora = novaHora;
    }
    public void setMinuto(int novoMinuto){
        if(novoMinuto < 0 || novoMinuto > 59){
            System.out.println("Erro. Hora invalida");
            return;
        }
        minuto = novoMinuto;
    }
    public void setSegundo(int novoSegundo){
        if(novoSegundo < 0 || novoSegundo > 59){
            System.out.println("Erro. Hora invalida");
            return;
        }
        segundo = novoSegundo;
    }

    //metodos
    public void mostraHora(){
        System.out.println("Hora no formato: HHMMSS");
        System.out.println(hora+""+minuto+""+segundo);
    }
    public void mostraHoraAMPM(){
        //A classe deve permitir imprimir o tempo no formato "hh:mm:ss AM (ou PM)".
        int horaTemp = hora;
        if(hora == 0) horaTemp=12;
        if(hora <=12){
            System.out.println(horaTemp + ":"+minuto+":"+segundo+ " (AM)");
        }else{
            horaTemp = hora - 12;
             System.out.println(horaTemp + ":"+minuto+":"+segundo+ " (PM)");
        }
    }

    public void maisUmSegundo(){
        if (segundo == 59) {
            segundo = 0;
            if(minuto == 59){
                minuto = 0;
                if(hora == 23){
                    hora = 0;
                }else{
                    hora = hora +1;
                }
            }else{
                minuto = minuto+1;
            } 
        }else{
            segundo = segundo +1;
        }
    }
}
