import java.util.*;
public class Reverse{
    public class swapping(int first, int end){
        int temp = first;
        first = end;
        end = temp;
    }
    public class reverse {
        public static int[] reverse(int arr[]){
            int start = 0;
            int end = arr.length - 1;
    
            while(start<= end){
                swapping(arr[start],arr[end]);
                start++;
                end--;
                return arr;
            }
        }
        public static void main(String[] args) {
    
            int arr[] = {1, 2, 3, 4, 5};
            int [] reversedArray = reverse(arr);
            for( int i: reversedArray){
                System.out.println(i);
            }
            
            
        }
    }
}

