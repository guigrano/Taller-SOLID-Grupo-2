public class EstudianteAcademico extends Estudiante implements AyudanteAcademico {
    public EstudianteAcademico(String nombre, int id, int edad, String carrera) {
        super(nombre, id, edad, carrera);
    }

    @Override
    public void ensenarMateria(String materia) {
        System.out.println("El estudiante " + getNombre() + " enseña la materia " + materia);
    }
}


