
package gcdlcm;

import java.util.Scanner;


public class GCDLCM {
    public static void main(String[] args) {
        int num1,num2,n1,n2,rem,gcd,lcm;
        System.out.println("Enter Two positive number");
        Scanner sc = new Scanner(System.in);
        
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        n1=num1;
        n2=num2;
        
        while(n2!=0){
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        
        gcd=n1;
        lcm=(num1*num2)/gcd;
        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }
}
