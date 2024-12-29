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
	public String getPrimicia() {
		return premicia;
	}
	public void setPrimicia(String premicia) {
		this.premicia = premicia;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 10;
		int palabras = paginas * factor;
		return palabras;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		String texto = this.getOrigen() + "\n";
		texto += this.getTitulo() + "\n";
		texto += this.getAutor() + "\n";
		texto += this.getPaginas() + "\n";
		texto += this.getFecha() + "\n";
		texto += this.getPrimicia() + "\n";
		texto += this.interpretacion() + "\n";
		return texto;
	}
	
	
}
