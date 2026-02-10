package Polimorfismo;

public class TesteAnimais {

    public static void main(String[] args) {

        Animal meuAnimalGenerico = new Animal("Bicho");
        Cachorro meuCachorro = new Cachorro("Rex");
        Gato meuGato = new Gato("Frajola");

        System.out.println("=== Teste Individual ===");
        meuAnimalGenerico.fazerSom();
        meuCachorro.fazerSom();
        meuGato.fazerSom();

        System.out.println("\n--- Teste com Polimorfismo (Lista de Animais) ---");

        Animal[] fazenda = new Animal[3];
        fazenda[0] = meuAnimalGenerico;
        fazenda[1] = meuCachorro;
        fazenda[2] = meuGato;

        for(Animal animalNaFazenda : fazenda){
            animalNaFazenda.fazerSom();
        }

    }
}
