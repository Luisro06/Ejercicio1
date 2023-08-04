import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileManagement {

public List<String> lista = new ArrayList<>();

public void dataPalabras(List<String> palabras, String palabra) {
	palabras.add(palabra);
}

public List<String> readFile_CSV() {
		Scanner sc;
		try {
			sc = new Scanner(new File("C:\\Users\\andre\\Downloads\\Palindromo\\Palindromos.csv"));
			sc.useDelimiter(",");  
			while (sc.hasNext()) {
				String elemento = sc.next();
				
				dataPalabras(lista, elemento);
			}   
			sc.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return lista;
}

}