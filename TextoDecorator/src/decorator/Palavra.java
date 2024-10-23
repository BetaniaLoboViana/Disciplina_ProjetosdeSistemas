package decorator;

public class Palavra implements Texto {
    private String conteudo; // Conteúdo da palavra

    public Palavra(String conteudo) {
        this.conteudo = conteudo; // Inicializa o conteúdo da palavra
    }

    @Override
    public String render() {
        return "<span>" + conteudo + "</span>"; // Retorna a palavra em formato span
    }

    @Override
    public String text() {
        return conteudo; // Retorna o conteúdo da palavra
    }
}
