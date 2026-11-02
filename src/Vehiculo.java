import java.util.Date;

public class Vehiculo {
    protected String tipo;
    protected Pasajero pasajero;
    protected Date horario;

    public Vehiculo(String tipo, Pasajero pasajero, Date horario) {
        this.tipo = tipo;
        this.pasajero = pasajero;
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}