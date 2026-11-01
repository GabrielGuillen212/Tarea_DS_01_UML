public class Incidente {

    protected String idIncidente;
    protected String descripcion;
    protected AgenteSoporte gestionador;
    protected Usuario reportador;
    protected String estado;
    protected static int cont = 0; //se agrego para poder crear los ID

    public Incidente(String descripcion, AgenteSoporte gestionador, Usuario reportador) {
        this.descripcion = descripcion;
        this.gestionador = gestionador;
        this.reportador = reportador;
        this.estado = "Pendiente";
        setIdIncidente();
    }

    public String getIdIncidente() {
        return idIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public AgenteSoporte getGestionador() {
        return gestionador;
    }

    public Usuario getReportador() {
        return reportador;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdIncidente() {
        cont++;
        this.idIncidente = "I-" + cont;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGestionador(AgenteSoporte gestionador) {
        this.gestionador = gestionador;
    }

    public void setReportador(Usuario reportador) {
        this.reportador = reportador;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
