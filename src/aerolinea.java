import java.util.ArrayList;
import java.util.Date;

public class Aerolinea {
    
    protected ArrayList<Vuelo> vuelos;
    protected String nombre;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarVuelos(Vuelo vuelo) {
        if (vuelo != null) {
            this.vuelos.add(vuelo);
        }
    }

    public void eliminarVuelos(Vuelo vuelo) {
        if (vuelo != null) {
            this.vuelos.remove(vuelo);
        }
    }

    public void reprogramarVuelo(Vuelo vuelo, Date fecha) {
        if (vuelo != null && this.vuelos.contains(vuelo)) {
            vuelo.setHorario(fecha);
        }
    }
}