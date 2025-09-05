// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 7
// Vitoria Mendes Rodrigues
// ==============================================
// Jogo da Velha Interativo
// Esse programa cria um tabuleiro para dois jogadores jogarem alternadamente
// e verifica se há vencedor após cada jogada.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        System.out.println("=== Jogo da Velha ===");

        while (jogoAtivo) {
            // Mostra o tabuleiro
            mostrarTabuleiro(tabuleiro);

            // Solicita posição ao jogador
            System.out.println("Jogador " + jogadorAtual + ", escolha linha (0-2) e coluna (0-2):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            // Verifica se a posição está vazia
            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;

                // Verifica se há vencedor
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                    break;
                }

                // Alterna jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Posição já ocupada, tente novamente.");
            }
        }

        scanner.close();
    }

    // Função para mostrar o tabuleiro
    public static void mostrarTabuleiro(char[][] tabuleiro) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
        System.out.println();
    }

    // Função para verificar vencedor
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) || // Linhas
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) { // Colunas
                return true;
            }
        }
        // Diagonais
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }
}
