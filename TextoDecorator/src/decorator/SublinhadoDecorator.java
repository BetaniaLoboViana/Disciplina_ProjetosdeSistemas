package decorator;

public class SublinhadoDecorator extends FormatDecorator {

    public SublinhadoDecorator(Texto textoDecorado) {
        super(textoDecorado); 
    }

    @Override
    public String render() {
        return "<u>" + textoDecorado.render() + "</u>"; // Retorna o texto sublinhado
    }
}
