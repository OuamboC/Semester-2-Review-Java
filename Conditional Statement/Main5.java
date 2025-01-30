public class Main5 {
    public static void main(String[] args) {
        Main5 instance = new Main5();
        instance.checkAge(20);
        instance.checkAge(2);
    }

    // check if a person is eligible to vote based on their age, ( The voting age is
    // 18 YEARS OR OLDER)
    public void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }

}


