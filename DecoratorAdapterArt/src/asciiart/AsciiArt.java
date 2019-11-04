package asciiart;

public abstract class AsciiArt {
	protected String[] lineas;
	
	public int getAncho() {
		return lineas[0].length();
	}
	
	public int getAlto() {
		return lineas.length;
	}
	
	public String[] getLineas() {
		return lineas;
	}
	
	public String[] dibuja() {
		return lineas;
	}
}
