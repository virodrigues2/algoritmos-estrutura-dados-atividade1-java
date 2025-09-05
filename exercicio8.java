// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 8
// Vitoria Mendes Rodrigues
// ==============================================
// Análise de frequência de pedidos no delivery
// Esse programa solicita uma lista de códigos de pedidos de um cliente
// e exibe o item que mais se repete.

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> frequencia = new HashMap<>(); // Armazena contagem de cada pedido

        System.out.println("=== Análise de Frequência de Pedidos ===");
        System.out.println("Digite os códigos dos pedidos (digite -1 para finalizar):");

        while (true) {
            int codigo = scanner.nextInt();
            if (codigo == -1) break;

            // Incrementa a contagem do pedido
            frequencia.put(codigo, frequencia.getOrDefault(codigo, 0) + 1);
        }

        // Encontrar o item mais pedido
        int maisPedido = -1;
        int maxFrequencia = 0;
        for (int codigo : frequencia.keySet()) {
            if (frequencia.get(codigo) > maxFrequencia) {
                maxFrequencia = frequencia.get(codigo);
                maisPedido = codigo;
            }
        }

        if (maisPedido != -1) {
            System.out.println("O item mais pedido é o código: " + maisPedido + " (pedido " + maxFrequencia + " vezes)");
        } else {
            System.out.println("Nenhum pedido foi registrado.");
        }

        scanner.close();
    }
}
