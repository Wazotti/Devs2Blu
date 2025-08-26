
public class MainProduto {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.nome = "Arroz";
        p.estoque = 236;
        p.preco = 19.99;
        p.mostrarProduto();
        p.diminuirEstoque();

    }
}
