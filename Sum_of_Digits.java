import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a digits");
        int  number=obj.nextInt();
        int remainder,sum=1;
        while(number>10){
            remainder=number%10;
            sum+= remainder;
            number /=10;
        }
        System.out.println("Sum of the digits "+ sum);
    }
    
}
