import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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

    public Boolean inserir(){
        
        try{
            FileWriter fw = new FileWriter("Produto.txt", true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(descProduto+ ";"+idProduto + ";"+valor);
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
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

    public ArrayList<Produto> listar(){
        ArrayList<Produto> produtos = new ArrayList<>();
        try{
            FileReader fr = new FileReader("Produto.txt");
            
            BufferedReader br = new BufferedReader(fr);
            String linha;
            String[] dados;
            while((linha = br.readLine()) != null){
                dados = linha.split(";");
                Produto p = new Produto(dados[0], Integer.parseInt(dados[1]), Double.parseDouble(dados[2]));
                produtos.add(p);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return produtos;
    }

    public Produto consultar(int id){
        Produto retorno = null;
        try{
            for(Produto p: listar()){
                if(p.idProduto == (id)){
                    retorno = p;
                    break;
                }
            }
                return retorno;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return retorno;
            }
            
    }

    public void mostrar(){
       System.out.println(descProduto+ ";"+ idProduto+ ";"+ valor);
    }

}
