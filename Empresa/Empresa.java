
package empresa;

public class Empresa {

    public static void main(String[] args) {
        Empleado emp1 = new Gerente("Ana Martinez", 101, 25000.0, 5000.0);
        Empleado emp2 = new Contador("Carlos Sanchez", 102, 18000.0, "Fiscal");
        Empleado emp3 = new Vendedor("Sofia Ruiz", 103, 12000.0, 3500.0);

        Empleado[] listaEmpleados = {emp1, emp2, emp3};

        System.out.println("\t\t\t Empleados\n\n");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
            System.out.println("\n\n");
        }
    }
    
}
