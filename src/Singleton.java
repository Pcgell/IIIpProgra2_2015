import java.util.ArrayList;

import javax.print.attribute.standard.Finishings;


public class Singleton {
	
	// patron de diseño singleton
	//Lazy instanciation
	private static Singleton m_pInstance;
	private Singleton(){
		setMensaje("Mensaje secreto compartido");
	}
	public static Singleton getInstance()
	{
		if(m_pInstance == null)
			m_pInstance = new Singleton();
		return m_pInstance ;
	}

	// mensaje encapsulado en el patron.
	private ArrayList<FiguraGeometrica> m_pfiguras;
	private String m_szMensaje;
	public String getMensaje() {
		m_pfiguras = new ArrayList<FiguraGeometrica>();
		return m_szMensaje;
	}

	public void setMensaje(String m_szMensaje) {
		this.m_szMensaje = m_szMensaje;
	}
	public ArrayList<FiguraGeometrica> getFiguras() {
		return m_pfiguras;
	}
	
	
	
}
