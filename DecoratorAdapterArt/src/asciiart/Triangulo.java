package asciiart;

public class Triangulo extends AsciiArt {
	
	public Triangulo(int longitud, char relleno) {
		lineas = new String[longitud];
		for (int i = 0; i<longitud; i++) {
			lineas[i] = "";
			for (int j=0; j<longitud; j++) {
				if (j<=i)
					lineas[i] += relleno;
				else
					lineas[i] += " ";
			}
		}
	}
}
