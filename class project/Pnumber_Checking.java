import java.util.Scanner;
class Pnumber_Checking{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        boolean Condition=false;
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                Condition=true;
                break;

            }
        }
        if(! Condition){
            System.out.println(num+""+"is a prime number");
        }  else{
            System.out.println(num+""+"is not a prime number");
        }
     }
      
       
}