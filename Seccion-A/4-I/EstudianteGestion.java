public class EstudianteGestion extends Estudiante implements AyudanteGestion {
    public EstudianteGestion(String nombre, int id, int edad, String carrera) {
        super(nombre, id, edad, carrera);
    }

    @Override
    public void ayudarAdministracion(String tarea) {
        System.out.println("El estudiante " + getNombre() + " está ayudando con la tarea administrativa: " + tarea);
    }
    
}

