package comunicacion;

public  class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras(){
		int contador = 0;
		for(String letra : letras) {
			contador += 1;
		}
		return contador;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		String resultado = "";
	    for (int i = 0; i < letras.length; i++) {
	        resultado += letras[i];
	        if (i < letras.length - 1) { 
	            resultado += ", ";
	        }
	    }
	    return resultado;
	}
	
}
