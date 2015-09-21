

abstract class CartaAbstracta {
	public static final int NUMERO_AS = 1;
	public static final int NUMERO_JOTA = 11;
	public static final int NUMERO_REYNA = 12;
	public static final int NUMERO_REY = 13;
	
	private int m_iValor;
	
	private CartaAbstracta() {
		// TODO Auto-generated constructor stub
	}
	
	public String getValor()
	{
		String szRetval = "";
		switch (m_iValor) {
		case NUMERO_AS:
			szRetval = "As de ";
			break;
		case NUMERO_JOTA:
			szRetval = "Jota de ";
			break;
		case NUMERO_REYNA:
			szRetval = "Reyna de ";
			break;
		case NUMERO_REY:
			szRetval = "Rey de ";
			break;
		default:
			szRetval = ""+ m_iValor +" de ";
			break;
		}
		return szRetval;
	}
	public CartaAbstracta(int _iValor)
	{
		if(_iValor <= 0 || _iValor > 13)
			throw new IllegalArgumentException("No se puede tener cartas de mayores a 13 y menores a 1");
		m_iValor = _iValor;
	}
}
