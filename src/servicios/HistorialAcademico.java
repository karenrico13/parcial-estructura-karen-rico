package servicios;

import personas.Estudiante;

/**
 * Historial académico derivado de un estudiante.
 * Se usa como DEPENDENCIA desde Recomendador.
 */
public class HistorialAcademico {

    private Estudiante estudiante;

    public HistorialAcademico(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /** Promedio del estudiante. */
    public double promedio() {
        if (estudiante == null) {
            return 0.0;
        }
        return estudiante.promedio();
    }

    /** Cantidad de cursos inscritos. */
    public int cantidadCursos() {
        if (estudiante == null || estudiante.getInscritos() == null) {
            return 0;
        }
        return estudiante.getInscritos().size();
    }

    public Estudiante getEstudiante() { return estudiante; }
}