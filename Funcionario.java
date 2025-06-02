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
}
