public class powerOfTwo {
    public static boolean power(int n,int x){
        if(x<0) return false;
        if(Math.pow(2,x)==n)return true;
        return power(n,x-1);
    }
    public static void main(String[] args){ {
        int x = 30;
        int n = 1;
        power(n,x);
    }
}

