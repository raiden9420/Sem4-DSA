public class arraymax {
    public static void func(int[] arr, int i, int max ){
        if(i>=arr.length) System.out.println(max);
        if(arr[i]>max){
            max=arr[i];
        }
        func(arr, i+1, max);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2};
        int max = 0;
        func(arr, 0,max);
        
    }
}
