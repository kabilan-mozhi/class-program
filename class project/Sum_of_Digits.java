import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the digits :");
        int  number=obj.nextInt();
        int reminder,sum=0;
        while(number>0){
           reminder=number%10;
           sum+=reminder;
            number/=10;

        }
        System.out.println("Sum of the digie:"+sum);
    }
    
}
