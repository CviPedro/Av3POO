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
        return this.idReserva;
    }
    public void setIdReserva(int idReserva){
        this.idReserva = idReserva;
    }

    public Double getValor(){
        return this.valor;
    }
    public void getValor(Double valor){
        this.valor = valor;
    }

    public String getDataEntrada(){
        return this.dataEntrada;
    }
    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida(){
        return this.dataSaida;
    }
    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }

    public Boolean getCheckin(){
        return this.checkin;
    }
    public void setCheckin(Boolean checkin){
        this
    }


    
}
