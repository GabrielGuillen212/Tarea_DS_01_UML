public class GestorDeIncidentes {
    private IResolutor primerResolutor;

    public GestorDeIncidentes(IResolutor primerResolutor) {
        this.primerResolutor = primerResolutor;
    }
    public Incidente reportarIncidente (Incidente incidente){
        System.out.println("\n [Gestor de Incidentes] Se ha reportado un nuevo incidente: " + incidente.getIdIncidente() + "\n Con descripción: " + incidente.getDescripcion());
        return primerResolutor.procesarTicket(incidente);
    }
}
