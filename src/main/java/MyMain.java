import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        // formula: m = (n + x/n) / 2 
        // guess = n, improvGuess = m, x=x
        double guess = 1.0;
        double improvGuess = 1.0;

        do{
            guess = improvGuess;
            improvGuess = (guess + (x/guess))/2 ;

        }while((guess-improvGuess > 0.00001)|| (guess-improvGuess < -0.00001));

        return improvGuess;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        if (x == 0){
            return 1;
        }
        int factorial = 1;
        for (int i=x; i > 1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        
        double e = 1.0;
        int i = 1;
        do{
            e = e + (1/factorial(i));
            i = i + 1;

        }while((Math.E - e > 0.00001)||(Math.E - e < -0.00001));


        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a positive double:");
        Double input = scan.nextDouble();
        System.out.println("The sqrt is approximately: "+babylonian(input));
        
        System.out.println("Please input a positive integer:");
        int number = scan.nextInt();
        System.out.println("The factorial is: "+ factorial(number));
        
        System.out.println("e: " + calculateE());


        scan.close();
    }
}
