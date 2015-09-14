
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
		
		
		//Ordenar de mayor a menor 
		
		for(int i =0; i<afoo.length;i++)
		{
			for(int j = 0; j< afoo.length; j++)
			{
				if(afoo[i].getX() >= afoo[j].getX())
				{
					Foo temp = afoo[i];
					afoo[i] = afoo[j];
					afoo[j] = temp;
				}
			}
		}
		

		for (Foo foo : afoo) {
			System.out.println(foo);
		}
		
	}


}
