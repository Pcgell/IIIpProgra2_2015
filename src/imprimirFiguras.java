
public class imprimirFiguras {
public static void ImprimirFiguras()
{
	Singleton x = Singleton.getInstance();
	
	for (FiguraGeometrica figura : x.getFiguras()) {
		System.out.println(figura);
		System.out.println();
	}
}
}
