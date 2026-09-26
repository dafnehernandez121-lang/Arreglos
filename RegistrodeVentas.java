import java.util.Scanner;

public class RegistrodeVentas {
    double[][] ventas;
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    String[] deptos = {"Ropa", "Deportes", "Juguetería"};

    public RegistrodeVentas() {
        ventas = new double[12][3];
    }

    public void insertarVenta(int mesIndex, int deptoIndex, double cantidad) {
        if(mesIndex >= 0 && mesIndex < 12 && deptoIndex >= 0 && deptoIndex < 3) {
            ventas[mesIndex][deptoIndex] = cantidad;
            System.out.println("¡Venta registrada con éxito!");
        } else {
            System.out.println("Error: valores incorrectos.");
        }
    }

    public void buscarVenta(double cantABuscar) {
        boolean encontrado = false;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                if (ventas[i][j] == cantABuscar) {
                    System.out.println("-> Venta de $" + cantABuscar + " encontrada en " + meses[i] + " (" + deptos[j] + ").");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró esa cantidad.");
        }
    }

    public void eliminarVenta(int mesIndex, int deptoIndex) {
        if(mesIndex >= 0 && mesIndex < 12 && deptoIndex >= 0 && deptoIndex < 3) {
            ventas[mesIndex][deptoIndex] = 0.0;
            System.out.println("¡La venta fue eliminada con éxito!");
        } else {
            System.out.println("Error: valores incorrectos por favor, intente de nuevo.");
        }
    }

    public void imprimirTabla() {
        System.out.println("\n-------------------- TABLA DE VENTAS -------------------");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "", "Ropa", "Deportes", "Juguetería");
        
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-15s $%-14.2f $%-14.2f $%-14.2f\n", meses[i], ventas[i][0], ventas[i][1], ventas[i][2]);
        }
        System.out.println("-------------------------------------------------------\n");
    }

    public static void main(String[] args) {
        RegistrodeVentas app = new RegistrodeVentas();
        Scanner menu = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar venta");
            System.out.println("2. Buscar venta");
            System.out.println("3. Eliminar venta");
            System.out.println("4. Mostrar tabla de ventas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = menu.nextInt();

            if (opcion == 1) {
                System.out.print("Ingresa el número de mes (1=Enero, 2=Febrero, 3=Marzo, 4=Abril, 5=Mayo, 6=Junio; 7=Julio, 8=Agosto, 9=Septiembre, 10=Octubre, 11=Noviembre, 12=Diciembre): ");
                int m = menu.nextInt() - 1; 
                System.out.print("Ingresa el departamento (1=Ropa, 2=Deportes, 3=Juguetería): ");
                int d = menu.nextInt() - 1;
                System.out.print("Ingresa la cantidad de la venta: $");
                double cant = menu.nextDouble();
                
                app.insertarVenta(m, d, cant);
            } 

            else if (opcion == 2) {
                System.out.print("Ingresa la cantidad exacta que deseas buscar: $");
                double cant = menu.nextDouble();
                app.buscarVenta(cant);
            } 
            else if (opcion == 3) {
                System.out.print("Ingresa el número de mes (1=Enero, 2=Febrero, 3=Marzo, 4=Abril, 5=Mayo, 6=Junio; 7=Julio, 8=Agosto, 9=Septiembre, 10=Octubre, 11=Noviembre, 12=Diciembre) de la venta a eliminar: ");
                int m = menu.nextInt() - 1; 
                System.out.print("Ingresa el número del departamento (1 = Ropa, 2 = Deportes, 3 = Juguetería): ");
                int d = menu.nextInt() - 1;
                
                app.eliminarVenta(m, d);
            } 
            else if (opcion == 4) {
                app.imprimirTabla();
            } 
            else if (opcion != 5) {
                System.out.println("Opción no válida por favor, intenta de nuevo.");
            }
        }
        
        System.out.println("Saliendo del programa...");
        menu.close();
    }
}