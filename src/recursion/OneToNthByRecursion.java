
package recursion;


public class OneToNthByRecursion {
    
    private static void printNumbers(int n){
        if(n==0){
            return;
        }else{
            printNumbers(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
