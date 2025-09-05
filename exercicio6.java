// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 6
// Vitoria Mendes Rodrigues
// ==============================================
// Seleção de números primos para criptografia
// Esse programa encontra e exibe todos os números primos entre 1 e 100,
// ajudando na seleção de números para sistemas de segurança.

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("=== Números Primos de 1 a 100 ===");

        // Loop para verificar todos os números de 2 a 100
        for (int numero = 2; numero <= 100; numero++) {
            boolean primo = true; // Assume que o número é primo

            // Verifica se o número tem algum divisor além de 1 e ele mesmo
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    primo = false; // Não é primo
                    break;
                }
            }

            if (primo) {
                System.out.print(numero + " "); // Imprime o número primo
            }
        }

        System.out.println("\nFim da lista de números primos.");
    }
}
