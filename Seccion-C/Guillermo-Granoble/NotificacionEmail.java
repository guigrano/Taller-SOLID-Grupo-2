public class NotificacionEmail implements Notificacion {
    @Override 
    public void notificar() {
        enviarEmail();
    }

    private void enviarEmail() {};
}
