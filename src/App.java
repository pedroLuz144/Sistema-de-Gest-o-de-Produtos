
public class App {

    public static void main(String[] args) {
        System.out.println("Olá Gestor!");

        Estoque estoque = new Estoque();

        Produto Vinho80 = new Vinho(44, "Vinho de 44 anos", 300);
        Produto SalgadoDeOnti = new Salgado(1, "Esfiha de Frango", 5);
        Produto Vinho2022 = new Vinho(2, "Vinho 2K22", 50);
        Produto SalgadaoNovo = new Salgado(0, "Hamburgao", 5);

        estoque.adicionarProduto(Vinho80);
        estoque.adicionarProduto(SalgadoDeOnti);
        estoque.adicionarProduto(Vinho2022);
        estoque.adicionarProduto(SalgadaoNovo);

        estoque.exibirPrecosComDesconto(5);
    }
}
