
public class Cordenada {
	private float m_fX;
	private float m_fY;
	private float m_fZ;
	
	public Cordenada(float _fX, float _fY)
	{
		m_fX = _fX;
		m_fY = _fY;
		m_fZ = 0.0f;
	}
	
	public Cordenada(float _fX, float _fY, float _fZ)
	{
		m_fX = _fX;
		m_fY = _fY;
		m_fZ = _fZ;
	}
	
	public float getX() {
		return m_fX;
	}
	public void setX(float _fX) {
		m_fX = _fX;
	}
	
	public float getY() {
		return m_fY;
	}
	public void setY(float _fY) {
		m_fY = _fY;
	}
	
	public float getZ() {
		return m_fZ;
	}
	public void setZ(float _fZ) {
		m_fZ = _fZ;
	}
	
	

}
