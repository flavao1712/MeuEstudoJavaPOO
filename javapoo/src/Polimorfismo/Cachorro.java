package Polimorfismo;

public class Cachorro  extends Animal{

    public Cachorro(String nome){
        super(nome);
    }
@Override
    public void fazerSom(){
    System.out.println(this.getNome() + " Late: Au Au!");
}

}

