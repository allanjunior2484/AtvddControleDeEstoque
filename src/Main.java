import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioProduto repositorioProduto = new RepositorioProduto();
        RepositorioFornecedor repositorioFornecedor = new RepositorioFornecedor();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Fornecedor");
            System.out.println("2. Adicionar Produto");
            System.out.println("3. Gerar Relatório de Produtos");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do fornecedor:");
                    String nomeFornecedor = scanner.nextLine();
                    Fornecedor fornecedor = new Fornecedor(nomeFornecedor);
                    repositorioFornecedor.adicionarFornecedor(fornecedor);
                    System.out.println("Fornecedor adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do fornecedor do produto:");
                    nomeFornecedor = scanner.nextLine();
                    fornecedor = new Fornecedor(nomeFornecedor);

                    System.out.println("Digite o código do produto:");
                    int codigoProduto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    System.out.println("Digite a descrição do produto:");
                    String descricaoProduto = scanner.nextLine();

                    System.out.println("Digite a data de chegada (AAAA-MM-DD):");
                    LocalDate dataChegada = null;
                    try {
                        dataChegada = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (DateTimeParseException e) {
                        System.err.println("Formato de data inválido. Use o formato AAAA-MM-DD.");
                        break;
                    }

                    System.out.println("Digite a quantidade:");
                    double quantidade = scanner.nextDouble();

                    System.out.println("Digite a categoria:");
                    scanner.nextLine(); // Consumir a nova linha
                    String categoria = scanner.nextLine();

                    System.out.println("Digite o preço de custo:");
                    double precoCusto = scanner.nextDouble();

                    System.out.println("Digite o preço de venda:");
                    double precoVenda = scanner.nextDouble();

                    System.out.println("Digite a data de validade (AAAA-MM-DD):");
                    scanner.nextLine(); // Consumir a nova linha
                    LocalDate validade = null;
                    try {
                        validade = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (DateTimeParseException e) {
                        System.err.println("Formato de data inválido. Use o formato AAAA-MM-DD.");
                        break;
                    }

                    Produto produto = new Produto(nomeFornecedor, codigoProduto, descricaoProduto, dataChegada, quantidade, categoria, precoCusto, precoVenda, validade);
                    repositorioProduto.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 3:
                    ServicoRelatorio servicoRelatorio = new ServicoRelatorio(repositorioProduto);
                    servicoRelatorio.gerarRelatorio();
                    break;

                case 4:
                    servicoRelatorio = new ServicoRelatorio(repositorioProduto);
                    servicoRelatorio.gerarRelatorioEstoque();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
