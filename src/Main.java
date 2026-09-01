/**
 * Clase ejecutable para probar la lógica de Estudiante.
 * 
 * @author TU NOMBRE Y CÉDULA
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== EVALUACIÓN ACADÉMICA EXPRÉS UTP ===");

        // Arreglo de notas de prueba (una nota es inválida a propósito: 150.0)
        double[] misNotas = {85.0, 150.0, 90.0};

        // TODO 6: Instancia un objeto 'Estudiante' pasándole tu nombre y el arreglo 'misNotas'
        Estudiante est = new Estudiante("Carlos Pérez", misNotas);

        // Resultados en pantalla
        System.out.println("Estudiante: " + est.getNombre());
        System.out.printf("Promedio Final: %.2f\n", est.calcularPromedio());
        System.out.println("Estado: " + (est.estaAprobado() ? "✅ APROBADO" : "❌ REPROBADO"));
    }
}
