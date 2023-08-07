<<<<<<< HEAD

public class compPalindromo {
	
    private String word;
    private int size;
    private int position;

    public boolean palindromo(String word, int size, int position) {
        if (position >= size) {
            return true;
        } else if (word.charAt(position) == word.charAt(size - 1 - position)) {
            return palindromo(word, size, position + 1);
        } else {
            return false;
        }
    }
    
}
=======
public class CompPalindromo {
    public String word;
    private int size;
    private int position;
    // aquí termina la declaración de atributos

    // métodos:
    public boolean palindromo (String word) {
        size = word.length();
        boolean valido = false; 
        position = 0;
        int positionB = size;   //se le tuvo que agregar un atributo adicional al declarado por el otro grupo para poder comparar las letras e iterar a lo largo de la palabra

        while(position != positionB) {
            char primeraletra = word.charAt(position);
            char ultimaletra = word.charAt(positionB);
            if(ultimaletra == primeraletra) { 
            valido = true;
        }
            else {
                valido = false;
        }
        position++;
        positionB = positionB -1;
        }

        if(valido == true) {
            System.out.println("La palabra " + word + " sí es palíndroma." );
            return true;
        }
        else {
            System.out.println("La palabra " + word + " no es palíndroma." );
            return false;
        }
        
    }
}

>>>>>>> e0fbe2600375bce9fd4a6d4a6605575a4ad04fb8
