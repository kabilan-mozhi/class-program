import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter a number:");
        int days=m.nextInt();
        switch(days){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thuesday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;


        }
    }
    
}
