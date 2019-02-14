package adicional;

public class Obra {
	private String titulo;
	private String autor;
	public Obra(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		System.out.println("constructor Obra");
	}
	
	public Obra(String titulo) {
		this.titulo = titulo;
		this.autor = "Anonimo";
		System.out.println("constructor Obra");
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Obra() {
		System.out.println("constructor Obra");
	}
	@Override
	public String toString() {
		return "Obra [titulo=" + titulo + ", autor=" + autor + "]";
	}

}
