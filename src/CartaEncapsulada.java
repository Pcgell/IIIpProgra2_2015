
public class CartaEncapsulada {
	public final static int MANJAR_CORAZON = 0;
	public final static int MANJAR_DIAMANTE = 1;
	public final static int MANJAR_ESPADA = 2;
	public final static int MANJAR_TREBOL = 3;
	
	public final static int NUMERO_AS = 1;
	public final static int NUMERO_JOTA= 11;
	public final static int NUMERO_REINA= 12;
	public final static int NUMERO_REY= 13;
	
	private int m_iValorCarta;
	private int m_iManjarCarta;
	
	private CartaEncapsulada() {
		
	}
	public CartaEncapsulada(int _iValorCarta,int _iManjarCarta) {
		m_iManjarCarta = _iManjarCarta;
		m_iValorCarta = _iValorCarta;
	}
	
	public int getValorCarta()
	{
		return m_iValorCarta;
	}
	
	public int getManjarCarta()
	{
		return m_iManjarCarta;
	}
	
	@Override
	public String toString()
	{
		String szRetval = "";
		String szValor = "";
		String szManjar = "";
		
		switch (m_iValorCarta) {
		case CartaEncapsulada.NUMERO_AS:
			szValor = "As de ";
			break;
		case CartaEncapsulada.NUMERO_JOTA:
			szValor = "Jota de ";
			break;
		case CartaEncapsulada.NUMERO_REINA:
			szValor = "Reina de ";
			break;
		case CartaEncapsulada.NUMERO_REY:
			szValor = "Rey de ";
			break;
		default:
			szValor = ""+ m_iValorCarta +" de ";
			break;
		}
		
		switch (m_iManjarCarta) {
		case CartaEncapsulada.MANJAR_CORAZON:
			szManjar = "Corazon";
			break;
		case CartaEncapsulada.MANJAR_DIAMANTE:
			szManjar = "Diamante";
			break;
		case CartaEncapsulada.MANJAR_TREBOL:
			szManjar = "Trebol";
			break;
		case CartaEncapsulada.MANJAR_ESPADA:
			szManjar = "Espada";
			break;

		default:
			szManjar = " Error";
			break;
		}
		
		szRetval = szValor + szManjar;
		return szRetval;
	}
}
