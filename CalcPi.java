// Computes an approximation of PI.
public class CalcPi 
{
    public static void main(String[] args) {
		
        int n = Integer.parseInt(args[0]);
        
        double seriesSum = 0.0;
        
        for (int i = 0; i < n; i++) {
            
            double denominator = 2.0 * i + 1.0;
            double term = 1.0 / denominator;
            
            if (i % 2 == 0) {
                seriesSum = seriesSum + term;
            } else {
                seriesSum = seriesSum - term;
            }
        }
        
        double piApproximated = seriesSum * 4.0;
        
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApproximated);
    }
}