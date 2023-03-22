
package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Persona;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author jorge
 */
public class PrestamoDao {
      List<Prestamo> listPrestamo = new ArrayList <>();
      
    public void agregarPrestamo(  Prestamo prestamo) {
       listPrestamo.add(prestamo);

    }

    public void eliminarPrestamo( Prestamo prestamo) {
      listPrestamo.remove(prestamo);

    }


 public void buscarPrestamo(List lista, Prestamo prestamo) {

        
        for (int i = 0; i < lista.size(); i++) {
        
           prestamo = (Prestamo) lista.get(i);
            System.out.println(prestamo.toString());
        }
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        for (int i = 0; i < listPrestamo.size(); i++) {
            if (listPrestamo.get(i).getId() == prestamo.getId()) {
                listPrestamo.get(i).setFolio(prestamo.getFolio());
            }
        }
    }

    public List<Prestamo> imprimirtListaPrestamos() {
        return listPrestamo;
      
    }
    private final List<Persona> usuarios;

    public PrestamoDao() {
        this.usuarios = new ArrayList<>();
        // Agregar usuarios a la lista
    }

    public Persona buscarUsuario(String nombre) {
        for (Persona usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public void prestarLibro(List listlibro, Libro libro, Persona usuario) {
        // Realizar el préstamo del libro al usuario
    }
}
