import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
    @Override
    public String getCpf(){
        return this.cpf;
    }
    @Override
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public int getIdade(){
        return this.idade;
    }
    @Override
    public void setIdade(int idade){
        this.idade = idade;
    }

    
    public Boolean inserir(){
        
        try{
            FileWriter fw = new FileWriter("texts/funcionario.txt", true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(super.cpf+ ";"+super.nome + ";"+super.idade + ";"+funcao);
            bw.newLine();
            bw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public ArrayList<Funcionario> listar(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try{
            FileReader fr = new FileReader("texts/funcionario.txt");
            
            BufferedReader br = new BufferedReader(fr);
            String linha;
            String[] dados;
            while((linha = br.readLine()) != null){
                dados = linha.split(";");
                Funcionario f = new Funcionario(dados[3], dados[0], dados[1], Integer.parseInt(dados[2]));
                funcionarios.add(f);
                
            }
            br.close();
           
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return funcionarios;
    }
    public Funcionario consultar(String id){
        Funcionario retorno = null;
        try{
            for(Funcionario f: listar()){
                if(f.cpf.equals(id)){
                    retorno = f;
                    break;
                }
            }
                return retorno;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return retorno;
            }
            
    }
    @Override    
    public void mostrar(){
        System.out.println(toString());

    }
    @Override
    public String toString() {
        return super.toString() + "; " + funcao;
    }

}
