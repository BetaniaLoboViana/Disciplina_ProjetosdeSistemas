package State;

public interface Estado {
    void ligar(Televisao tv);
    void desligar(Televisao tv);
    void modoEspera(Televisao tv);
}