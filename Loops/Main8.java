// Write a Java program that calculates the sum of the first n natural numbers using a loop
//Natural Numbers are : 1...10
public class Main8 {
    public static void main(String[] args) {
        Main8 main8 = new Main8();
        main8.sumFirstNaturalNumbers();

    }

    public void sumFirstNaturalNumbers() {
        int sum = 0;
        for (int n = 1; n <= 10; n++) {
            sum += n;

        }
        System.out.println(sum);
    }

}
