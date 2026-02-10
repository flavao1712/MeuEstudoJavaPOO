package Polimorfismo;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void fazerSom(){
        System.out.println(this.nome + " faz um som genérico.");
    }
}
