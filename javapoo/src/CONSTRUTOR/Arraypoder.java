package CONSTRUTOR;

import java.util.ArrayList;

public class Arraypoder {

    public static void main(String[] args) {


        ArrayList<NovoPoder> listaDeHerois = new ArrayList<>();

        listaDeHerois.add(new NovoPoder("Pertan", "Gurreiro", 49));
        listaDeHerois.add(new NovoPoder("Lacael", "Mago", 78));
        listaDeHerois.add(new NovoPoder("Tataratin", "deus", 90));
        listaDeHerois.add(new NovoPoder("Hack", "Trapaceiro", 150));
        System.out.println("======EXIBINDO O EXERCITO");

        for (NovoPoder h : listaDeHerois) {
            h.poder();
        }

        listaDeHerois.get(0).atacar(listaDeHerois.get(1));
                   listaDeHerois.get(1).poder();
    }
}
