
public class Rectangulo extends FiguraGeometrica {
	private Cordenada m_pSI;
	private Cordenada m_pID;
	
	
	private Rectangulo(){}
	
	public Rectangulo(Cordenada _pSI, Cordenada _pID)
	{
		m_pID = _pID;
		m_pSI = _pSI;
		setNombre("Rectangulo");
	}
	
	public Rectangulo( float _fC1X,float _fC1Y, float _fC2X, float _fC2Y)
	{
		Cordenada pSI = new Cordenada(_fC1X, _fC1Y);
		Cordenada pID = new Cordenada(_fC2X, _fC2Y);
		m_pID = pID;
		m_pSI = pSI;
		setNombre("Rectangulo");
	}
	@Override
	public float getVolumen() {
		return 0;
	}

	@Override
	public float getArea() {
		float fBase = m_pID.getX() - m_pSI.getX();
		float fAltura = m_pSI.getY() - m_pID.getY();
		return fBase * fAltura;
	}

	@Override
	public float getPerimetro() {
		float fBase = m_pID.getX() - m_pSI.getX();
		float fAltura = m_pSI.getY() - m_pID.getY();
		return 2 * (fBase + fAltura);
	}

	public Cordenada getSI() {
		return m_pSI;
	}

	public void setSI(Cordenada m_pSI) {
		this.m_pSI = m_pSI;
	}

	public Cordenada getID() {
		return m_pID;
	}

	public void setID(Cordenada m_pID) {
		this.m_pID = m_pID;
	}

}
