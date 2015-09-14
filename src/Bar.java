
public class Bar extends Foo {
	private int m_iY;
	
	public void setY(int y)
	{
		this.m_iY = y;
	}
	
	public int getY()
	{
		return m_iY;
	}
	public Bar(int x ,int y) {
		super(x);
		setY(y);
	}
	
	@Override
	public String toString()
	{
		return this.getClass()+" x: "+getX()+" y:"+getY() ;
	}
}
