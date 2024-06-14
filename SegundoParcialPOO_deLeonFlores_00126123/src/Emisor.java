public class Emisor {
    private  Emisor(Notificaciones notificaciones)
    {
        this.Notificaciones = notificaciones;
    }

    public void mandar(String Mensaje)
    {
        Notificaciones.send(Mensaje);
    }
}