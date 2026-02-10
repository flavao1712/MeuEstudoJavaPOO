package SistemadeArena;

public class Personagem {

    private String nome;
    private int nivel;

      public Personagem(String nome, int nivel){
          this.nome = nome;
          this.nivel = nivel;
      }

      public void setNivel(int novoNivel){
          if(novoNivel < 1){
              this.nivel = 1;
          } else if (novoNivel > 100) {
              this.nivel = 100;
          }else{
              this.nivel = novoNivel;
          }
      }

      public int getNivel(){
          return this.nivel;
      }

      public String getNome(){
          return this.nome;
      }

      public void atacar(Personagem alvo){
          System.out.println(this.nome + " deu um golpe em " + alvo.getNome());
          alvo.setNivel(alvo.getNivel()- 20 );
      }


}
