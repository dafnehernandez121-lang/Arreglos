import java.util.Random;

public class AlumMatri {
    public static void main(String[] args) {
        int numAlumnos = 500; 
        int numMaterias = 6;  
        int[][] calificaciones = new int[numAlumnos][numMaterias];
        
    
        Random rand = new Random();
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numMaterias; j++) {
                calificaciones[i][j] = rand.nextInt(101);
            }
        }

        int alumnoABuscar = 350; // Alumno 321
        int materiaABuscar = 5;  // Materia 5
        int calificacionEncontrada = -1;

        // tiempo
        long inicio = System.nanoTime();

        // Recorrido de la matriz de Alumnos primero, luego materias)
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numMaterias; j++) {
                if (i == alumnoABuscar && j == materiaABuscar) {
                    calificacionEncontrada = calificaciones[i][j];
                }
            }
        }

        // termina tiempo
        long tiempoTotal = System.nanoTime() - inicio;

        System.out.println("--- MATRIZ DE ALUMNOS Y MATERIAS ---");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Alumno " + (i + 1) + ":\t");
            for (int j = 0; j < numMaterias; j++) {
                System.out.print(calificaciones[i][j] + "\t");
            }
            System.out.println(); 
        }

        System.out.println("\n--- RESULTADOS DE LA BÚSQUEDA ---");
        System.out.println("Dato encontrado en Alumno " + (alumnoABuscar + 1) + ", Materia " + (materiaABuscar + 1));
        System.out.println("Calificación: " + calificacionEncontrada);
        System.out.println("Tiempo de búsqueda: " + tiempoTotal + " nanosegundos");
    }
}