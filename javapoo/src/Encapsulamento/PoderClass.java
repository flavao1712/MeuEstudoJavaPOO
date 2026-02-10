package Encapsulamento;

public class PoderClass {

    String nome;
    String classe;
    private int nivel;


    void poder() {
        System.out.println(" o " + nome + " é um " + classe + " de nível " + nivel);
    }

    public void setNivel(int novoNivel) {
        if (novoNivel >= 1 && novoNivel <= 100){
            this.nivel = novoNivel;
            System.out.println("Valor de " + nivel + " foi altualizado ");

        if (novoNivel >= 50) {
            System.out.println(this.nome + " E veterano");
        }
        } else {
            System.out.println("Valor invalido");
        }


    }

}