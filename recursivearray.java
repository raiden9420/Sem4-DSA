class test1 {
    public static void func(int[] arr, int i){
        if(i>=arr.length) return;
        System.out.println(arr[i]);
        func(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        func(arr,0);
    }
    
}
