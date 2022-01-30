import java.util.Scanner;

class if_statement{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number");
        int  num=a.nextInt();
        if(num>20){
            System.out.println(num+""+"is greater than 20");
        }else{
            System.out.println(num+""+"is lesser than 20");
        }
    }
}