package br.sorveteria;

public class CoberturaCaramelo extends SorveteDecorator {
    public CoberturaCaramelo(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", com Cobertura de Caramelo";
    }
}
