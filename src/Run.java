import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Run {
	public static void main (String[] args)
	{
		// Archivos conjunto de datos con nombre y extension.
			// texto.
			// binarios.
		File f = new File("archivo.txt");
		ArrayList<Cajero> arreglo = new ArrayList<Cajero>();
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			//linea a leer del BufferdReader
			String line = null;
			//mientras hay lineas que leer. lee linea.
			while ((line = br.readLine()) != null)
			{
				// partiendo por la coma
				String[] partes = line.split(",");
				Cajero c = new Cajero();
				c.m_szNombre = partes[0];
				c.m_fSalario = Float.parseFloat(partes[1]);
				c.m_fComision = Float.parseFloat(partes[2]);
				arreglo.add(c);
			}
			// cerramos de forma inversa los objetos creados.
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Cajero cajero : arreglo) {
			System.out.println(cajero);
		}
	}
}
