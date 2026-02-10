package DesafiodaCorrida;

public class Veiculo {


    private String nome;
    protected int velocidade;

    public Veiculo(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
        System.out.println(this.nome + " acelerou! Velocidade atual: " + this.velocidade);
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public String getNome() {
        return this.nome;
    }


}


