import java.util.ArrayList;

public class AgenteSoporte extends Usuario {

    protected ArrayList<Incidente> incidentes;
    protected AgenteSoporte escalado;

    public AgenteSoporte(String nombre, String correo, String id, AgenteSoporte escalado) {
        super(nombre, correo, id);
        this.incidentes = new ArrayList<>();
        this.escalado = escalado;
    }

    public void gestionarIncidente(Incidente incidente, String estado) {
        for (Incidente i : incidentes) {
            if (i.equals(incidente)) {
                i.setEstado(estado);
                break;
            }
        }
    }

    public void escalarIncidente(Incidente incidente) {
        escalado.incidentes.add(incidente);
    }
}
