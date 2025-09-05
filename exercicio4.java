// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 4
// Vitoria Mendes Rodrigues
// ==============================================
// Lista de espera dinâmica em um restaurante
// Esse programa permite adicionar e remover clientes de uma lista de espera
// e exibe a lista atualizada a cada alteração.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaEspera = new ArrayList<>(); // Lista dinâmica de clientes

        boolean continuar = true;

        System.out.println("=== Lista de Espera do Restaurante ===");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Remover cliente");
            System.out.println("3 - Mostrar lista");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente para adicionar: ");
                    String adicionar = scanner.nextLine();
                    listaEspera.add(adicionar);
                    System.out.println(adicionar + " foi adicionado(a) à lista.");
                    break;
                case 2:
                    System.out.print("Digite o nome do cliente para remover: ");
                    String remover = scanner.nextLine();
                    if (listaEspera.remove(remover)) {
                        System.out.println(remover + " foi removido(a) da lista.");
                    } else {
                        System.out.println(remover + " não está na lista.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de espera atual: " + listaEspera);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}
