
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.servicios.BibliotecaServicio;
import mx.uamex.dao.LibroDao;
import mx.uamex.dto.Libro;


/**
 *
 * @author jorge
 */
public abstract class LibroFacade implements BibliotecaServicio {
     LibroDao libroDao = new LibroDao();

   
     @Override
    public void agregarLibro(List<Libro> lista, Libro libro) {
       libroDao.agregarLibro(lista, libro);
    }

  
    
     @Override
    public void actualizarLibro(List<Libro> lista, Libro libro) {
        libroDao.actualizarLibro(lista, libro);
    }
    

     @Override
    public void eliminarLibro(List<Libro> lista, Libro libro) {
        libroDao.eliminarLibro(lista, libro);
    }

   
     @Override
    public void buscarLibro(List<Libro> lista, Libro libro) {
        libroDao.buscarlibro(lista, libro);
    }

   
    
    
    
}
    

