// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 2
// Vitoria Mendes Rodrigues
// ==============================================
// Verificador de códigos de produtos
// Esse programa lê o código de um produto e verifica se ele é par ou ímpar,
// ajudando o setor de inventário a identificar características básicas do produto.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando que o usuário digite o código do produto
        System.out.print("Digite o código do produto: ");
        int codigoProduto = scanner.nextInt();

        // Verificando se o código é par ou ímpar
        if (codigoProduto % 2 == 0) {
            System.out.println("O código " + codigoProduto + " é PAR.");
        } else {
            System.out.println("O código " + codigoProduto + " é ÍMPAR.");
        }

        // Mensagem final explicando a utilidade da informação
        System.out.println("Essa informação ajuda a classificar características básicas do produto.");
        
        scanner.close();
    }
}
