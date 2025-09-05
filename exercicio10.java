// ==============================================
// Disciplina: Algoritmos e Estrutura de Dados
// Atividade 1 - Exercício 10
// Vitoria Mendes Rodrigues
// ==============================================
// Sistema de Gerenciamento de Estoque para uma loja
// Esse programa permite adicionar, remover e atualizar produtos no estoque
// usando classes e listas, simulando um sistema completo de gerenciamento.

import java.util.ArrayList;
import java.util.Scanner;

// Classe Produto representando cada item no estoque
class Produto {
    String nome;
    int codigo;
    double preco;
    int quantidade;

    // Construtor da classe
    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir informações do produto
    public void exibirProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------");
    }
}

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>(); // Lista de produtos

        boolean continuar = true;

        System.out.println("=== Sistema de Gerenciamento de Estoque ===");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
                    estoque.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto para remover: ");
                    int codigoRemover = scanner.nextInt();
                    scanner.nextLine();
                    boolean removido = false;
                    for (int i = 0; i < estoque.size(); i++) {
                        if (estoque.get(i).codigo == codigoRemover) {
                            estoque.remove(i);
                            System.out.println("Produto removido com sucesso!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do produto para atualizar: ");
                    int codigoAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    boolean encontrado = false;
                    for (Produto p : estoque) {
                        if (p.codigo == codigoAtualizar) {
                            System.out.print("Digite o novo nome: ");
                            p.nome = scanner.nextLine();
                            System.out.print("Digite o novo preço: ");
                            p.preco = scanner.nextDouble();
                            System.out.print("Digite a nova quantidade: ");
                            p.quantidade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Produto atualizado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== Produtos no Estoque ===");
                    for (Produto p : estoque) {
                        p.exibirProduto();
                    }
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Encerrando o sistema de estoque.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
