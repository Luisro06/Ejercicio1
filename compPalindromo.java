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

