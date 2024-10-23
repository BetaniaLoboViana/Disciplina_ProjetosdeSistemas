package br.sorveteria;

public class Casquinha extends SorveteDecorator {
    public Casquinha(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 1.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", servido em Casquinha";
    }
}
