//package Loops;
//Write a Java Program that calculates the sum of the digits of a given number using a loop
//Example: number : 16568
//Sum of digits : 1+6+5+6+8=26
public class Main11 {
    public static void main(String[] args) {
        Main11 main11 = new Main11();
        main11.sumDigits(16568);
        main11.sumDigits(1234);

    }

    public void sumDigits(int number) {

        int sumDigits = 0;
        
        //Loop until the number becomes 0
        while ( number > 0) {
            sumDigits += number % 10; //Add the last digit to sum
            number /=10; //Remove the last digit
        }

        System.out.println("Sum of digits: " + sumDigits);
    }
}
