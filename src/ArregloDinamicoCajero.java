
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
		if(indice < 0 || indice >= m_iSize)
		{
			throw new IndexOutOfBoundsException("indice fuera de rango: "+indice);
		}
		return m_pCajeros[indice];
	}
	
	 public Cajero RemoveCajero(int indice)
	 {
		 Cajero[] temp = new Cajero[m_pCajeros.length];
		 Cajero retval = m_pCajeros[indice];
		 
		 for (int i = 0, j = 0; i < m_pCajeros.length; i++ )
		 {
			 if(i == indice)
			 {
				 continue;
			 }
			 temp[j] =  m_pCajeros[i]; 
			 j++;
		 }
		 m_iSize = m_iSize - 1;
		 m_pCajeros = temp;
		 return retval;
	 }
	 public void Trim()
	 {
		 Cajero[] temp = new Cajero[getSize() + 1];
		 for(int i = 0; i < getSize(); i++)
		 {
			 temp[i] = getCajero(i);
		 }
		 m_pCajeros = temp;
	 }
	 
	 public int BuscarPorNombre(String nombre)
	 {
		 for (int i = 0; i< getSize(); i++)
		 {
			 if(nombre == m_pCajeros[i].m_szNombre)
			 {
				 return i;
			 }
		 }
		 return -1;
	 }
}
