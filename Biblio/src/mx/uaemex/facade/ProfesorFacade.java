
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.servicios.BibliotecaServicio;
import mx.uamex.dao.ProfesorDao;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;
import mx.uamex.dto.Profesor;

/**
 *
 * @author jorge
 */
public abstract class ProfesorFacade implements BibliotecaServicio {
    ProfesorDao profesorDao = new ProfesorDao();

   
    @Override
    public void agregarProfesor(List<Profesor> lista, Profesor profesor) {
       profesorDao.agregarProfesor(lista, profesor);
    }

  
    
    @Override
    public void actualizarProfesor(List<Profesor> lista, Profesor profesor) {
        profesorDao.actualizarProfesor(lista, profesor);
    }
    

    @Override
    public void eliminarProfesor(List<Profesor> lista, Profesor profesor) {
        profesorDao.eliminarProfesor(lista, profesor);
    }

   
    @Override
    public void buscarProfesor(List<Profesor> lista, Profesor profesor) {
        profesorDao.BuscarProfesoryProfesor(lista, profesor);
    }

   
    
}
    
    

