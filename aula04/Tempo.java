package aula04;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tempo(int h, int m, int s) {
        hora = h;
        minuto = m;
        segundo = s;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int h) {
        hora = h;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int m) {
        minuto = m;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int s) {
        segundo = s;
    }

    public void imprimeTempo(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
    
}
