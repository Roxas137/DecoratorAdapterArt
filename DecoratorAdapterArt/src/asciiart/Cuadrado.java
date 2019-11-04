package asciiart;

public class Cuadrado extends AsciiArt {

	public Cuadrado(int longitud, char relleno) {
		lineas = new String[longitud];
		for (int i = 0; i<longitud; i++) {
			lineas[i] = "";
			for (int j=0; j<longitud; j++) {
				lineas[i] += relleno;
			}
		}
	}
	
}
