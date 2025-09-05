// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 3
// Vitoria Mendes Rodrigues
// ==============================================
// Contagem de clientes em um estabelecimento
// Esse programa simula a entrada de 10 clientes na loja,
// imprimindo o número de cada cliente à medida que entram.

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("=== Contagem de clientes na loja ===");

        // Loop que vai de 1 a 10, simulando os clientes entrando
        for (int cliente = 1; cliente <= 10; cliente++) {
            System.out.println("Cliente número " + cliente + " entrou na loja.");
        }
    }
}
