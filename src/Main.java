import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos jogos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Jogo[] jogos = new Jogo[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\n--- Jogo " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Gênero: ");
            String genero = scanner.nextLine();

            System.out.print("Ano de lançamento: ");
            int ano = scanner.nextInt();

            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            jogos[i] = new Jogo(nome, genero, ano, nota);
        }

        System.out.println("\n===== JOGOS CADASTRADOS =====");

        for (Jogo jogo : jogos) {
            jogo.exibir();
        }

        scanner.close();


        System.out.println("\n===== JOGOS ORDENADOS =====");

        Merge.mergeSort(jogos, 0, jogos.length - 1);

        for (Jogo jogo : jogos) {
            jogo.exibir();
        }
    }
}
