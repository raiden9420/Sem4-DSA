class recursivearrayreverse {
    public static void func(int[] arr, int i){
        if(i>=arr.length) return;
        func(arr,i+1);
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        func(arr,0);
    }
    
}
