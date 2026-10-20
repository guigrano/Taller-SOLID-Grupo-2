import java.util.List;

public class Calculadora {
    
//Siguiendo el principio DIP la clase confia en la abstraccion de la interfaz
    //No esta atada a clases concretas como Triangulo o Rectangulo
    public double sumarAreas(List<Figura> figuras) {
        double areaTotal = 0;
        
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        
        return areaTotal;
    }
}
