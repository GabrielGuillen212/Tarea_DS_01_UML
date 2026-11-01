import java.util.ArrayList;

public class AgenteSoporte extends Usuario implements IResolutor {

    protected ArrayList<Incidente> incidentes;
    protected IResolutor siguiente;

    public AgenteSoporte(String nombre, String correo, String id) {
        super(nombre, correo, id);
        this.incidentes = new ArrayList<>();
    }
    @Override 
    public void setSiguiente(IResolutor siguiente) {
        this.siguiente = siguiente;
    }
    @Override 
    public Incidente procesarTicket(Incidente incidente) {
        String desc = incidente.getDescripcion().toLowerCase();
        boolean puedeResolver = desc.contains("problema")|| desc.contains("error") || desc.contains("fallo")|| desc.contains("horario");
        if (puedeResolver) {
            System.out.println("El agente " + this.getNombre() + " ha resuelto el incidente: " + incidente.getIdIncidente());
            incidente.setEstado("Resuelto por Soporte");
            return incidente;
        } else if (siguiente != null) {
            System.out.println("El agente " + this.getNombre() + " no puede resolver el incidente: " + incidente.getIdIncidente() + ". Escalando a Proveedor.");
            return siguiente.procesarTicket(incidente);
        } else {
            System.out.println("El agente " + this.getNombre() + " no puede resolver el incidente: " + incidente.getIdIncidente() + ". No hay más agentes disponibles para escalar en este momento.");
            incidente.setEstado("Pendiente de resolución");
            return incidente;
        }
    }
}
