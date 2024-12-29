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
		int total = palabrasPagina * this.getPaginas();
		int palabras = total * factor;
		return palabras;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return this.getOrigen() + "\n" +
		this.getTitulo() + "\n" +
		this.getAutor() + "\n"+
		this.getPaginas() + "\n"+
		this.getFecha() + "\n"+
	    this.getPrimicia();
		
	}
	
	
}
