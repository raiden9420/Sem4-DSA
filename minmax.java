import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int j=0;j<n;j++){
            if(arr[j]<min){
                min = arr[j];
            }
            if(arr[j]>max){
                max =arr[j];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

    }
} 