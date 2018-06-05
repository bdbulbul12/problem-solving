
package recursion;

public class SumOfDigit {
    
    private  static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        return num%10+sumOfDigit(num/10);
    }
    
    public static void main(String[] args) {
        int result = sumOfDigit(120);
        System.out.println(result);
    }
}
