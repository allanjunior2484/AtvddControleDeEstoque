import java.time.LocalDate;
// classe produto está herdando a classe fornecedor
public class Produto extends Fornecedor {
   private int codigoProduto;
   private String descricaoProduto;
   private LocalDate dataChegada;
   private Double quantidade;
   private String categoria;
   private Double precoCusto;
   private Double precoVenda;
   private LocalDate validade;

   //construtor
    public Produto(String nomeFornecedor, int codigoProduto, String descricaoProduto,
                   LocalDate dataChegada, Double quantidade, String categoria, Double precoCusto,
                   Double precoVenda, LocalDate validade){
        super(nomeFornecedor);
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.dataChegada = dataChegada;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.validade = validade;

    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
}
