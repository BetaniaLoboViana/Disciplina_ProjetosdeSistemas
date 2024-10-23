package br.sorveteria;

public class CoberturaMorango extends SorveteDecorator {
    public CoberturaMorango(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", com Cobertura de Morango";
    }
}
