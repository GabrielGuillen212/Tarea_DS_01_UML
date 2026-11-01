public class ProveedorExterno implements IResolutor {
    protected String nombreEmpresa;
    protected IResolutor siguiente;
    public ProveedorExterno(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    @Override
    public void setSiguiente(IResolutor siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public Incidente procesarTicket(Incidente incidente) {
        String desc = incidente.getDescripcion().toLowerCase();
        //El proveedor externo al ser escalado, puede resolver problemas que le competen directamente como vuelo o reserva de vehiculo.
        boolean puedeResolver = desc.contains("vuelo")|| desc.contains("reembolso")|| desc.contains("vehiculo")|| desc.contains("carro")|| desc.contains("reserva") ;
        if (puedeResolver) {
            System.out.println("El proveedor " + this.nombreEmpresa + " ha resuelto el incidente: " + incidente.getIdIncidente());
            incidente.setEstado("Resuelto por Proveedor");
            return incidente;
        } else if (siguiente != null) { //Este segmento es en caso que anadamos algun nivel mayor como Departamento legal o similar
            System.out.println("El proveedor " + this.nombreEmpresa + " no puede resolver el incidente: " + incidente.getIdIncidente() + ". Escalando a siguiente proveedor.");
            return siguiente.procesarTicket(incidente);
        } else {
            System.out.println("El proveedor " + this.nombreEmpresa + " no puede resolver el incidente: " + incidente.getIdIncidente() + ". No hay más proveedores disponibles para escalar en este momento.");
            incidente.setEstado("Pendiente de resolución");
            return incidente;
        }
    }
}
