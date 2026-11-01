public class Usuario {
    protected String nombre;
    protected String correo;
    protected String id;

    public Usuario(String nombre, String correo, String id) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Incidente reportarIncidente(String titulo, String descripcion, AgenteSoporte soporte) {
        
        Incidente incidente = new Incidente(descripcion, soporte, this);

        return incidente;
    }
}