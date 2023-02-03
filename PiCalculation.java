/*
    =====================================
    @project Algorithms
    @created 01/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

// Выше точность - точнее результат

public class PiCalculation {
    public static double calculate(int accuracy) {
        final double numerator = 4;
        double denominator = 1;
        double pi = 0;
        int operation = 1;
        for (int i = 0; i < accuracy; i++) {
            pi += operation * numerator / denominator;
            denominator += 2;
            operation *= -1;
        }
        return pi;
    }
}
