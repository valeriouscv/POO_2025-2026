package aula05;

public class TempoTeste {
    public static void main(String[] args) {
        Tempo t = new Tempo(23,59,59);
        t.maisUmSegundo();
        t.mostraHora();
        t.mostraHoraAMPM();
    }

}
