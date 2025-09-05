// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 9
// Vitoria Mendes Rodrigues
// ==============================================
// Gerenciando um cadastro de clientes
// Esse programa cria uma classe Pessoa com atributos nome, idade e endereço
// e permite criar uma lista de clientes e exibir seus dados.

import java.util.ArrayList;
import java.util.Scanner;

// Classe Pessoa representando cada cliente
class Pessoa {
    String nome;
    int idade;
    String endereco;

    // Construtor da classe
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("------------------------");
    }
}

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaClientes = new ArrayList<>(); // Lista de clientes

        System.out.println("=== Cadastro de Clientes ===");

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Mostrar clientes");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Digite o endereço: ");
                    String endereco = scanner.nextLine();

                    Pessoa cliente = new Pessoa(nome, idade, endereco);
                    listaClientes.add(cliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n=== Lista de Clientes ===");
                    for (Pessoa p : listaClientes) {
                        p.exibirDados();
                    }
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Encerrando o cadastro.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
