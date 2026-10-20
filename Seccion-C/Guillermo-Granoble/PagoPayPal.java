public class PagoPayPal implements PagoEnLinea {
    private boolean loggedIn;

    @Override 
    public void realizarCobro(double monto) {
        // Lógica para realizar el cobro a través de PayPal
    }

    @Override
    public boolean verificarConexion() {
        return loggedIn;
    }
}
