import java.util.ArrayList;

public class Administrador extends Usuario {

    protected static ArrayList<aerolinea> aerolineas;
    protected static ArrayList<Provedores> provedores;
    protected static ArrayList<PoliticaCancelacion> politicasCancelacion;

    public Administrador(String nombre, String correo, String id) {
        super(nombre, correo, id);
        
    }

    public void gestionarItinerario() {
        System.out.println("Gestionando itinerario...");
    }

    public void gestionarReembolsos(Reembolso reembolso, boolean estado) {
        reembolso.setEstado(estado);
    }

    public void gestionarPoliticasCancelacion(PoliticaCancelacion politica, String descripcion) {
        politica.setDescripcion(descripcion);       
    }

    public void agregarProvedores(Provedores provedor) {
        provedores.add(provedor);
    }

    public void agregarAerolineas(aerolinea aerolinea) {
        aerolineas.add(aerolinea);
    }
}
