## Listas y Arraylists son lo mismo en Java? 

No, **listas (List)** y **ArrayLists** no son lo mismo en Java, pero están estrechamente relacionadas. Aquí tienes una explicación clara y concisa:

### **1. `List` es una interfaz**
- `List` es una **interfaz** en Java, parte del paquete `java.util`.
- Define un comportamiento general para las listas, como almacenar elementos en un orden específico, permitir duplicados y tener métodos como `add`, `remove`, `get`, etc.
- No se puede instanciar directamente porque es solo una definición de comportamiento.

### **2. `ArrayList` es una implementación concreta de `List`**
- `ArrayList` es una **clase concreta** que implementa la interfaz `List`.
- Utiliza un arreglo dinámico internamente para almacenar los elementos. Esto significa que el tamaño del arreglo puede crecer automáticamente cuando se agregan más elementos.
- Como implementa `List`, debe proporcionar implementaciones para todos los métodos definidos en la interfaz.

### **Ejemplo de código:**

```java
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Usando la interfaz List (polimorfismo)
        List<String> listaDeNombres = new ArrayList<>();

        // Agregando elementos
        listaDeNombres.add("Juan");
        listaDeNombres.add("María");
        listaDeNombres.add("Pedro");

        // Mostrando elementos
        System.out.println("Elementos de la lista:");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }
    }
}
```

### **Diferencias clave:**
| Característica                 | List                          | ArrayList                      |
|--------------------------------|-------------------------------|--------------------------------|
| **Tipo**                       | Interfaz                     | Clase concreta                |
| **Instanciación**              | No se puede instanciar        | Se puede instanciar directamente |
| **Métodos**                    | Declarados, no implementados | Implementados                 |
| **Ejemplo de implementación** | `ArrayList`, `LinkedList`, etc. | Específica para `ArrayList`    |

### **En resumen:**
- Usa `List` como tipo para aprovechar el polimorfismo y permitir que tu código sea más flexible (por ejemplo, podrías cambiar a `LinkedList` más tarde sin cambiar mucho código).
- Usa `ArrayList` cuando necesites una lista basada en arreglos dinámicos.


---



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 