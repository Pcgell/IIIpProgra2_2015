
public abstract class FiguraGeometrica {
	private String m_szNombre;
	
	public abstract float getVolumen();
	public abstract float getArea();
	public abstract float getPerimetro();
	
	public String getNombre() {
		return m_szNombre;
	}
	public void setNombre(String _szNombre) {
		m_szNombre = _szNombre;
	}
	
	public String toString()
	{
		return super.toString()
			+"\nFigura		:"+getNombre()
			+"\nArea		:"+getArea()+
			"\nPerimetro	:"+getPerimetro()+
			"\nVolumen		:"+getVolumen();
	}
}
