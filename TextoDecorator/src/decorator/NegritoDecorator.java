package decorator;

public class NegritoDecorator extends FormatDecorator {

    public NegritoDecorator(Texto textoDecorado) {
        super(textoDecorado); 
    }

    @Override
    public String render() {
        return "<b>" + textoDecorado.render() + "</b>"; // Retorna o texto em negrito
    }
}
