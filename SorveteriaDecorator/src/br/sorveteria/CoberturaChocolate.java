package br.sorveteria;

public class CoberturaChocolate extends SorveteDecorator {
    public CoberturaChocolate(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", com Cobertura de Chocolate";
    }
}
