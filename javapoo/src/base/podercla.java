package base;

public class podercla {

    public static void main(String[] args) {

       Personagem graa = new Personagem();
       Personagem lora = new Personagem();

       graa.nome = "Graa";
       lora.nome = "Lora";


        graa.classe = "Guerreiro";
        lora.classe = "Mago";

        graa.nivel = 50;
        lora.nivel = 78;


        graa.mostrarPoder();
        lora.mostrarPoder();




    }



}