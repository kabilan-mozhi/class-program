import java.util.Scanner;

public class len_of_Array {
    public static void main(String[] args) {
    int a,b,c,d;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        a=s.nextInt();
        System.out.println("Enter the colum:");
        b=s.nextInt();
        int[][]first=new int[a][b];
        int[][]second=new int[a][b];
        int[][]sum=new int[a][b];
        System.out.println("Enter the element of first matrix:");
        for(c=0;c<a;c++)
        for(d=0;d<b;d++){
            first[c][d]=s.nextInt();

        }
        System.out.println("Enter the element of second matrix:");
        for(c=0;c<a;c++)
        for(d=0;d<b;d++){
            second[c][d]=s.nextInt();

        }
        System.out.println("Enter the element of sum matrix:");
        for(c=0;c<a;c++)
        for(d=0;d<b;d++){
            sum[c][d]=first[c][d]+second[c][d];

        }
        System.out.println("the isum of two matrix");
        for(c=0;c<a;c++)
        for(d=0;d<b;d++){
            System.out.println(sum[c][d]+"\t");
            System.out.println();

        }
       

    }
    
}
