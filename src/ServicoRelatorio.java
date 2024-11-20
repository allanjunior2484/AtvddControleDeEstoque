import java.util.List;

public class ServicoRelatorio {
    private RepositorioProduto repositorioProduto; // Referência ao repositório de produtos

    // Construtor que inicializa um repositório vazio
    public ServicoRelatorio() {
        this.repositorioProduto = new RepositorioProduto(); // Inicializa com um repositório vazio
    }

    // Construtor com repositório fornecido
    public ServicoRelatorio(RepositorioProduto repositorioProduto) {
        this.repositorioProduto = repositorioProduto; // Inicializa o repositório
    }

    // Metodo para gerar um relatório de produtos
    public void gerarRelatorio() {
        List<Produto> produtos = repositorioProduto.getProdutos(); // Obtém a lista de produtos

        if (produtos == null || produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
            return; // Retorna caso não haja produtos
        }

        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getDescricaoProduto());
            System.out.println("Preço de Custo: R$ " + String.format("%.2f", produto.getPrecoCusto()));
            System.out.println("Preço de Venda: R$ " + String.format("%.2f", produto.getPrecoVenda()));
            System.out.println("Código do Produto: " + produto.getCodigoProduto());
            System.out.println("Validade: " + produto.getValidade());
            System.out.println("Chegada: " + produto.getDataChegada());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("--------------------------------");
        }
    }

    // Metodo para gerar um relatório de estoque
    public void gerarRelatorioEstoque() {
        List<Produto> produtos = repositorioProduto.getProdutos();
        float totalEstoque = 0;

        System.out.println("Relatório de Estoque:");
        for (Produto produto : produtos) {
            totalEstoque += produto.getQuantidade();
            System.out.println("Produto: " + produto.getDescricaoProduto() + " - Quantidade: " + produto.getQuantidade());
        }

        System.out.println("Total do Estoque: " + totalEstoque);
        if (totalEstoque == 0) {
            System.out.println("Não há produtos em estoque.");
        }
    }
}
