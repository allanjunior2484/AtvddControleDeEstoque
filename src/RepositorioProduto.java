import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto{
    private List<Produto> produtos;

    // Construtor para inicializar a lista de produtos
    public RepositorioProduto(){
        this.produtos = new ArrayList<>();
    }


    // Adicionar um produto ao repositório
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    // remover um produto do repositório
    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }


    // Retornar a lista de produtos armazenados
    public List<Produto> getProdutos(){
        return produtos;
    }




}
