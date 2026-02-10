package Heranca;
import CONSTRUTOR.NovoPoder;

import java.util.ArrayList;


public class ArrayHeranca {

    public static void main(String[] args) {



                 ArrayList<NovoPoder> listaDeHerois = new ArrayList<>();

                   listaDeHerois.add(new NovoPoder("Pertan" , "Guerreiro" ,49));
                   listaDeHerois.add(new NovoPoder("Lacael" , "Mago" ,87));
                   listaDeHerois.add(new Mago("Gandalf" , "Mago Branco" ,80,100));

        System.out.println("======= EXIBINDO O EXÉRCITO ATUALIZADO========");

        for(NovoPoder h : listaDeHerois){
            h.poder();
            if(h instanceof Mago){
                ((Mago) h).lancarMagia();
            }
        }

        System.out.println("\n==== Teste de ataque com Heraça");
    listaDeHerois.get(2).atacar(listaDeHerois.get(0));
    listaDeHerois.get(0).poder();
    }
}
