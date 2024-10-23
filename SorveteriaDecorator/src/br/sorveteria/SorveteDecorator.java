package br.sorveteria;

public abstract class SorveteDecorator implements Sorvete {
    protected Sorvete sorvete;

    public SorveteDecorator(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco();
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao();
    }
}
