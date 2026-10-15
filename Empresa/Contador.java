
package empresa;

public class Contador extends Empleado {
    private String especialidad;

    public Contador(String nombre, int id, double salarioBase, String especialidad) {
        super(nombre, id, salarioBase);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "[Contador] " + super.toString() + " - Especialidad: " + especialidad;
    }
}
