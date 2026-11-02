import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    
    protected String id;
    protected Date horario;
    protected ArrayList<Asiento> asientos;
    protected String destino;
    protected ArrayList<Pasajero> pasajeros;
    protected Aerolinea aerolinea;

    public Vuelo(String id, Date horario, String destino, Aerolinea aerolinea) {
        this.id = id;
        this.horario = horario;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.asientos = new ArrayList<>();
        this.pasajeros = new ArrayList<>(); 
    }

    public String getId() {
        return id;
    }

    public Date getHorario() {
        return horario;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public String getDestino() {
        return destino;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
}