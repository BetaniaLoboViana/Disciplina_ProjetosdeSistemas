package State;

public class EstadoEmEspera implements Estado {
    @Override
    public void ligar(Televisao tv) {
        System.out.println("Ligando a televisão.");
        tv.setEstado(new EstadoLigada());
    }

    @Override
    public void desligar(Televisao tv) {
        System.out.println("Desligando a televisão.");
        tv.setEstado(new EstadoDesligada());
    }

    @Override
    public void modoEspera(Televisao tv) {
        System.out.println("A televisão já está em modo de espera.");
    }
}

