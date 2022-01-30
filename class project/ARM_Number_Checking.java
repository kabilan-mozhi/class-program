import java.util.Scanner;
public class ARM_Number_Checking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int number=s.nextInt();
        int My_number=number,reminder,result=0;
        while(My_number!=0){
            reminder=My_number%10;
            result+=Math.pow(reminder,3);
            My_number/=10;
        }
        if(result==number){
            System.out.println(number+""+"is an amstrong number");
        } 
    else{
        System.out.println(number+""+"is not Amstrong number");
    }   }
    
}
