public class MainAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.nome = "Dory";
        animal1.idade = 10;
        animal1.peso = 7;
        animal1.porte = "Pequeno";
        animal1.cor = "Preto";
        animal1.raca = "Não Identificado";
        animal1.especie = "Peixe";
        animal1.mostrarAnimal();

        System.out.println("----------------------");

        Animal animal2 =  new Animal();
        animal2.nome = "Sucuri";
        animal2.idade = 14;
        animal2.cor = "Verde";
        animal2.peso = 10;
        animal2.porte = "Pequeno";
        animal2.raca = "Poodle";
        animal2.especie = "Cachorro";
        animal2.mostrarAnimal();

    }
}
