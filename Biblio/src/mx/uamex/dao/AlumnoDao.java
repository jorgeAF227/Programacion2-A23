package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Alumno;

/**
 *
 * @author jorge
 */
public class AlumnoDao {

    public void agregarAlumno(List<Alumno> lista, Alumno alumno) {
        lista.add(alumno);

    }

    public void eliminarAlumno(List<Alumno> lista, Alumno alumno) {
        lista.remove(alumno);
    }

    public void buscarAlumno(List<Alumno> lista, Alumno alumno) {

        System.out.println("Nombre" + "\t\t" + "NumeroCuenta");
        for (int i = 0; i < lista.size(); i++) {

            alumno = (Alumno) lista.get(i);

        }
    }

    public Alumno buscarAlumnoById(List<Alumno> lista, int id) {
        Alumno alumno = new Alumno();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                alumno = lista.get(i);
                break;
            }
        }
        return alumno;
    }

    public void actualizarAlumno(List<Alumno> lista, Alumno alumno) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == alumno.getId()) {
                lista.get(i).setNombre(alumno.getNombre());
                lista.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
                lista.get(i).setGenero(alumno.getGenero());
            }
        }
    }



    public void Imprimir(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }

    }

}
