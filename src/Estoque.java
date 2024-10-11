
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(double desconto) {
        for (Produto produto : produtos) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
                    + "\nProduto: " + produto.getNome()
                    + "\nPreço original: R$ " + produto.getPreco()
                    + "\nPreço com desconto: R$ " + produto.calcularDesconto(desconto)
                    + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

}
