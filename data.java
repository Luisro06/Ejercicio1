import java.util.List;

public class data {
	
	public List<String> dataPalabras;
	
    public data(List<String> dataPalabras) {
        this.dataPalabras = dataPalabras;
    }
	
	public void iterList() {
        for (String palabra : dataPalabras) {
            compPalindromo palindromoChecker = new compPalindromo();
            boolean resultado = palindromoChecker.palindromo(palabra, palabra.length(), 0);

            UI ui = new UI();
            ui.recibirCompPal(resultado, palabra);
        }
    }

    public void sendWord(boolean palindromo, String word) {
        UI ui = new UI();
        ui.recibirCompPal(palindromo, word);
    }
    
}
