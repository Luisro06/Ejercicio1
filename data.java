import java.util.List;

public class Data {
	public void iterList(List<String> dataPalabras) {
        CompPalindromo compPalindromo = new CompPalindromo();
        
        for (String palabra : dataPalabras) {
            compPalindromo.sendWord(palabra);
        }
    }
}
