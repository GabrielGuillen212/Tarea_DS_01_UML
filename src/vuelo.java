import java.util.ArrayList;
import java.util.Date;

public class vuelo {
    
    protected Date horario;
    protected ArrayList<asiento> asientos;
    protected String destino;
    protected ArrayList<Pasajero> pasajeros;
    protected aerolinea aerolinea;

    public vuelo(Date horario, String destino, aerolinea aerolinea) {
        this.horario = horario;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.asientos = new ArrayList<>();
        this.pasajeros = new ArrayList<>(); 
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
}