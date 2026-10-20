public class Estudiante{

    private int id;
    private String carrera;
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int id, int edad, String carrera) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void leer() {
        System.out.println("El estudiante " + nombre + " lee.");
    }

    // Violación SRP
    // public void matricular() {
    //     System.out.println("El estudiante " + nombre + " se matricula en un curso.");
    // }

    public String getNombre() {
        return nombre;
    }

    // setters y getters
}




