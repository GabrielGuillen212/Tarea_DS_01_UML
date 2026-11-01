public class PoliticaCancelacion {
    
    protected String idPolitica;
    protected String descripcion;
    protected String titulo;

    public PoliticaCancelacion(String descripcion, String idPolitica, String titulo) {
        this.descripcion = descripcion;
        this.idPolitica = idPolitica;
        this.titulo = titulo;
    }

    public String getIdPolitica() {
        return idPolitica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIdPolitica(String idPolitica) {
        this.idPolitica = idPolitica;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
