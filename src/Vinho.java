
public class Vinho extends Produto {

    private int idade;

    public Vinho(int idade, String nome, double preco) {
        super(nome, preco);
        this.idade = idade;
    }

    @Override
    public double calcularDesconto(double desconto) {
        if (idade < 5) {
            return preco - (preco * (desconto / 100)) - 10;
        } else {
            return preco - (preco * (desconto / 100));
        }
    }
}
