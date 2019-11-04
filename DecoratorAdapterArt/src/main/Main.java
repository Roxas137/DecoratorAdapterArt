package main;

import java.util.ArrayList;
import java.util.List;

import asciiart.AsciiArt;
import asciiart.Cuadrado;
import asciiart.DuplicaHorizontal;
import asciiart.Marco;
import asciiart.Triangulo;

public class Main {

	public static void main(String[] args) {

		List<AsciiArt> cosas = new ArrayList<>();
		cosas.add(new Cuadrado(3, 'o'));
		cosas.add(new Triangulo(5, 't'));
		
		//Dibujo Simple
		System.out.println("Dibujo Simple:");
		for (AsciiArt cosa : cosas) {
			dibuja(cosa);
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
		
		//Dibujo Marco
		System.out.println("Dibujo Marco:");
		for (AsciiArt cosa : cosas) {
			dibuja(new Marco(cosa, '.'));
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
		
		//Dibujo DuplicaHorizontal
		System.out.println("Dibujo DuplicaHorizontal:");
		for (AsciiArt cosa : cosas) {
			dibuja(new DuplicaHorizontal(cosa));
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
		
		//Dibujo Duplica con marco
		System.out.println("Dibujo Duplica con marco:");
		for (AsciiArt cosa : cosas) {
			dibuja(new DuplicaHorizontal(new Marco(cosa, '.')));
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
		
		//Dibujo marco del duplicado
		System.out.println("Dibujo marco del duplicado:");
		for (AsciiArt cosa : cosas) {
			dibuja(new Marco(new DuplicaHorizontal(cosa), '.'));
			System.out.print("\n");
		}

	}
	
	public static void dibuja(AsciiArt cosa) {
		String[] dibujo = cosa.dibuja();
		for (String s : dibujo) {
			System.out.println(s);
		}
	}

}
