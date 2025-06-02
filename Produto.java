import java.io.IOException;
import java.util.ArrayList;

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

    @Override
    public Boolean inserir(){
        try {

        } catch(IOException e) {
            System.out.println("Falha ao encontrar arquivo "+ e.getMessage());
            return false;
        }
        return true;
    }
    public Boolean editar(){
        try {
            
        } catch (IOException e) {
            System.out.println("Falha ao encontrar arquivo "+ e.getMessage());
            return false;
        }
        return true;
    }
    public ArrayList<Pessoa> listar(){
        try {
            
        } catch (IOException e) {
            System.out.println("Falha ao encontrar arquivo "+ e.getMessage());

        }
    }
    public int consultar(int id){
        try {
            
        } catch (IOException e) {
            System.out.println("Falha ao encontrar arquivo "+ e.getMessage());
        }
    }
    public void mostrar(){
       System.out.println(descProduto+ ";"+ idProduto+ ";"+ valor);
    }

}
