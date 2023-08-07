import java.util.List;

public class UI {
	
    public boolean palindromo;
    public String word;
    
    public void mostrarResultado() {
        fileManagement fm = new fileManagement();
        List<String> palabras = fm.readFile_CSV();

        data d = new data(palabras);
        d.iterList();
    }
    
    public void cerrar() {
        System.out.println("FIN PROGRAMA");
    }
    
    public void recibirCompPal(boolean palindromo, String word) {
        if (palindromo) {
            System.out.println("Palabra palíndromo encontrada: " + word);
        }
    }
    
    public static void main(String[] args) {
        UI ui = new UI();
        ui.mostrarResultado();
        ui.cerrar();
    }
}
