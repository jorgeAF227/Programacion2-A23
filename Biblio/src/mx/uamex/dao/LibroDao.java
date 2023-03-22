package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Libro;

/**
 *
 * @author jorge
 */
public class LibroDao {

    public void agregarLibro(List listlibro, Libro libro) {

        listlibro.add(libro);

    }

    public void eliminarLibro(List<Libro> lista, Libro libro) {
        lista.remove(libro);

    }

    //metodo para buscar 
    public void buscarlibro(List<Libro> lista, Libro libro) {

        
        for (int i = 0; i < lista.size(); i++) {
        
           libro = (Libro) lista.get(i);
            System.out.println(libro.toString());
        }
    }
   
    //metodo para buscar por id

    public Libro BuscarLibrorById(List<Libro> lista, int id) {
        Libro libro = new Libro(); //se instancia un libro

        for (int i = 0; i < lista.size(); i++) { //se recorre la lista
            if (lista.get(i).getId() == id) {//busca que coimcida el id con la busqueda
               libro  = lista.get(i); //si existe 
                break; // si lo encuentra que no siga reccorriendo la lista
            }
        }
        return libro;
    }

    public void actualizarLibro(List<Libro> lista, Libro libro) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == libro.getId()) {
                lista.get(i).setNombre(libro.getNombre());
                lista.get(i).setEditorial(libro.getEditorial());

            }
        }
    }

    public void Imprimir(ArrayList<Libro> listLibro) {
        for (int i = 0; i < listLibro.size(); i++) {
            System.out.println(listLibro.get(i).toString());

        }

    }

}
