import java.util.Scanner;
public class Amstrong_Number{
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("Enter a three digit number");
        int number=k.nextInt();
        int mynumber=number,remainder,result=0;
        while(mynumber !=0){
            remainder=mynumber %10;
            result+=Math.pow(remainder,3);
            mynumber /=10;
        }
        if(result==number){
            System.out.println(number + "  given number is amstrong number");
        }else {
            System.out.println(number + "given number is not amstrong number");
        }
    }
}
