
package mx.uaemex.servicios;

import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;
import mx.uamex.dto.Profesor;


/**
 *
 * @author jorge
 */
public interface BibliotecaServicio  {
    
    
    
    
    void agregarAlumno (List<Alumno> lista, Alumno alumno);
    void actualizarAlumno (List<Alumno> lista, Alumno alumno);
    void buscarAlumno (List<Alumno> lista, Alumno alumno);
    void eliminarAlumno (List<Alumno> lista, Alumno alumno); 
     
   void agregarLibro (List<Libro> lista, Libro libro);
    void actualizarLibro (List<Libro> lista, Libro libro);
    void buscarLibro (List<Libro> lista, Libro libro);
    void eliminarLibro (List<Libro> lista, Libro libro);
    //este se parece mas al que tienen a acepcion del de actualizar y buscar 
    void agregarPrestamo ( Prestamo prestamo);
    void actualizarPrestamo ( List<Prestamo> lista, Prestamo prestamo);
    void buscarPrestamo ( List lista, Prestamo prestamo);
    void eliminarPrestamo (Prestamo prestamo);
    
    void agregarProfesor (List<Profesor> lista, Profesor profesor);
    void actualizarProfesor (List<Profesor> lista, Profesor profesor);
    void buscarProfesor (List<Profesor> lista, Profesor profesor);
    void eliminarProfesor (List<Profesor> lista, Profesor profesor);
    
}
