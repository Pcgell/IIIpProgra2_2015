
public class Foo {
	
	private int m_iX;
	
	public void setX(int iX)
	{
		this.m_iX = iX;
	}
	
	public int getX() {
		return this.m_iX;
	}
	
	private Foo() {
		m_iX = 3;
	}
	
	public Foo(int ValorDefecto)
	{
		this.setX(ValorDefecto);
	}
	@Override
	public String toString()
	{
		return this.getClass()+" V: "+m_iX;
	}
	
	
}
