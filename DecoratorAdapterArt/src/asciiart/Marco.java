package asciiart;

public class Marco extends AsciiArtDecorator {

	private AsciiArt cosa;
	private char marco;
	
	public Marco(AsciiArt cosa, char marco) {
		this.cosa = cosa;
		this.marco = marco;
		this.lineas = new String[cosa.getAlto() + 2];
	}
	
	public String[] dibuja() {
		lineas[0] = "";
		cosa.dibuja();
		for (int i = 0; i<cosa.getAncho()+2; i++) {
			lineas[0] += this.marco;
		}
		
		int cont = 0;
		for (String linea : cosa.getLineas()) {
			cont++;
			lineas[cont] = marco+linea+marco;
		}
		
		lineas[cosa.getAlto()+1] = "";
		for (int i = 0; i<cosa.getAncho()+2; i++) {
			lineas[cosa.getAlto()+1] += this.marco;
		}
		
		return lineas;
	}

	@Override
	public int getAncho() {
		// TODO Auto-generated method stub
		return lineas[0].length();
	}

	@Override
	public int getAlto() {
		// TODO Auto-generated method stub
		return lineas.length;
	}

	@Override
	public String[] getLineas() {
		// TODO Auto-generated method stub
		return lineas;
	}
}
