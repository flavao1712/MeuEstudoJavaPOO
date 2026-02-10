package Polimorfismo;

public class TesteAnimais {

    public static void main(String[] args) {


        Cachorro meuCachorro = new Cachorro("Rex");
        Gato meuGato = new Gato("Frajola");

        System.out.println("=== Teste Individual ===");

        meuCachorro.fazerSom();
        meuGato.fazerSom();

        System.out.println("\n--- Teste com Polimorfismo (Lista de Animais) ---");

        Animal[] fazenda = new Animal[3];
        fazenda[0] = meuCachorro;
        fazenda[1] = meuGato;

        for(Animal animalNaFazenda : fazenda){
            if(animalNaFazenda != null) {
                animalNaFazenda.fazerSom();
            }
        }

    }
}
