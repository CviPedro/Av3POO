import java.util.ArrayList;

public abstract class Pessoa{
    protected String cpf;
    protected String nome;
    protected int idade;

    public Pessoa(String cpf, String nome, int idade){
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
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

    public abstract Boolean inserir();
    public abstract Boolean editar();
    public abstract ArrayList<Pessoa> listar();
    public abstract int consultar(int id);

}
