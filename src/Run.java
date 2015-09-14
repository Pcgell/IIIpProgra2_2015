
public class Run {
	public static void main (String[] args)
	{
		int a;
		Foo f;
		f = new Foo(5);
		
		System.out.println(f);
		f.setX(10);
		System.out.println(f.getX());
		
		Foo afoo[] = new Foo[f.getX()];
		
		for (int i = 0; i < afoo.length; i++) {
			afoo[i] = new Foo(i+1);
		}
		
		
		//Invertir
		Foo[] temp = new Foo[afoo.length];
		int ultimo = afoo.length -1;
		for(int i =0; i<afoo.length;i++)
		{
			temp[ultimo - i] = afoo[i];
		}
		
		afoo = temp;
		

		for (Foo foo : afoo) {
			System.out.println(foo);
		}
		
	}


}
