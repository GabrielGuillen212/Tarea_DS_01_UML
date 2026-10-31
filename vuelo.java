import java.util.Date;
import java.util.ArrayList;

public class vuelo {
    
    protected Date horario;
    protected ArrayList<asiento> asientos;
    protected String destino;
    /*protected ArrayList<pasajero> pasajeros;*/

    public vuelo(Date horario, String destino) {
        this.horario = horario;
        this.destino = destino;
        this.asientos = new ArrayList<>();
        /*this.pasajeros = new ArrayList<>();*/ 
    }

    
    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}