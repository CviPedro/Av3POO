import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hospede extends Pessoa {
    protected String rg;
    

    public Hospede(String rg, String cpf, String nome, int idade){
        super(cpf, nome, idade);
        this.rg = rg;
    }

    public String getRg(){
        return this.rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


    public Boolean inserir(){
        
        try{
            FileWriter fw = new FileWriter("Hospede.txt", true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(super.cpf+ ";"+nome + ";"+idade + ";"+rg);
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

    public ArrayList<Hospede> listar(){
        ArrayList<Hospede> hospedes = new ArrayList<>();
        try{
            FileReader fr = new FileReader("Hospede.txt");
            
            BufferedReader br = new BufferedReader(fr);
            String linha;
            String[] dados;
            while((linha = br.readLine()) != null){
                dados = linha.split(";");
                Hospede h = new Hospede(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]));
                hospedes.add(h);
                //System.out.println(linha);
            }
            br.close();
           
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return hospedes;
    }

    public Hospede consultar(String id){
         Hospede retorno = null;
       try{
           
            for(Hospede h: listar()){
                if(h.cpf.equals(id)){
                    retorno = h;
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
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return super.toString() + ";" + rg;
    }

}
