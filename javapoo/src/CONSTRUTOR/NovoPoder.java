package CONSTRUTOR;


public class NovoPoder {

   public String nome;
    public String classe;
    private int nivel;

    public void subirNivel(){
        setNivel(this.nivel + 1);
    }


    public NovoPoder(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        setNivel(nivel);
    }

    public void setNivel(int novoNivel) {
        if (novoNivel >= 1 && novoNivel <= 100) {
            this.nivel = novoNivel;
            System.out.println("Valor de " + nivel + " foi altualizado ");

            if (novoNivel >= 50) {
                System.out.println(this.nome + " E veterano");
            }
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void poder() {
        System.out.println(" o " + nome + " é um " + classe + " de nível " + nivel);
    }

    public void atacar(NovoPoder alvo){
        System.out.println((this.nome + " Atacou " + alvo.nome + " ! "));

        int nivelDoAlvo = alvo.getNivel();
        alvo.setNivel(nivelDoAlvo - 1);
    }

    public String getNome() {
        return this.nome;
    }


    public int getNivel(){
        return this.nivel;
    }

}



