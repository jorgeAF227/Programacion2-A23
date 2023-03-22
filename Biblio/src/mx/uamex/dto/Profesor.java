
package mx.uamex.dto;

/**
 *
 * @author jorge
 */
public class Profesor extends Persona{
    private int id;
    private int numeroEmpleado;

    @Override
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Profeso: " + "id=" + id + ", numeroEmpleado=" + numeroEmpleado + "nombre :"+ super.nombre +" " + super.apellidoPaterno+ " "+ super.apellidoMaterno ;
    }
 
    
    
    
}
