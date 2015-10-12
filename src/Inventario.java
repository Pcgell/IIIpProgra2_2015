import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Inventario {
	private Map m_Frutas;
	private Scanner m_SC;
	
	private void loadFrutas()
	{
		File archivo =  new File("frutas.txt");
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = null;
			while(null != (linea = br.readLine()))
			{
				String[] partes = linea.split(",");
				Fruta f = new Fruta();
				f.nombre = partes[0];
				f.cantidad = Integer.parseInt(partes[1]);
				m_Frutas.put(f.nombre, f);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void saveFrutas()
	{
		File archivo = new File("frutas.txt");
		try {
			FileWriter fw = new FileWriter(archivo);
			for (Iterator iterator = m_Frutas.values().iterator(); iterator.hasNext();) {
				Fruta type = (Fruta) iterator.next();
				fw.write(type.toString());
			}
			fw.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void aggregarFruta(String nombre, int cantidad)
	{
		Fruta p = (Fruta) m_Frutas.get(nombre);
		if(p == null)
		{
			p = new Fruta();
			p.nombre = nombre;
			p.cantidad = cantidad;
			m_Frutas.put(nombre, p);
		}else
		{
			p.cantidad += cantidad;
		}
	}
	
	public void removerFrutas(String nombre, int cantidad)
	{
		Fruta p = (Fruta) m_Frutas.get(nombre);
		if(p == null)
		{
			System.out.println("fruta no existe");
		}else
		{
			p.cantidad -= cantidad;
			if(p.cantidad<0)
			{
				p.cantidad = 0;
			}
		}
	}
	public void init()
	{
		m_SC = new Scanner(System.in);
		m_Frutas = new HashMap();
		loadFrutas();
	}
	public boolean presentarMenu()
	{
		System.out.println("Bien venido.");
		System.out.println("1. Agregar Frutas.");
		System.out.println("2. remover Frutas.");
		System.out.println("3. ver Frutas.");
		System.out.println("4. salir.");
		
		int opcion = m_SC.nextInt();
		String nombre;
		int cantidad;
		
		switch (opcion) {
		case 1:
			System.out.println();
			System.out.println("Ingrese nombre luego cantidad a agregar");
				nombre = m_SC.next();
				cantidad = m_SC.nextInt();
				aggregarFruta(nombre, cantidad);
			break;
		case 2:
			System.out.println();
			System.out.println("Ingrese nombre luego cantidad a remover");
				nombre = m_SC.next();
				cantidad = m_SC.nextInt();
				removerFrutas(nombre, cantidad);
			break;
		case 3:
			System.out.println();
			for (Iterator iterator = m_Frutas.values().iterator(); iterator.hasNext();) {
				Fruta type = (Fruta) iterator.next();
				System.out.println(type.nombre + ": "+ type.cantidad);
			}
			break;
		case 4:
		default:
			return false;
		}
		return true;
	}
	
	public void finish()
	{
		saveFrutas();
		m_Frutas = null;
		m_SC.close();
	}

}
