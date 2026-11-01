public class Main {
    //Esto es una prueba de la aplicacion de inyeccion de dependencias y el patron Chain of Responsibility
    //MODIFICAR PREVIO A ENTREGA, EAZM 
    //Instancia de usuario, agente de soporte y proveedor externo
    public static void main(String[] args) {
    Usuario usuario = new Usuario("Ezequiel Zuniga Murillo", "eazuniga@espol.edu.ec", "Us-001");
    AgenteSoporte agenteNiv1 = new AgenteSoporte("Gabriel Guillen", "gaboguille@travelease.com", "Sp-001");
    ProveedorExterno aerolinea = new ProveedorExterno("Aerolinea TAME");
    //aplicacion de inyeccion de dependencias
    agenteNiv1.setSiguiente(aerolinea);
    //incidentes de prueba
    GestorDeIncidentes gestor = new GestorDeIncidentes(agenteNiv1);
    Incidente ticket1 = new Incidente("Tengo una duda con el horario de mi abordaje", agenteNiv1, usuario); // resuelve Agente
    Incidente ticket2 = new Incidente("Necesito solicitar el reembolso de mi vuelo", agenteNiv1, usuario); // resuelve Proveedor
    Incidente ticket3 = new Incidente("La comida del restaurante estuvo fría", agenteNiv1, usuario); // queda Pendiente
    //simulacion de la resolucion de los incidentes
    gestor.reportarIncidente(ticket1);
    gestor.reportarIncidente(ticket2);
    gestor.reportarIncidente(ticket3);
    }
}