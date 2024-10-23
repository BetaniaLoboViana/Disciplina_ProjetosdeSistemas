package br.sorveteria;

public class Main {
    public static void main(String[] args) {
        // Criando um sorvete simples de Chocolate com preço de R$1.50
        Sorvete sorvete = new SorveteSimples("Chocolate", 1.50);

        // Adicionando Casquinha e Cobertura de Chocolate
        sorvete = new Casquinha(sorvete);
        sorvete = new CoberturaChocolate(sorvete);

        // Exibindo a descrição e o preço final do sorvete
        System.out.println(sorvete.getDescricao() + " custa R$ " + sorvete.getPreco());
    }
}
