package Ejer1;

import java.util.Arrays;

public class Programador extends Empleado{

		private String[] lenguajes;
		
		/* cualquiera de los 2 constructores es correcto pero uno hace una copia y otro solo apunta al ya creado */
		
		/* este es un puntero a donde se crea el string[] */
		/*public Programador(String nombre, String telefono, String... lenguajes) {
			super(nombre, telefono);
			this.lenguajes = lenguajes;
		}*/
		
		/* este copia uno a uno los Strings del array pasado y ya no apunta al anterior */
		public Programador(String nombre, String telefono, String... lenguajes) {
			super(nombre, telefono);
			this.lenguajes = new String[lenguajes.length];
			for(int i=0; i<lenguajes.length;i++) {
				this.lenguajes[i]=lenguajes[i];
			}
		}
		
		/* cualquiera de los 2 getLenguajes seria valido */
		/*public String[] getLenguajes() {
			return lenguajes;
		}*/
		
		public String[] getLenguajes() {
			String array[] = new String [this.lenguajes.length];
			for(int i=0; i<this.lenguajes.length;i++) {
				array[i] = this.lenguajes[i];
			}
			return array;
		}

		public void setLenguajes(String[] lenguajes) {
			this.lenguajes = lenguajes;
		}

		@Override
		public String toString() {
			return super.toString() + "Programador [lenguajes=" + Arrays.toString(lenguajes) + "]";
		}
		
		
}
