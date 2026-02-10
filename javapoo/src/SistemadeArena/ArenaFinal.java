package SistemadeArena;

public class ArenaFinal {
    public static void main(String[] args) {
        // Criando nossos lutadores
        Personagem guerreiro = new Personagem("Pertan", 100);
        MagoEspecial mago = new MagoEspecial("Gandalf", 100, 50);

        System.out.println("--- INÍCIO DA LUTA ---");

        // O WHILE: "Enquanto os dois estiverem vivos (nivel > 1)..."
        while (guerreiro.getNivel() > 1 && mago.getNivel() > 1) {

            // Turno do Guerreiro
            guerreiro.atacar(mago);

            // Turno do Mago (Se ele ainda tiver nível para lutar)
            if (mago.getNivel() > 1) {
                mago.lancarMagia(guerreiro);
            }

            System.out.println("Status: " + guerreiro.getNome() + " (" + guerreiro.getNivel() + ") | "
                    + mago.getNome() + " (" + mago.getNivel() + ")");
            System.out.println("--------------------");
        }

        // Quem sobrou?
        if (guerreiro.getNivel() > 1) {
            System.out.println("🏆 VITORIA DO GUERREIRO " + guerreiro.getNome());
        } else {
            System.out.println("🏆 VITORIA DO MAGO " + mago.getNome());
        }
    }
}