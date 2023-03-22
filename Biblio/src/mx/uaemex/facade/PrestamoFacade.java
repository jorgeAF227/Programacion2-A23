
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.servicios.BibliotecaServicio;
import mx.uamex.dao.PrestamoDao;
import mx.uamex.dto.Prestamo;


 // publico abstracto Nombre        implemento  Nombre de la capa de servicio
public abstract class PrestamoFacade implements BibliotecaServicio {
    PrestamoDao prestamoDao = new PrestamoDao();

   
    @Override
    public void agregarPrestamo(Prestamo prestamo) {
       prestamoDao.agregarPrestamo(prestamo);
    }

   public void buscarPrestamo(List lista, Prestamo prestamo) {
       prestamoDao.buscarPrestamo(lista, prestamo);
   }
    
    @Override
    public void actualizarPrestamo(List<Prestamo> lista, Prestamo prestamo) {
       prestamoDao.actualizarPrestamo(prestamo);
    }
    

  
    @Override
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoDao.eliminarPrestamo(prestamo);
    }

   
  

   
    
}
    
