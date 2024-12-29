package comunicacion;

public class Fabula extends Escrito {
	private String origen;
	private String titulo;
	private String autor;
	private int paginas;
	private String ensenanzas;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas = ensenanzas;
		this.interpretacion = interpretacion;
	}
	public String getEnsenanza() {
		return ensenanzas;
	}
	public void setEnsenanzas(String ensenanzas) {
		this.ensenanzas = ensenanzas;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 1;
		int palabras = paginas * factor;
		return palabras;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	@Override
	public String toString() {
		String texto = this.getOrigen() + "\n";
		texto += this.getTitulo() + "\n";
		texto += this.getAutor() + "\n";
		texto += this.getPaginas() + "\n";
		texto += this.getEnsenanza() + "\n";
		texto += this.interpretacion();
		return texto;
	}
	
}
