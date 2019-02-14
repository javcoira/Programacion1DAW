package argumentosVariables;

/*no se puede hacer con el caso vacio porque sera ambiguo ya que mayor
 * puede tener int o float y no sabe cual es el que queremos
 */
public class calcula {
	//siempre debera tener como minimo un valor num, ya que mayor tambien hay de float
	static int mayor(int... num) {
		int  mayor=0;
		
		mayor=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>mayor)
				mayor=num[i];
			}
		return mayor;
	}
	
	static float mayor(float... num) {
		float  mayor=0;
		
		mayor=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>mayor)
				mayor=num[i];
			}
		return mayor;
	}
	
	static String mayor(String... cadena) {
		int mayor=cadena[0].length();
		String valor = cadena[0];
		
		for(int i=1;i<cadena.length;i++) {
			if(cadena[i].length()>mayor) {
				mayor=cadena[i].length();
				valor=cadena[i];
			}
		}
		return valor;
	}

}
