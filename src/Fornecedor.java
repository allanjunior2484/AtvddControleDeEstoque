import java.util.Objects;

public class Fornecedor {
    private String nomeFornecedor;
    private int idFornecedor;
    private static int contadorId = 1;


    //construtor para não haver nomes faltantes
    public Fornecedor(String nomeFornecedor){
        this.nomeFornecedor = Objects.requireNonNull(nomeFornecedor,"o nome não pode ser null");
        this.idFornecedor = contadorId++;
    }

    //construtor para atribuir um nome para os null
    public Fornecedor(){
        this("Sem Nome");
    }

    //construção do getters

    public String getNomeFornecedor(){
        return nomeFornecedor;
    }
    public int getIdFornecedor(){
        return idFornecedor;
    }

    //construção do set do nome do Fornecedor já que o id é unico e não vamo muda-lo

    public void setNomeFornecedor(String nomeFornecedor){
        this.nomeFornecedor = Objects.requireNonNull(nomeFornecedor,"o nome não pode ser null");
    }


}

