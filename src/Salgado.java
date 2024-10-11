
public class Salgado extends Produto {

    private int dias;

    public Salgado(int dias, String nome, double preco) {
        super(nome, preco);
        this.dias = dias;
    }

    @Override
    public double calcularDesconto(double desconto) {
        if (dias >= 1) {
            return preco - (preco * (desconto / 100));
        } else {
            return preco;
        }
    }
}
