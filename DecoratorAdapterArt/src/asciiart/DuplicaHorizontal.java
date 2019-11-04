package asciiart;

public class DuplicaHorizontal extends AsciiArtDecorator {
	
	private AsciiArt cosa;
	
	public DuplicaHorizontal(AsciiArt cosa) {
		this.cosa = cosa;
		this.lineas = new String[cosa.getAlto()];
	}
	
	public String[] dibuja() {
		String linea;
		cosa.dibuja();
		for (int i = 0; i<cosa.getAlto(); i++) {
			linea = cosa.getLineas()[i];
			lineas[i]=linea+linea;
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
