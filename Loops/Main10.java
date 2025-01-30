//package Loops;
//Write a java program that calculates the factorial of a given number using a loop
//Factorial of a number  : n! = n* (n-1)* (n-2)* ....1  => n*(n-1)!
//Example : 10! = 10 * 9*8*7*6*5*4*3*2*1
public class Main10 {
    public static void main(String[] args) {

        Main10 main10 = new Main10();
        main10.factorialNumber(10);

    }

    public void factorialNumber(int number) {
        int factorialNumber = 1;
        for (int f = number; f >= 1; f--) {
            factorialNumber *= f;
        }
        System.out.println(factorialNumber);

    }

}
