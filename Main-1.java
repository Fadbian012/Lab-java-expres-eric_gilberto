/**
 * Clase ejecutable para probar la lógica de Estudiante.
 * 
 * @author Eric Fabián De León Batista, Gilberto Jones
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== EVALUACIÓN ACADÉMICA EXPRÉS UTP ===");

        // Arreglo de notas de prueba (una nota es inválida a propósito: 150.0)
        double[] misNotas = {85.0, 150.0, 90.0};

        Estudiante est = new Estudiante("Carlos Pérez", misNotas);

        // Resultados en pantalla
        System.out.println("Estudiante: " + est.getNombre());
        System.out.printf("Promedio Final: %.2f\n", est.calcularPromedio());
        System.out.println("Estado: " + (est.estaAprobado() ? "✅ APROBADO" : "❌ REPROBADO"));
    }
}
