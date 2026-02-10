package Heranca;

import CONSTRUTOR.NovoPoder;

public class Mago  extends NovoPoder {

    private int mana;

    public Mago(String nome, String classe, int nivel, int mana){
        super(nome,classe,nivel);
        this.mana = mana;
    }

public void lancarMagia(){
    System.out.println("O " + getNome() + " Lançou uma magia poderosa");
}

public int getMana(){
    return this.mana;
    }

public void setMana(int mana){
        this.mana = mana;
}


}
