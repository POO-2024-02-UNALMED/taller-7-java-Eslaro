package comunicacion;

public class Tesis extends Escrito {
	private String origen;
	private String titulo;
	private String autor;
	private int paginas;
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo,autor, paginas);	
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	// gets y sets :)
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	// HERMOSOS METODOS ABSTRACTOOOS
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 5;
		int palabras = paginas * factor;
		return palabras;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return getOrigen() + "\n" +
		 getTitulo() + "\n"+
		 getAutor() + "\n"+
		 getPaginas() + "\n"+
		 getIdea() + "\n"+
		 getArgumentos() + "\n"+
		 getConclusion() + "\n"+
		 getReferencias() ;
		
	}
}
