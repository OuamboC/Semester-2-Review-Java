//Write a Java program that prints all even numbers from 1 to 20 using a loop
//Even numbers : Numbers divisible by 2
public class Main9 {
    public static void main(String[] args) {
        Main9 main9 = new Main9();
        main9.EvenNumber();
    }

    public void EvenNumber() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
