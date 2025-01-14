public class secondmax {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1};
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){ 
                secondmax = max;
                max = arr[i];

            }
        }System.out.println("Second max is: " + secondmax);
    }
}