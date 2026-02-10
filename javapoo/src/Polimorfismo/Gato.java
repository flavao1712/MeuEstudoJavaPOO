package Polimorfismo;

public class Gato  extends  Animal{


    public Gato(String nome){
        super(nome);
    }
    @Override
    public void fazerSom(){
        System.out.println(this.getNome() + " Mia: Miau!");
    }

}




