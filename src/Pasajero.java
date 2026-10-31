import java.util.ArrayList;
import java.util.Date;

public class Pasajero extends Usuario {
    protected ArrayList<Reserva> reservas;
    protected ArrayList<Reserva> reservasConfirmadas;

    public Pasajero(String nombre, String correo, String id) {
        super(nombre, correo, id);
        this.reservas = new ArrayList<>();
        this.reservasConfirmadas = new ArrayList<>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Reserva> getReservasConfirmadas() {
        return reservasConfirmadas;
    }

    public void reservarVuelo(Vuelo vuelo){
        Reserva reserva = new Reserva(vuelo);
        reservas.add(reserva);
    }

    public void reservarVehiculo(Reserva reserva, Vehiculo vehiculo){
        for(Reserva r : reservas){
            if(r.equals(reserva)){
                r.setVehiculo(vehiculo);
                break;
            }
        }
    }

    public void confirmarCancelarReserva(Reserva reserva){
        for(Reserva r : reservas){
            if(r.equals(reserva)){
                r.setEstado(true);
                reservasConfirmadas.add(r);
                reservas.remove(r);
                break;
            }
        }
    }

    public Incidente reportarIncidente(String titulo, String descripcion){
        
        Incidente incidente = new Incidente(titulo, descripcion);

        return incidente;
    }
}