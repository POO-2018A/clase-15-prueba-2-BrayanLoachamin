
package informacionestudiantes;

/**
 *
 * @author ESFOT
 */
public class Materias {
    
    private String nombre;
    private int nivel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materias{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }

    public Materias(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
}
