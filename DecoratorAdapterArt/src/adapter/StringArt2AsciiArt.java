package adapter;

import asciiart.AsciiArt;

public class StringArt2AsciiArt extends AsciiArt{
	
	public StringArt2AsciiArt(StringArt dibujo) {
		super();
		String[] misLineas = dibujo.Dibujo().split("\n");
		lineas = new String[misLineas.length];
		int ancho = 0;
		for (String linea : misLineas) {
			if (ancho < linea.length())
				ancho = linea.length();
		}
		
		for (int i = 0; i < misLineas.length; i++) {
			lineas[i] = "";
			lineas[i] += dibujo.Dibujo().split("\n")[i];
			while(lineas[i].length() < ancho) {
				lineas[i] += " ";
			}
		}
	}
}
