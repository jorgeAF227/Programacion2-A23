
package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Profesor;

/**
 *
 * @author jorge
 */
public class ProfesorDao {

 //metodo para agregar 
    public void agregarProfesor(List<Profesor> lista, Profesor profesor) {
      lista.add(profesor);

    }
     //metodo para eliminar
    public void eliminarProfesor( List<Profesor> lista, Profesor profesor) {
      lista.remove(profesor);

    }

    //metodo para buscar 
    public void BuscarProfesoryProfesor(List<Profesor> lista, Profesor profesor) {

        
        for (int i = 0; i < lista.size(); i++) {

            profesor = (Profesor) lista.get(i);
            System.out.println("Nombre" + "\t\t" +                        "NumeroCuenta");
            System.out.println(profesor.getNombre() + "\t\t" + profesor.getApellidoPaterno()+ "\t\t" + profesor.getApellidoMaterno()+ "\t\t" +profesor.getNumeroEmpleado());
        }
    }
   

   //metodo para buscar por id
    public Profesor BuscarProfesorById(List<Profesor> lista, int id) {
        Profesor profesor = new Profesor(); //se instancia un profesor

        for (int i = 0; i < lista.size(); i++) { //se recorre la lista
            if (lista.get(i).getId() == id) {//busca que coimcida el id con la busqueda
                profesor = lista.get(i); //si existe 
                break; // si lo encuentra que no siga reccorriendo la lista
            }
        }
        return profesor;
    
    }
        public void actualizarProfesor(List<Profesor> lista, Profesor profesor) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == profesor.getId()) {
                lista.get(i).setNombre(profesor.getNombre());
                lista.get(i).setApellidoMaterno(profesor.getApellidoMaterno());
                lista.get(i).setGenero(profesor.getGenero());
            }
        }
    }
  public void Imprimir(ArrayList<Profesor> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }

    }

   
    
}
    

