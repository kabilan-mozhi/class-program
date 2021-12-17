import java.util.Scanner;
public class Prime_number{
   public static void main(String[] args){
       Scanner k=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=k.nextInt();
       boolean condition=false;
       for(int i=2;i<=num/2;i++){
           if(num%2==0){
               condition =true;
               break;

           }
       }
       if (! condition){
           System.out.println(num+"is a prime number");
       }else{
           System.out.println(num+ "is not a prime number");
       }
    
    
    
    
    
    }
}
