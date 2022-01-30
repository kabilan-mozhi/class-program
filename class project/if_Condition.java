import java.util.Scanner;

public class if_Condition {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=obj.nextInt();
        if(num>40){
            System.out.println(num+""+"greater than 40");

        }
        else{
            System.out.println(num+""+"is less than 40");
        }
        
    }
    
}
