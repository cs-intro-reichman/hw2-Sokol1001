// Demonstrates the Collatz conjecture.
public class Collatz 
{
    public static void main(String[] args) {

        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        int currentSeed = 1;
        while (currentSeed <= maxSeed) {
            
            long currentNumber = currentSeed;
            int stepCount = 0;
            String sequenceOutput = "";

            if (mode.equals("v")) {
                sequenceOutput = sequenceOutput + currentNumber;
            }

            while (currentNumber != 1) {
                
                if (currentNumber % 2 == 0) {
                    currentNumber = currentNumber / 2;
                } else {
                    currentNumber = currentNumber * 3 + 1;
                }
                
                stepCount = stepCount + 1;

                if (mode.equals("v")) {
                    sequenceOutput = sequenceOutput + " " + currentNumber;
                }
            }

            if (mode.equals("v")) {
                System.out.println(sequenceOutput + " (" + stepCount + ")");
            }
            
            currentSeed = currentSeed + 1;
        }

        System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
    }
}