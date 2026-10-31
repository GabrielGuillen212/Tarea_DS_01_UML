import java.util.ArrayList;
import java.util.Date;

public class aerolinea {
    
    public ArrayList<vuelo> vuelos;

    public aerolinea() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelos(vuelo vuelo) {
        if (vuelo != null) {
            this.vuelos.add(vuelo);
        }
    }

    public void eliminarVuelos(vuelo vuelo) {
        if (vuelo != null) {
            this.vuelos.remove(vuelo);
        }
    }

    public void reprogramarVuelo(vuelo vuelo, Date fecha) {
        if (vuelo != null && this.vuelos.contains(vuelo)) {
            vuelo.setHorario(fecha);
        }
    }
}