// Prints a crowd cheering output.
public class Cheers 
{
    public static void main(String[] args) {
        String wordInput = args[0].toUpperCase();
        
        int cheerCount = Integer.parseInt(args[1]);

        String AN_LETTERS = "AEFHILMNORSX";
        
        char[] letters = wordInput.toCharArray();
        int wordLength = letters.length;
        
        for (int i = 0; i < wordLength; i++) {
            char currentLetter = letters[i];
            
            String article;
            if (AN_LETTERS.indexOf(currentLetter) != -1) {
                article = "an";
            } else {
                article = "a";
            }
            
            System.out.println("Give me " + article + " " + currentLetter + ": " + currentLetter + "!");
        }
        
        System.out.println("What does that spell?");
        
        for (int i = 0; i < cheerCount; i++) {
            System.out.println(wordInput + "!!!");
        }
    }
}