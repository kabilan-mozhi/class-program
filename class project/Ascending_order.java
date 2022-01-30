import java.util.Arrays;
 public class Ascending_order {
    public static void main(String[] args) {
        int[]array=new int[]{9,5,6,7,2,3,1};

        System.out.println("Elements of array show is ascending order");
        for(int i:array){
            System.out.println(i);
        }
        Arrays.sort(array);
        System.out.println("Element of array sorted in Ascending order:");
        for(int i:array){
            System.out.println(i);
        }
    }
    
}
