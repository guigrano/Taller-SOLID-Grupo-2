/**
 * Ejemplo de Principio de Sustitución de Liskov (LSP).
 * 
 * @author RitaParedesR
 */

// 1. Interfaz para el comportamiento 
interface Cancelable {
    void cancelarYReembolsar();
}

// 2. Clase Base 
class Reserva {
    private String id;
    private double total;

    public Reserva(String id, double total) {
        this.id = id;
        this.total = total;
    }

    public void mostrarDetalles() {
        System.out.println("Reserva ID: " + id + " | Total: $" + total);
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }
}

// 3. Subclase que SÍ puede ser cancelada
class ReservaEstandar extends Reserva implements Cancelable {
    
    public ReservaEstandar(String id, double total) {
        super(id, total);
    }

    @Override
    public void cancelarYReembolsar() {
        System.out.println("Reserva " + getId() + " cancelada. Se reembolsaron $" + getTotal());
    }
}

// 4. Subclase que NO puede ser cancelada
// CUMPLIENDO LISKOV: Al no heredar obligatoriamente el método de cancelación de la clase padre 
// ni implementar 'Cancelable', el diseño es 100% honesto y no rompe el sistema.
class ReservaNoReembolsable extends Reserva {
    
    public ReservaNoReembolsable(String id, double total) {
        super(id, total);
    }
}
