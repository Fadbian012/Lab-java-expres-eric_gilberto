/**
 * Clase que representa a un estudiante y gestiona sus notas académicas.
 * 
 * @author Eric Fabián De León Batista, Gilberto Jones
 * @version 1.0
 */
public class Estudiante {

    // -------------------------------------------------------------
    // PASO 1 (BÁSICO): Atributos Privados
    // -------------------------------------------------------------
    private String nombre;
    private double[] notas;

    // -------------------------------------------------------------
    // PASO 2 (BÁSICO/INTERMEDIO): Constructor y Encapsulamiento
    // -------------------------------------------------------------
    /**
     * Constructor principal de la clase Estudiante.
     * 
     * @param nombre Nombre completo del estudiante.
     * @param notas  Arreglo con las 3 notas del semestre.
     */
    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        setNotas(notas); // Usamos el setter para aplicar validaciones
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    /**
     * Asigna las notas asegurando que estén en el rango válido [0.0 - 100.0].
     * 
     * @param notas Arreglo de notas a validar.
     */
    public void setNotas(double[] notas) {
        if (notas != null && notas.length == 3) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < 0.0 || notas[i] > 100.0) {
                    notas[i] = 0.0;
                }
            }
            this.notas = notas;
        } else {
            this.notas = new double[]{0.0, 0.0, 0.0};
        }
    }

    // -------------------------------------------------------------
    // PASO 3 (AVANZADO): Lógica con Arreglos y Métodos
    // -------------------------------------------------------------
    /**
     * Calcula y retorna el promedio numérico de las 3 notas.
     * 
     * @return Promedio final acumulado.
     */
    public double calcularPromedio() {
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    /**
     * Evalúa si el estudiante aprobó la asignatura en base oficial UTP (>= 71.0).
     * 
     * @return true si aprobó, false en caso contrario.
     */
    public boolean estaAprobado() {
        return calcularPromedio() >= 71.0;
    }
}
