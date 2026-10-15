
package empresa;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, int id, double salarioBase, double comision) {
        super(nombre, id, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.comision;
    }

    @Override
    public String toString() {
        return "[Vendedor] " + super.toString() + " - Comision: $" + comision + " - Salario Total: $" + calcularSalario();
    }
}
