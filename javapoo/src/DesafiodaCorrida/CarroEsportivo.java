package DesafiodaCorrida;

public class CarroEsportivo extends Veiculo {

    public CarroEsportivo(String nome) {
        super(nome, 0);
    }

    public void usarNitro() {
        this.velocidade += 50;
        System.out.println(this.getNome() + "Usou o nitro! velocidade: " + this.velocidade);
    }
}