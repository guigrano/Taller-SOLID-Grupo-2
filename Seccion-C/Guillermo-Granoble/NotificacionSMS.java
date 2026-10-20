public class NotificacionSMS implements Notificacion {
    @Override 
    public void notificar() {
        enviarSMS();
    }

    private void enviarSMS() {};
    
}
