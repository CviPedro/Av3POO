import java.io.IOException;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
    protected String funcao;
    

    public Funcionario(String funcao, String cpf, String nome, int idade){
        super(cpf, nome, idade);
        this.funcao = funcao;
        
    }

    public String getFuncao(){
        return this.funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
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
            
        } catch (Exception e) {
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
        System.out.println(cpf+ ";"+ nome+ ";"+ idade+ ";"+ funcao);

    }

}
