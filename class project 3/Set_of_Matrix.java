public class Set_of_Matrix {
    public static void main(String[] args) {
        int sum,i,j,k;
        int m1[][]={{1,2,3},{4,5,6}};
        int m2[][]={{7,8},{9,10},{11,12}};
        int r[][]=new int[2][2];
        for(i=0;i<2;i++){
            for( j=0;i<2;i++){
                for( k=0;k<3;k++){
                  sum=m1[i][k]*m2[k][j];
                }
                sum=0;
                r[i][j]=sum;
                
                


            }
        }
        
        for(i=0;i<2;i++);{
            for( j=0;j<2;j++){
                System.out.println(r[i][j]+" ");

            }
            System.out.println();
        }
    }
    
}
