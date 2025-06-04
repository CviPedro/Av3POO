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
            FileWriter fw = new FileWriter("Funcionario.txt", true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(super.cpf+ ";"+nome + ";"+idade + ";"+funcao);
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
    public ArrayList<Funcionario> listar(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try{
            FileReader fr = new FileReader("Funcionario.txt");
            
            BufferedReader br = new BufferedReader(fr);
            String linha;
            String[] dados;
            while((linha = br.readLine()) != null){
                dados = linha.split(";");
                Funcionario f = new Funcionario(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]));
                funcionarios.add(f);
                //System.out.println(linha);
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
    public void mostrar(){
        System.out.println(toString());

    }
    @Override
    public String toString() {
        return super.toString() + "; " + funcao;
    }

}
