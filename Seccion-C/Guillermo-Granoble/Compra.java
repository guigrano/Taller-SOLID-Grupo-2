import java.util.List;

public class Compra {
    private Pago pago;
    private List articulos;

    public Compra (Pago pago, List articulos) {
        this.pago = pago;
        this.articulos = articulos;
    }

    public void agregarArticulo(Object articulo) {
        // Lógica para agregar un artículo a la compra
    }

    public void removerArticulo(Object articulo) {
        // Lógica para remover un artículo de la compra
    }
}
