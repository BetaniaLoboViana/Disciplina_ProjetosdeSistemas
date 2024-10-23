package State;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();

        tv.ligar();            // Ligando a TV
        tv.modoEspera();      // Colocando a TV em espera
        tv.ligar();            // Ligando a TV a partir do modo de espera
        tv.desligar();          // Desligando a TV
    }
}
