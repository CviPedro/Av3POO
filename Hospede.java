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
}
