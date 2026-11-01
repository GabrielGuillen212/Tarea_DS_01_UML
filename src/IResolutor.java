public interface IResolutor {
    void setSiguiente(IResolutor siguiente);
    Incidente procesarTicket(Incidente incidente);
}
