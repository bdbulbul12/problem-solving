
package recursion;

public class PowerMethod {
    
     public static void main(String[] args) {
        int result= power(2, 5);
         System.out.println(result);
    }
    
    public  static int power(int baseNumer,int powerNumber){
        if(powerNumber==0){
            return 1;
        }else{
             return baseNumer*power(baseNumer, powerNumber-1);
        }
           
    }
    
   
}
