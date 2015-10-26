import java.util.ArrayList;


public class Run {
	public static void main (String[] args)
	{
		Circulo f1 = new Circulo();
		Circulo f2 = new Circulo(31,new Cordenada(0, 0));
		Rectangulo f3 = new Rectangulo(new Cordenada(1, 1),new Cordenada(5, -1));
		Rectangulo f4 = new Rectangulo(2,2,5,-1);
		
		
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		
		figuras.add(f1);
		figuras.add(f2);
		figuras.add(f3);
		figuras.add(f4);
		figuras.add(new Circulo());
		
		
		for (FiguraGeometrica figuraGeometrica : figuras) {
			System.out.println(figuraGeometrica);
			System.out.println();
		}
		
		
	}
}
