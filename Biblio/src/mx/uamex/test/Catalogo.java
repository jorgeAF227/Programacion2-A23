
package mx.uamex.test;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Libro;

/**
 *
 * @author jorge
 */
   public class Catalogo {
    private final List<Libro> libros;

    public Catalogo() {
        this.libros = new ArrayList<>();
        // Agregar libros a la lista
    }

    public Libro buscarLibro(String nombre) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }
} 

