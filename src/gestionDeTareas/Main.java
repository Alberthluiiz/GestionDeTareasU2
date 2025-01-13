package gestionDeTareas;

import java.util.Scanner;

/**
 * Clase principal para interactuar con el usuario y gestionar las tareas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeTareas gestor = new GestorDeTareas();
        int opcion;

        do {
            System.out.println("\n--- Sistema de Gestión de Tareas ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Ver tareas pendientes");
            System.out.println("5. Ver próxima tarea");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(descripcion);
                    break;
                case 2:
                    gestor.marcarComoCompletada();
                    break;
                case 3:
                    gestor.eliminarTarea();
                    break;
                case 4:
                    gestor.verTareasPendientes();
                    break;
                case 5:
                    gestor.verProximaTarea();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
