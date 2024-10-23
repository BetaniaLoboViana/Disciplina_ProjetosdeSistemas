package br.sorveteria;

public class Copo extends SorveteDecorator {
    public Copo(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.20;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", servido em Copo";
    }
}
