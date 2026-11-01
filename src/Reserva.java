import java.util.Date;

public class Reserva {
    protected Vuelo vuelo;
    protected Vehiculo vehiculo;
    protected Date horario;
    protected Pasajero pasajero;

    // Constructor base
    public Reserva(Vuelo vuelo, Vehiculo vehiculo, Date horario, Pasajero pasajero) {
        this.vuelo = vuelo;
        this.vehiculo = vehiculo;
        this.horario = horario;
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
