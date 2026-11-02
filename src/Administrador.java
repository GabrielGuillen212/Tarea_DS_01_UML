import java.util.ArrayList;

public class Administrador extends Usuario {

    protected static ArrayList<Aerolinea> aerolineas;
    protected static ArrayList<ProvedorVehiculos> provedores;
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

    public void agregarProvedores(ProvedorVehiculos provedor) {
        provedores.add(provedor);
    }

    public void agregarAerolineas(Aerolinea aerolinea) {
        aerolineas.add(aerolinea);
    }
}
