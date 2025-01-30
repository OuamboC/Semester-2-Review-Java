public class Main3 {
    public static void main  (String [] args) {
        //Create an instance of this class 
        Main3 instance = new Main3();
        //print the results
        instance.checkNumber(5);
        instance.checkNumber(-230);
        instance.checkNumber(1000);

    }
    //Write a program that check if a number is positive , negative or zero 
    public void checkNumber(int n ) {
       if (n > 0){
        System.out.println("postive Number");
       }else if (n < 0){
        System.out.println("negative Number");
       }else {
        System.out.println("number is zero");
       }
    }
    
}
