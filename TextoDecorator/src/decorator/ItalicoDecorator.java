package decorator;

public class ItalicoDecorator extends FormatDecorator {

    public ItalicoDecorator(Texto textoDecorado) {
        super(textoDecorado); 
    }

    @Override
    public String render() {
        return "<i>" + textoDecorado.render() + "</i>"; // Retorna o texto em itálico
    }
}
