package hoja7;

public class PruebaClaseRectangulo {

		int base;
		int altura;
		char relleno;
		
		PruebaClaseRectangulo(int base, int altura, char relleno){
			this.base = base;
			this.altura = altura;
			this.relleno = relleno;
		}
		
		void dibuja(){
			for(int fila=0;fila<altura;fila++){
				for(int col=0;col<base;col++){
					System.out.print(relleno);
				}
				System.out.println();
			}
		}
		
		int area(){
			return base*altura;
		}

}
