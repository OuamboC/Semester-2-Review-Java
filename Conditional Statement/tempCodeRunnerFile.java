public class Main4 {
    public static void main (String [] args){
        Main4 instance = new Main4();
        instance.checkYear(2000);
        instance.checkYear(1900);
        instance.checkYear(2024);
    }
    //Check if year is a leap year or not 
    public void checkYear(int year){
        if( year % 4 == 0) {
            if ( year % 100 != 0|| year % 400 == 0 ){
                System.out.println(year + " is a leap year");
            }else {
                System.out.println(year + " is not a leap year");
            }
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}