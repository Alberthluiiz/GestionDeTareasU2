package gestionDeTareas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Clase para gestionar las tareas utilizando una pila y una cola.
 */
public class GestorDeTareas {
    private Stack<Tarea> tareasPendientes;
    private Queue<Tarea> tareasCompletadas;

    public GestorDeTareas() {
        tareasPendientes = new Stack<>();
        tareasCompletadas = new LinkedList<>();
    }

    // Agregar una tarea nueva
    public void agregarTarea(String descripcion) {
        tareasPendientes.push(new Tarea(descripcion));
        System.out.println("Tarea agregada: " + descripcion);
    }

    // Marcar una tarea como completada
    public void marcarComoCompletada() {
        if (tareasPendientes.isEmpty()) {
            System.out.println("No hay tareas pendientes para completar.");
        } else {
            Tarea tareaCompletada = tareasPendientes.pop();
            tareasCompletadas.add(tareaCompletada);
            System.out.println("Tarea completada: " + tareaCompletada.getDescripcion());
        }
    }

    // Eliminar una tarea pendiente
    public void eliminarTarea() {
        if (tareasPendientes.isEmpty()) {
            System.out.println("No hay tareas pendientes para eliminar.");
        } else {
            Tarea tareaEliminada = tareasPendientes.pop();
            System.out.println("Tarea eliminada: " + tareaEliminada.getDescripcion());
        }
    }

    // Mostrar todas las tareas pendientes
    public void verTareasPendientes() {
        if (tareasPendientes.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (Tarea tarea : tareasPendientes) {
                System.out.println("- " + tarea);
            }
        }
    }

    // Mostrar la próxima tarea a realizar
    public void verProximaTarea() {
        if (tareasPendientes.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Próxima tarea a realizar: " + tareasPendientes.peek());
        }
    }
}
