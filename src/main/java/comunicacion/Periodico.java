package comunicacion;

public class Periodico extends Escrito{
	private String origen;
	private String titulo;
	private String autor;
	private int paginas;
	private String fecha;
	private String premicia;
	private String interpretacion;
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha,String premicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.premicia = premicia;
		this.interpretacion = interpretacion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPremicia() {
		return premicia;
	}
	public void setPremicia(String premicia) {
		this.premicia = premicia;
	}
	@Override
	int palabrasTotales(int palabrasPagina) {
		int factor = 10;
		int palabras = paginas * factor;
		return palabras;
	}
	@Override
	String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		String texto = this.getOrigen() + "\n";
		texto += this.getTitulo() + "\n";
		texto += this.getAutor() + "\n";
		texto += this.getPaginas() + "\n";
		texto += this.getFecha() + "\n";
		texto += this.getPremicia() + "\n";
		texto += this.interpretacion() + "\n";
		return texto;
	}
	
	
}
