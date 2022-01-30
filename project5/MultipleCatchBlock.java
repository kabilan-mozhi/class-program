import java.util.Scanner;
public class MultipleCatchBlock {  
  
    public static void main(String[] args) {  
    char choice;
	int a[]=new int[5];
	String s=null;
	System.out.println("Enter choice");
	System.out.println("1-for Arithmetic Exception");
    System.out.println("2 - for ArrayIndexOutOfBounds Exception"); 
	System.out.println("3 - for Parent Exception");
	Scanner input = new Scanner(System.in);  
	choice = input.next().charAt(0);
           try{   
		switch(choice)
		{
		case '1': 
                a[5]=30/0; 
		break; 

                case '2':
		System.out.println(a[10]);  
		break;

		case '3':
		  
                System.out.println(s.length()); 
		break;
 
		default    : System.out.println("Give the choice 1 to 3");
		} 
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  



