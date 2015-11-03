import java.util.ArrayList;
import java.util.Scanner;

// Poo
// Reutilizacion de codigo
// Simplifica la programacion escondiendo la complejidad con Interfaces limpias
// Definir problemas en terminos de objetos.


// Encapsulacion
		//Contencion
		//estratificacion
		//Composicion

// Herencia
		//Extencion
		//Derivacion

// Polymorfismo
		//Sobrescribir

// Objetos todos son clases

// Constructores 
	// por defecto
	// Conveniencia
	// Copia

// Patron de diseno
// Singleton 

public class Run {
	public static void main (String[] args)
	{
		Singleton s = Singleton.getInstance();
		System.out.println(s.getMensaje());
		
		FiguraGeometrica f1 = new Circulo();
		FiguraGeometrica f3 = new Rectangulo(new Cordenada(1, 1),new Cordenada(5, -1));
		FiguraGeometrica f4 = new Rectangulo(2,2,5,-1);
		
		s.getFiguras().add(f1);
		s.getFiguras().add(f3);
		s.getFiguras().add(f4);
		s.getFiguras().add(new Circulo());
		
		imprimirFiguras.ImprimirFiguras();
		
	}
}
