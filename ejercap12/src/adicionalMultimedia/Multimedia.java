package adicionalMultimedia;

public class Multimedia {
	private String titulo;
	private String autor;
	private Formato formato;
	private double duracion;
	
	public Multimedia(String titulo, String autor, Formato formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	public Formato getFormato() {
		return this.formato;
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

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Multimedia [titulo = " + titulo + ", autor = " + autor + ", formato = " + formato + ", duracion = " + duracion
				+ "]";
	}
	
	public boolean equals(Multimedia multi) {
		return this.titulo.equals(multi.getTitulo()) && this.autor.equals(multi.getAutor());
	}
	
}
