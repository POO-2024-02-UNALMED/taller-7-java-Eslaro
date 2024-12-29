package comunicacion;

public class Libro extends Escrito {
	private String origen;
	private String titulo;
	private String autor;
	private int paginas;
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	// los malditos gets y sets
	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String coautor) {
		this.co_autor = coautor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	// Los hermosos metodos
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 2;
		int palabras = paginas * factor;
		return palabras;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		return getOrigen() + "\n"+
		 getTitulo() + "\n"+
		 getAutor() + "\n"+
		 getPaginas() + "\n"+
		 getCo_autor() + "\n"+
		 getEditorial() + "\n"+
		 getEdicion();

	}
}
