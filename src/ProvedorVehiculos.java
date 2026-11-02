import java.util.ArrayList;
import java.util.Date;

public class ProvedorVehiculos {
    protected ArrayList<Vehiculo> vehiculos;
    protected String nombre;

    // Constructor
    public ProvedorVehiculos(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            this.vehiculos.add(vehiculo);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.remove(vehiculo);
    }

    public void reprogramarVehiculo(Vehiculo vehiculo, Date fecha) {
        if (vehiculo != null && this.vehiculos.contains(vehiculo)) {
            vehiculo.setHorario(fecha);
        }
    }

    // Getters y Setters
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}