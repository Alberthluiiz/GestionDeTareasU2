# Sistema de Gestión de Tareas

Este proyecto implementa un sistema de gestión de tareas utilizando las estructuras de datos **pila** y **cola** en Java. Está diseñado para ayudar a los usuarios a organizar y realizar un seguimiento de sus tareas de manera eficiente.

## Características del Sistema

1. **Agregar Tarea**: Permite añadir una nueva tarea pendiente.
2. **Marcar Tarea como Completada**: Mueve una tarea pendiente a la cola de tareas completadas.
3. **Eliminar Tarea**: Elimina una tarea pendiente.
4. **Ver Tareas Pendientes**: Muestra todas las tareas pendientes en el sistema.
5. **Ver Próxima Tarea**: Muestra la tarea más reciente (en la cima de la pila).

## Tecnologías Utilizadas

- **Lenguaje**: Java
- **Estructuras de Datos**: `Stack` y `Queue`
- **IDE Recomendado**: IntelliJ IDEA, Eclipse, o cualquier editor con soporte para Java

## Estructura del Proyecto

```plaintext
gestionDeTareas/
├── Tarea.java              # Clase que representa una tarea
├── GestorDeTareas.java     # Clase para gestionar las operaciones del sistema
└── Main.java               # Clase principal con el menú de interacción

--- Sistema de Gestión de Tareas ---
1. Agregar tarea
2. Marcar tarea como completada
3. Eliminar tarea
4. Ver tareas pendientes
5. Ver próxima tarea
6. Salir
Seleccione una opción: 1
Ingrese la descripción de la tarea: Terminar informe
Tarea agregada: Terminar informe
