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
        System.out.println(cpf+ ";"+ nome+ ";"+ idade+ ";"+ rg);
    }

}
