
public class ArregloDinamicoCajero {
	private Cajero[] m_pCajeros;
	private int m_iSize;
	
	
	public ArregloDinamicoCajero() {
		m_pCajeros = new Cajero[10];
		m_iSize = 0;
	}
	
	public void add(Cajero c)
	{
		m_pCajeros[m_iSize++] = c;
		if(m_pCajeros.length == m_iSize)
		{
			crecer();
		}
	}
	
	private void crecer() {
		Cajero[] temp = new Cajero[2*m_pCajeros.length];
		
		for(int i = 0; i < m_pCajeros.length; i++)
		{
			temp[i] = getCajero(i);
		}
		m_pCajeros = temp;
	}

	public int getSize()
	{
		return m_iSize;
	}
	
	public Cajero getCajero(int indice)
	{
		return m_pCajeros[indice];
	}
	
	// public Cajero RemoveCajero(int indice)
	// public void Trim();
}
