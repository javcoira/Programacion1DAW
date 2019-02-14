package hoja7;

public class foreachNotaMedia {

	public static void main(String[] args) {
		double notas[][]={{5,7,6.0},{4,5,4,7,5},{10,6}};
		double notaMediaAlumno[] = new double[notas.length];
		double notaMediaTotal=0;
		double variableParaForEach = 0;
		/*for(int al=0;al<notas.length;al++){
			for(int nta=0;nta<notas[al].length;nta++){
				notaMediaAlumno[al]+=notas[al][nta];
			}
			notaMediaAlumno[al]/=notas[al].length;
			System.out.println("la nota media del alumno " + al + " es " + notaMediaAlumno[al]);
			notaMediaTotal+=notaMediaAlumno[al];
		}
		notaMediaTotal/=notas.length;
		System.out.println("la nota media global es " + notaMediaTotal);*/
		
		int al=0;
		for(double alumno[]:notas){
			for(double nta:alumno){
				variableParaForEach+=nta;
			}
			variableParaForEach/=notas[al].length;
			notaMediaAlumno[al]=variableParaForEach;
			notaMediaTotal+=notaMediaAlumno[al];
			al++;
		}
		System.out.println(" la nota media global es " + (notaMediaTotal/notas.length));
	}

}
