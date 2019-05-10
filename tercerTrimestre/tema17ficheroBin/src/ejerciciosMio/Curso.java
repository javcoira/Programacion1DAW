package ejerciciosMio;

import java.io.Serializable;

public class Curso implements Serializable{
	private String nombre;
	private double nota;
	
	public Curso(String nombre) {
		this.nombre = nombre;
		introduceNota();
	}
	
	public introduceNota() {
		Scanner
		do {
			nota
		}while(nota<0 || nota>10);
	}
}
