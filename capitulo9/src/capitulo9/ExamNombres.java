package capitulo9;

public class ExamNombres {
	private String datos[];
	private int maximo; // numero maximo de elemento de tipo string de datos
	private int actual;
	
	public ExamNombres(int maximo){
		this.maximo = maximo;
		this.datos = new String[this.maximo];
		this.actual = 0;
	}
	
	public String[] getDatos() {
		return datos;
	}

	public int getActual() {
		return actual;
	}
	
	public void mostrarTodaLista(){
		System.out.println("todos los elementos de la lista actualmente:");
		for(int i=0;i<this.actual;i++){
			System.out.println(this.datos[i]);
		}
	}
	
	public int insertar(String nuevoNombre){
		int salida = 0;
		if(this.maximo == this.actual){
			salida = -1;
		}else{
			for(int i=0;i<this.actual;i++){
				if(this.datos[i].equals(nuevoNombre)){
					salida = 1;
					break;
				}
			}
			if(salida == 0){
				this.datos[this.actual] = nuevoNombre;
				this.actual++;
			}
		
		}
		switch (salida){
			case -1: 
				System.out.println("lista llena no inserta " + nuevoNombre);
				break;
			case 0: 
				System.out.println("se inserto "+ nuevoNombre);
				break;
			case 1: 
				System.out.println("no se inserto ya exisita " + nuevoNombre);
				break;
		}
		
		return salida;
	}
	
	public void vaciar(){
		for(int i=0;i<this.actual;i++){
			this.datos[i]="";
		}
		this.actual=0;
	}
	
	public String mostrar(int pos){
		String salida="Fuera de rango";
		if(pos>-1 && pos<this.actual){
			salida = this.datos[pos];
		}
		return salida;
	}
	
	public int numNombres(){
		return this.actual;
	}
	
	public int maxNombres(){
		return this.maximo;
	}
	
	public boolean estaLlena(){
		if(this.actual == this.maximo)
			return true;
		else
			return false;
	}
	
	public boolean eliminar(String nom){
		boolean eliminado = false;
		int desde=-1;
		for(int i=0;i<this.actual;i++){
			if(this.datos[i].equals(nom)){
				desde = i;
				break;
			}
		}
		if(desde!=-1){
			for(int i=desde;i<this.actual-1;i++){
				this.datos[i]=this.datos[i+1];
			}
			this.datos[this.actual-1]="";
			this.actual--;
			eliminado=true;
		}
		return eliminado;
	}
	
}
