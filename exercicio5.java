// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 5
// Vitoria Mendes Rodrigues
// ==============================================
// Avaliação de notas dos alunos
// Esse programa cria uma lista de notas de alunos
// e encontra a maior nota da turma.

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("=== Avaliação de Notas dos Alunos ===");

        // Array com as notas dos alunos
        double[] notas = {8.5, 7.0, 9.3, 6.8, 10.0, 8.0};

        double maiorNota = notas[0]; // Inicializa com a primeira nota

        // Percorre o array para encontrar a maior nota
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("A maior nota da turma é: " + maiorNota);
    }
}
