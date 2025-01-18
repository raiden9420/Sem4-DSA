public class subsequence {
    public static void printSubsequences(String str,int idx, String ans) {
        if (idx==str.length()) {
            System.out.println(ans+"");
            return;
        }
        
        printSubsequences(str,idx+1,ans+str.charAt(idx));
        
        printSubsequences(str,idx+1,ans);
    }

    public static void main(String[] args) {
        String str = "abc"; 
        printSubsequences(str,0,"");
    }
}
