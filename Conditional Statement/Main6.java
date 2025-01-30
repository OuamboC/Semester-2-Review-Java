public class Main6 {
    public static void main(String [] args){
        Main6 instance = new Main6();
        instance.determineGrade(100);
        instance.determineGrade(90);
        instance.determineGrade(82);
        instance.determineGrade(75);
        instance.determineGrade(62);
        instance.determineGrade(59);
        instance.determineGrade(-5);
        
    }
    //Deteremines the grade of a student based on their score 
    public void determineGrade(int score){
        if ( score >= 90 && score <= 100){
            System.out.println("A");
        }else if ( score >= 80 && score <= 89){
            System.out.println("B");

        }else if ( score >= 70 && score <= 79){
            System.out.println("C");

        }else if (score >= 60 && score <= 69){
            System.out.println("D");

        }else if (score >= 0 && score <= 59){
            System.out.println("F");
        }else {
            System.out.println("Invalid Score");
        }
    }
    
}
