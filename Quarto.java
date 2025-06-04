import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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

    public Boolean inserir(){
        
        try{
            FileWriter fw = new FileWriter("Quarto.txt", true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(descQuarto+ ";"+idQuarto );
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

    public ArrayList<Quarto> listar(){
        ArrayList<Quarto> quartos = new ArrayList<>();
        try{
            FileReader fr = new FileReader("Quarto.txt");
            
            BufferedReader br = new BufferedReader(fr);
            String linha;
            String[] dados;
            while((linha = br.readLine()) != null){
                dados = linha.split(";");
            Quarto q = new Quarto(dados[0], Integer.parseInt(dados[1]));
               quartos.add(q);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return quartos;
    }

    public Quarto consultar(int id){
        Quarto retorno = null;
        try{
            for(Quarto q: listar()){
                if(q.idQuartao == (id)){
                    retorno = q;
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
       System.out.println(descQuarto + ";"+ idQuarto);
    }

}
