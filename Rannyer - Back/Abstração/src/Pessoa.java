
public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public double peso;

    public Pessoa(){

    }
    public void mostrarPessoa(){
        System.out.println("O seu Nome: " + this.nome);
        System.out.println("A sua Idade: " + this.idade);
        System.out.println("A sua Altua: " + this.altura);
        System.out.println("O seu Peso: " + this.peso);
    }
}
