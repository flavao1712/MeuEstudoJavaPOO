package DesafiodaCorrida;

public class GrandePremio {

    public static void main(String[] args) {


        Veiculo popular = new Veiculo("corsa", 0);
        CarroEsportivo maquina = new CarroEsportivo("Ferrari");

        System.out.println("---LARGADA!---");

        while (popular.getVelocidade() < 200 && maquina.getVelocidade() < 200) {
            popular.acelerar();
            maquina.usarNitro();
            System.out.println("=======================");
        }

        if (maquina.getVelocidade() >= 200) {
            System.out.println("A " + maquina.getNome() + " Venceu!");
        } else {
            System.out.println("O " + popular.getNome() + " Venceu ! ");
        }

    }
}

