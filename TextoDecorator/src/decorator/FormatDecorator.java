package decorator;

public abstract class FormatDecorator implements Texto {
    protected Texto textoDecorado; 

    public FormatDecorator(Texto textoDecorado) {
        this.textoDecorado = textoDecorado; 
    }

    @Override
    public String text() {
        return textoDecorado.text(); 
    }
}
