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
}
