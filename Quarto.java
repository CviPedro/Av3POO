import java.io.IOException;
import java.util.ArrayList;

public class Quarto {
    private String descQuarto;
    private int idQuarto;

    public Quarto(String descQuarto, int idQuarto){
        this.descQuarto = descQuarto;
        this.idQuarto = idQuarto;
    }

    public String getDescQuarto(){
        return this.descQuarto;
    }
    public void setDescQuarto(String descQuarto){
        this.descQuarto = descQuarto;
    }

    public int getIdQuarto(){
        return this.idQuarto;
    }
    public void setIdQuarto(int idQuarto){
        this.idQuarto = idQuarto;
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
       System.out.println(descQuarto + ";"+ idQuarto);
    }

}
