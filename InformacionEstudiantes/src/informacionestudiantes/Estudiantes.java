
package informacionestudiantes;

/**
 *
 * @author ESFOT
 */
public class Estudiantes {
    
    private String nombre;
    private int edad;
    Materias materias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
        
        
    }

    public Estudiantes(String nombre, int edad, Materias materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", materias=" + materias + '}';
    }
        
    
}