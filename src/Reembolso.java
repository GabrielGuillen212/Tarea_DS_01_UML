public class Reembolso {

    protected String idReembolso;
    protected String estado;
    protected String descripcion;

    public Reembolso(String descripcion, String estado, String idReembolso) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.idReembolso = idReembolso;
    }

    public String getIdReembolso() {
        return idReembolso;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdReembolso(String idReembolso) {
        this.idReembolso = idReembolso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
