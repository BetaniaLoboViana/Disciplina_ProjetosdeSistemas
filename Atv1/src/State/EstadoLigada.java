package State;

public class EstadoLigada implements Estado {
    public void ligar(Televisao tv) {
        System.out.println("A TV já está ligada.");
    }

    public void desligar(Televisao tv) {
        System.out.println("Desligando a TV...");
        tv.setEstado(new EstadoDesligada());
    }

    public void entrarEspera(Televisao tv) {
        System.out.println("Colocando a TV em modo de espera...");
        tv.setEstado(new EstadoEmEspera());
    }

    public void modoEspera(Televisao tv) {
        System.out.println("Colocando a TV em modo de espera...");
        tv.setEstado(new EstadoEmEspera());
}}
