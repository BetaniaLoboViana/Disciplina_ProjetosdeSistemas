package decorator;

public class Main {
    public static void main(String[] args) {
        // Criar uma palavra simples
        Texto palavra = new Palavra("Exemplo");

        // Aplicar formatações de forma dinâmica
        Texto palavraNegrito = new NegritoDecorator(palavra);
        Texto palavraNegritoItalico = new ItalicoDecorator(palavraNegrito);
        Texto palavraNegritoItalicoSublinhado = new SublinhadoDecorator(palavraNegritoItalico);

        // Exibir as diferentes formatações
        System.out.println("Texto simples: " + palavra.render());
        System.out.println("Texto em negrito: " + palavraNegrito.render());
        System.out.println("Texto em negrito e itálico: " + palavraNegritoItalico.render());
        System.out.println("Texto em negrito, itálico e sublinhado: " + palavraNegritoItalicoSublinhado.render());
    }
}
