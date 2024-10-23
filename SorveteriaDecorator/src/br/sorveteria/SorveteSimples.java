package br.sorveteria;

public class SorveteSimples implements Sorvete {
    private String sabor;
    private double preco;

    public SorveteSimples(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return sabor;
    }
}
