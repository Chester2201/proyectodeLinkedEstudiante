
package linkedlist;

/**
 *
 * @author esteban
 */
public class Estudiante 
{
    
    protected String idEstudiante;
    protected String nombre;
    protected String apellidopaterno;
    protected String apellidomaterno;
    protected String profesion;

public Estudiante ()
{
    
}
    

    public Estudiante(String idEstudiante, String nombre, String apellidopaterno, String apellidomaterno, String profesion) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.profesion = profesion;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
 
}
