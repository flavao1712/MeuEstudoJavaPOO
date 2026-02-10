package CONSTRUTOR;

public class PoderConstrutor {



    public static void main(String[] args) {

        NovoPoder graa = new NovoPoder("Graa", "Guerreiro", 49);
        NovoPoder lora = new NovoPoder("Lora" , "Mago", 78);


        System.out.println("----UPGRADE!------");
        graa.subirNivel();




        graa.poder();
        lora.poder();


        System.out.println(("Nivel atual do Graa: " + graa.getNivel()));

    }



}





