public class test {
    public static void main(String[] args) {
        int sum = 0;
        int mult=1;
        int n = 234;
        int newn = n;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        while(newn>0){
            mult*=newn%10;
            newn/=10;
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + mult);
        System.out.println(mult-sum);

    }
}
