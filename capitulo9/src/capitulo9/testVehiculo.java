package capitulo9;

public class testVehiculo {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo(2,180,500);
		Vehiculo v2 = new Vehiculo(4,200,1000);
		Vehiculo v3 = new Vehiculo();
		
		v1.informe();
		v2.informe();
		
		System.out.println("Numero de ruedas: " + v1.getNumRuedas());
		
		v1.setVelMax(200);
		v1.setNumRuedas(4);
		v1.setPeso(1000);

		System.out.println("Velocidad maxima: " + v1.getVelMax());
		
		v1.informe();
		
		if(v1.esIgual(v2)){
			System.out.println("Son iguales!");
		}else
			System.out.println("Son distintos!");
		
		v3.informe();
		
		v1.copia(v3);
		
		v3.informe();
		
		v1.informe();
		
		v1.copia2(v3);
		
		v1.informe();
	}

}
