public class Main12 {
    public static void main(String[] args) {
        Main12 main12 = new Main12();
        System.out.println(main12.reverseNumber(1234)); // Example call with number 1234
    }

    public int reverseNumber(int number) {
        int reversedNumber = 0;

        // Loop until the number becomes 0
        while (number != 0) {
            int lastDigit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        return reversedNumber;
    }
}
