
package empresa;

public class Empleado {
    protected String nombre;
    protected int id;
    protected double salarioBase;

    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Nombre: " + nombre + " - Salario Base: $" + salarioBase;
    }
}
