public class Produto {
    private String descProduto;
    private int idProduto;
    private Double valor;

    public Produto(String descProduto, int idProduto, Double valor){
        this.descProduto = descProduto;
        this.idProduto = idProduto;
        this.valor = valor;
    }

    public String getDescProduto(){
        return this.descProduto;
    }
    public void setDescProduto(String descProduto){
        this.descProduto = descProduto;
    }

    public int getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

    public Double getValor(){
        return this.valor;
    }
    public void setIdProduto(Double valor){
        this.valor = valor;
    }
}
