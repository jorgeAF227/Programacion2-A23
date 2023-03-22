
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.servicios.BibliotecaServicio;
import mx.uamex.dao.AlumnoDao;
import mx.uamex.dto.Alumno;


/**
 *
 * @author jorge
 */
public abstract class AlumnoFacade implements BibliotecaServicio {
    
    AlumnoDao alumnoDao = new AlumnoDao();

 
    @Override
    public void agregarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.agregarAlumno(lista, alumno);
    }

  
    @Override
    public void actualizarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.actualizarAlumno(lista, alumno);
    }
    
    @Override
    public void eliminarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.eliminarAlumno(lista, alumno);
    }

  
    @Override
    public void buscarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.buscarAlumno(lista, alumno);
    }
    
    
    
}
