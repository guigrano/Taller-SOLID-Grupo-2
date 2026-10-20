/**
 * Ejemplo de SRP.
 * 
 * @author RitaParedesR
 */

import java.util.ArrayList;
import java.util.List;

// Gestionar únicamente el estado del carrito
public class ShoppingCart {
    private final List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }
}

// 2. RESPONSABILIDAD:
class OrderCalculator {

    public double calculateTotalPrice(ShoppingCart cart) {
        double total = 0;
        for (Product p : cart.getItems()) {
            total += p.getPrice();
        }
        return total;
    }
}

// 3. RESPONSABILIDAD
 class Notification {
    public void sendReceipt(ShoppingCart cart, double totalPrice) {
        System.out.println("Enviando recibo por correo electrónico...");
        System.out.println("Total de la compra: $" + totalPrice);
    }
}
