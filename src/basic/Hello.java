
package basic;


public class Hello {
    
    public int sum(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        
        Hello Bd = new Hello();
        
        int result= Bd.sum(10, 20);
        System.out.println(result);
        
    }
}
