
package gcdlcm;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,reverse=0,rem;
        System.out.println("Enter a number to reverse");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        int temp=n;
        
        while(temp!=0){
            rem = temp%10;
            reverse = reverse*10+rem;
            temp=temp/10;
        }
        
        System.out.println("Reverse number is "+reverse);
    }
}
