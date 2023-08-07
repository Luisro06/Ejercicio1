import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileManagement {
	
	public List<String> readFile_CSV() {
		List<String> palabras = new ArrayList<>();
		
		try {
			Scanner sc = new Scanner(new File("Palindromos.csv"));
			sc.useDelimiter(",\\s*");
			
			while (sc.hasNext()) {
				String palabra = sc.next();
				palabras.add(palabra);
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR - Archivo CSV no encontrado");
		}
		
		return palabras;
	}
	
	public List<String> dataPalabras() {
		List<String> palabras = readFile_CSV();
		
		return palabras;
	}
	
}
