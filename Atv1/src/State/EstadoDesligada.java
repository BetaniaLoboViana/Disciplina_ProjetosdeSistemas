package State;

public class EstadoDesligada implements Estado {
    @Override
    public void ligar(Televisao tv) {
        System.out.println("Ligando a televisão.");
        tv.setEstado(new EstadoLigada());
    }

    @Override
    public void desligar(Televisao tv) {
        System.out.println("A televisão já está desligada.");
    }

    @Override
    public void modoEspera(Televisao tv) {
        System.out.println("Não é possível entrar em modo de espera. A televisão está desligada.");
    }
}

