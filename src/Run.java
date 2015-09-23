import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Run {
	public static void main (String[] args)
	{
		// Archivos conjunto de datos con nombre y extension.
			// texto.
			// binarios.
		File f = new File("archivo.txt");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Kenneth Vittetoe ,7000 ,0.3\n");
			fw.write("David velasquez ,8000 ,0.3\n");
			fw.write("fernando Benitez ,5000 ,0.3\n");
			fw.write("Axel Rose ,54000 ,0.2\n");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
