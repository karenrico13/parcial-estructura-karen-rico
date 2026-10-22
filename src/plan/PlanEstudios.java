package plan;

import cursos.*;
import java.util.ArrayList;

/**
 * Plan de estudios que COMPONE cursos.
 * Los cursos se crean dentro del constructor (composición real).
 */
public class PlanEstudios {

    private String nombre;
    private ArrayList<Curso> cursos;

    public PlanEstudios(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        // Creamos los cursos iniciales dentro del plan por composición
        agregarCurso(new CursoObligatorio("MAT101", "Matemáticas Básicas", 4));
        agregarCurso(new CursoElectivo("PROG101", "Introducción a Programación", 3));
        agregarCurso(new CursoNivelatorio("NIV101", "Nivelación de Inglés", 2));
    }

    /**
     * Método privado para agregar cursos desde el propio constructor.
     * Solo el plan puede crear sus cursos (composición).
     */
    private void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    /**
     * Promedio de dificultad de todos los cursos del plan.
     * Retorna 0 si el plan no tiene cursos.
     */
    public double dificultadPromedio() {
        if (cursos.isEmpty()) {
            return 0.0;
        }
        double sumaDificultades = 0;
        for (Curso curso : cursos) {
            sumaDificultades += curso.dificultadEsperada();
        }
        return sumaDificultades / cursos.size();
    }

    public String getNombre() { return nombre; }
    public ArrayList<Curso> getCursos() { return cursos; }
}