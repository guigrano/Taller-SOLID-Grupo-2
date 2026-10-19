public class Universidad {
    private String nombre;
    private int cantEstudiantes;
    private int cantProfesores;

    public Universidad(String nombre, int cantEstudiantes, int cantProfesores) {
        this.nombre = nombre;
        this.cantEstudiantes = cantEstudiantes;
        this.cantProfesores = cantProfesores;
    }

    // Cumpliendo SRP
    public void matricularEstudiante(Estudiante estudiante) {
        System.out.println("El estudiante " + estudiante.getNombre() + " se ha matriculado en la universidad " + nombre + ".");
    }

    // setters y getters
}
