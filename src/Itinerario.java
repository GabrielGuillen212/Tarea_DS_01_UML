import java.util.ArrayList;
import java.util.Date;

public class Itinerario {

    public static  ArrayList<vuelo> vuelos = new ArrayList<>();

    public static void cambiarHorario(vuelo vuelo, Date fecha) {
        for (vuelo v : vuelos) {
            if (v.equals(vuelo)) {
                v.setHorario(fecha);
                break;
            }
        }
    }

    public static void agregarVuelo(vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public static void eliminarVuelo(vuelo vuelo) {
        vuelos.remove(vuelo);
    }

    public static void limpiarItinerario() {
        vuelos.clear();
    }

    public static ArrayList<vuelo> getVuelos() {
        return vuelos;
    }
}
