import java.util.ArrayList;
import java.util.Date;

public class aerolinea {
    
    protected ArrayList<vuelo> vuelos;
    protected String nombre;

    public aerolinea(String nombre) {
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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