package adapter;

import java.util.*;

public class Rana extends StringArt {
	public String Dibujo() {
		List<String> rana = new ArrayList<String>();
		rana.add("       __   __");
		rana.add("      /  \\ /  \\");
		rana.add("     | @) | @) |");
		rana.add("    /           \\");
		rana.add("    \\ \\____  __//");
		rana.add("     \\_    ||  /");
		rana.add("___   /    ||  \\  ___");
		rana.add("\\   \\|     ()   |/  /");
		rana.add(" \\   |          |  /");
		rana.add("  \\   \\  \\  /  /  /");
		rana.add("  /   /   \\/   \\  \\");
		rana.add("  UUU  UUU  UUU UUU"); 
		
		String ranaString = "";
		for (String s : rana)
			ranaString += s + "\n";

		return ranaString;
	}
}