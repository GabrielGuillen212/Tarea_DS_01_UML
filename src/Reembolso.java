public class Reembolso {

    protected String idReembolso;
    protected boolean estado;
    protected String descripcion;

    public Reembolso(String descripcion, boolean estado, String idReembolso) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.idReembolso = idReembolso;
    }

    public String getIdReembolso() {
        return idReembolso;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdReembolso(String idReembolso) {
        this.idReembolso = idReembolso;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
