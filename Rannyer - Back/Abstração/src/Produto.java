import java.util.Random;
import java.util.Scanner;

public class Produto {
    public int id;
    public String nome;
    public double preco;
    public int estoque;
    Scanner scan =  new Scanner(System.in);

    public Produto(){
        this.id = new Random().nextInt(1000,10000);
    }
    public void mostrarProduto(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.estoque);
    }
    public void diminuirEstoque(){
        System.out.print("Quantas unidades de " + this.nome + " você quer diminuir do estoque? ");
        int qtd = scan.nextInt();
        if(qtd > this.estoque){
            System.out.println("Estoque indisponível");
        }else {
            this.estoque -= qtd;
            System.out.println("Quantidade alterada com sucesso!");
            System.out.println("Quantidade atual: " + this.estoque);
        }
    }
}