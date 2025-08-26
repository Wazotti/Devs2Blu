public class Animal {
    public String nome;
    public int idade;
    public String especie;
    public String raca;
    public String cor;
    public String porte;
    public double peso;

    public Animal(){
        this.especie = "cachorro";
        this.raca = "vira-lata";
    }
    public void mostrarAnimal(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Porte: " + this.porte);
        System.out.println("Peso: " + this.peso);
    }
}
