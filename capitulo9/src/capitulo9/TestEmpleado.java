package capitulo9;

import java.util.logging.Logger;

public class TestEmpleado {

	public static void main(String[] args) {
		System.out.println("numero empleados: " + Empleado.getNumEmpleados());
		Empleado emp1 = new Empleado("Pepe", "23434234");
		Empleado emp2 = new Empleado("Raul", "4234234");
		System.out.println("numero empleados: " + Empleado.getNumEmpleados());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println("objeto " + emp1.getNumEmpleados());
		System.out.println("clase " + Empleado.getNumEmpleados());

	}

}
