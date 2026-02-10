package Encapsulamento;



public class PoderPoo {

    public static void main(String[] args) {

        PoderClass graa = new PoderClass();
        PoderClass lora = new PoderClass();

        graa.nome = "Graa";
        lora.nome = "Lora";


        graa.classe = "Guerreiro";
        lora.classe = "Mago";

        graa.setNivel(2);
        lora.setNivel(78);

         graa.poder();
         lora.poder();


    }



}











