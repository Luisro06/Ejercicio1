
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
