import java.util.ArrayList;
import java.util.Scanner;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade;
    }
}

public class GerenciamentoEstoque {
    private static ArrayList<ItemEstoque> estoque = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar Item ao Estoque");
            System.out.println("2. Remover Item do Estoque");
            System.out.println("3. Listar Itens no Estoque");
            System.out.println("4. Atualizar Quantidade do Item");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarItem(scanner);
                    break;
                case 2:
                    removerItem(scanner);
                    break;
                case 3:
                    listarItens();
                    break;
                case 4:
                    atualizarQuantidade(scanner);
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarItem(Scanner scanner) {
        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        ItemEstoque novoItem = new ItemEstoque(nome, quantidade);
        estoque.add(novoItem);
        System.out.println("Item adicionado ao estoque.");
    }

    private static void removerItem(Scanner scanner) {
        System.out.print("Digite o nome do item a ser removido: ");
        String nome = scanner.nextLine();

        for (ItemEstoque item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(item);
                System.out.println("Item removido do estoque.");
                return;
            }
        }

        System.out.println("Item não encontrado no estoque.");
    }

    private static void listarItens() {
        System.out.println("\nItens no Estoque:");
        for (ItemEstoque item : estoque) {
            System.out.println(item);
        }
    }

    private static void atualizarQuantidade(Scanner scanner) {
        System.out.print("Digite o nome do item para atualizar a quantidade: ");
        String nome = scanner.nextLine();

        for (ItemEstoque item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite a nova quantidade: ");
                int novaQuantidade = scanner.nextInt();
                item.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada com sucesso.");
                return;
            }
        }

        System.out.println("Item não encontrado no estoque.");
    }
}


