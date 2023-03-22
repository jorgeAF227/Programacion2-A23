
package mx.uamex.dto;

/**
 *
 * @author jorge
 */
public class Alumno extends Persona{
    private int id;
    private int numeroCuenta;

   
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     *
     * @param numeroCuenta
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Alumno: " + "id: " + id + ", numeroCuenta: " + numeroCuenta +", nombre: " +super.nombre+", apellido Paterno: " +super.apellidoPaterno+", apellido Materno: " +super.apellidoMaterno+", genero: " +super.genero ;
    }

    

  
    }

   

   
    


