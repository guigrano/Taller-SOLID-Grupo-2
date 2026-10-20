public class NotificacionSignal implements Notificacion {
    @Override 
    public void notificar() {
        enviarSignal();
    }

    private void enviarSignal() {};
}
