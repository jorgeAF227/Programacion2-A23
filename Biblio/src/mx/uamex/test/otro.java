
package mx.uamex.test;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dao.LibroDao;
import mx.uamex.dao.PrestamoDao;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Persona;
import mx.uamex.dto.Prestamo;
import static mx.uamex.test.Test2prueba.listLibro;
import static mx.uamex.test.Test2prueba.metodosPr;


/**
 *
 * @author jorge
 */
public class otro {
   
    
   
    
        private final Catalogo catalogo;
    private final Prestamo prestamo;

    public otro() {
        this.catalogo = new Catalogo();
        this.prestamo = new Prestamo();
    }

    public void prestarLibro(String nombreLibro, String nombreUsuario) {
        Libro libro = catalogo.buscarLibro(nombreLibro);
        Persona usuario = metodosPr.buscarUsuario(nombreUsuario);
        metodosPr.prestarLibro(listLibro, libro, usuario);
        

    }
}
    

