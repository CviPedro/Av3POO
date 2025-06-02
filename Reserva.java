import java.io.IOException;
import java.util.ArrayList;

public class Reserva { 
    private int idReserva;
    private Double valor;
    private String dataEntrada;
    private String dataSaida;
    private Boolean checkin;
    private Boolean checkout;
    private Quarto quarto;
    private Hospede hospede;

    public Reserva(int idReserva, Double valor, String dataEntrada, String dataSaida,
     Boolean checkin, Boolean checkout, Quarto quarto, Hospede hospede) {
        this.idReserva = idReserva;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.checkin = checkin;
        this.checkout = checkout;
        this.quarto = quarto;
        this.hospede = hospede;
    }
    public int getIdReserva(){
        return idReserva;
    }
    public void setIdReserva(int idReserva){
        this.idReserva = idReserva;
    }

    public Double getValor(){
        return valor;
    }
    public void getValor(Double valor){
        this.valor = valor;
    }

    public String getDataEntrada(){
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida(){
        return dataSaida;
    }
    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }

    public Boolean getCheckin(){
        return checkin;
    }
    public void setCheckin(Boolean checkin){
        this.checkin = checkin;
    }

    public Boolean getCheckout(){
        return checkout;
    }
    public void setCheckout(Boolean checkout){
        this.checkout = checkout;
    }

    public Quarto getquarto(){
        return quarto;
    }
    public void setQuarto(Quarto quarto){
        this.quarto = quarto;
    }
    public Hospede getHospede(){
        return hospede;
    }
    public void setHospede(Hospede hospede){
        this.hospede = hospede;
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
        System.out.println(idReserva+ ";"+ valor+ ";"+ dataEntrada+ ";"+ dataSaida+ 
        ";"+checkin+ ";"+ checkout+ ";"+ quarto+ ";"+ hospede );
    }

    
}
