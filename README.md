# Arreglos
Observe que mientras más datos son el programa se hace cada vez mas lento


# EJER-ARREGLOS

Este programa facilita el control de ventas mensuales de una tienda con 3 departamentos distintos posibles, con ayuda de una matriz bidimensional. los métodos que utiliza son (haré una explicación muy breve de cada uno): RegistrodeVentas() su funcion es inicializar la matriz al momento de instanciar el objeto; insertarVenta(int mesIndex, int deptoIndex, double cantidad), este se encarga de validar que los indices esten en el rango establecido y procede a registrar el monto de venta;  buscarVenta(double cantABuscar), se encarga de escanear de manera secuencial y ordenanda todas  las celdas de la matriz para encontrar una coincidencia e imprime el mes y el departamento donde se necontró el monto; eliminarVenta(int mesIndex, int deptoIndex), es el que se encarga de eliminar el monto y agregar 0.0 en el lugar;  imprimirTabla(), este método es el que se encarga de recorrer la matriz por completo y aplica el formato que anteriormente fue establecido para poder visualizar la información de mejor manera y por último está el método main(String[] args) que es lo primero que aparece al ejecutar el programa porque despliega un menú interactivo que captura la entrada que el usuario introduce y practicamente es el método que dirige a todo el resto del programa.
