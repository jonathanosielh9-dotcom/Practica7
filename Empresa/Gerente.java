package empresa;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.bono;
    }

    @Override
    public String toString() {
        return "[Gerente] " + super.toString() + " - Bono: $" + bono + " - Salario Total: $" + calcularSalario();
    }
}
