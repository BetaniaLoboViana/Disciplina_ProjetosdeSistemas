package State;

public class Televisao {
    private Estado estado;

    public Televisao() {
        // A TV começa desligada
        estado = new EstadoDesligada();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void ligar() {
        estado.ligar(this);
    }

    public void desligar() {
        estado.desligar(this);
    }

    public void modoEspera() {
        estado.modoEspera(this);
    }
}
