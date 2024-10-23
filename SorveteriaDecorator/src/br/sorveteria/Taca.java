package br.sorveteria;

public class Taca extends SorveteDecorator {
    public Taca(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco(); // Taça não adiciona custo
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", servido em Taça";
    }
}
