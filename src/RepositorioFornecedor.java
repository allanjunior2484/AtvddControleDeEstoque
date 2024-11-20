import java.util.ArrayList;
import java.util.List;

public class RepositorioFornecedor {
    private List<Fornecedor> fornecedores;


    // construtor para iniciar a lista
    public RepositorioFornecedor(){
        this.fornecedores = new ArrayList<>();
    }

    // adicionar fornecedor
    public void adicionarFornecedor(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
    }
    // remover fornecedor
    public void removerFornecedor(Fornecedor fornecedor){
        fornecedores.remove(fornecedor);
    }
    public List<Fornecedor> get(){
    return fornecedores;
    }


}
