// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 1
// Autora: Vitoria Mendes Rodrigues
// ==============================================
// Sistema de reservas de hotel
// Esse programa cria variáveis para armazenar informações de um hóspede
// e exibe essas informações na tela, simulando um sistema de reservas.

public class Exercicio1 {
    public static void main(String[] args) {
        // Variáveis para armazenar informações do hóspede
        int numeroQuarto = 101;          // Número do quarto
        double valorDiaria = 250.75;     // Valor da diária em reais
        String nomeHospede = "Maria Silva"; // Nome do hóspede

        // Exibindo as informações do hóspede
        System.out.println("=== Sistema de Reservas do Hotel ===");
        System.out.println("Número do quarto: " + numeroQuarto);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Hóspede: " + nomeHospede);
    }
}
