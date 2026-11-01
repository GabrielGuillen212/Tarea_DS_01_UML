import java.util.ArrayList;
import java.util.Date;

public class Itinerario {

    public static  ArrayList<Vuelo> vuelos = new ArrayList<>();

    public static void cambiarHorario(Vuelo vuelo, Date fecha) {
        for (Vuelo v : vuelos) {
            if (v.equals(vuelo)) {
                v.setHorario(fecha);
                break;
            }
        }
    }

    public static void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public static void eliminarVuelo(Vuelo vuelo) {
        vuelos.remove(vuelo);
    }

    public static void limpiarItinerario() {
        vuelos.clear();
    }

    public static ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }
}
