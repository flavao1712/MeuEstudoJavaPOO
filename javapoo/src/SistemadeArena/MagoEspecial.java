package SistemadeArena;


public class MagoEspecial extends Personagem{
    private int mana;

public MagoEspecial(String nome, int nivel, int mana){
    super(nome, nivel);
    this.mana = mana;
}

public void lancarMagia(Personagem alvo){
    System.out.println(getNome() + "usou uma explosão arcana em " + alvo.getNome() + "!");
    alvo.setNivel(alvo.getNivel()-15);
    this.mana-= 10;
}

}



