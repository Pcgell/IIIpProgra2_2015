
public class Circulo extends FiguraGeometrica{
	private float m_fRadio;
	private Cordenada m_pCentro;
	
	public Circulo(float _fRadio, Cordenada _pCentro) {
		m_fRadio = _fRadio;
		m_pCentro = _pCentro;
		super.setNombre("Circulo");
	}
	
	public Circulo() {
		m_fRadio = 1.0f;
		m_pCentro = new Cordenada(0.0f, 0.0f);
		setNombre("Circulo unitario en el origen");
	}
	public float getRadio()
	{
		return m_fRadio;
	}
	public void setRadio(float _fRadio)
	{
		m_fRadio = _fRadio;
		setNombre("Circulo");
	}
	
	@Override
	public float getVolumen() {
		return 0.0f;
	}

	@Override
	public float getArea() {
		// 3.1416 * r * r
		return (float)Math.PI * m_fRadio * m_fRadio;
	}

	@Override
	public float getDiametro() {
		// 2 * 3.1416 * r
		return (float)Math.PI * 2 * m_fRadio;
	}

	public Cordenada getCentro() {
		return m_pCentro;
	}

	public void setCentro(Cordenada _pCentro) {
		m_pCentro = _pCentro;
		setNombre("Circulo");
	}
	
	
}
