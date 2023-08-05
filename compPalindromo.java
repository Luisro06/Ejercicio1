public class compPalindromo {
    public String word;
    private int size;
    private int position;
    

    // aquí termina la declaración de atributos

    public boolean palindromo (String word, int size, int position) {
        size = word.length();
        char ultimaletra = word.charAt(word.length()-1);

        if(word[0] == word[-1]) { 
            return True;
        }
        else {
            return False;
        }
    
    }
}


