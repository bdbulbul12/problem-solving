
package bubblrsort;

import java.util.Scanner;


public class Bubble {
    
    static void bubble_sort(int A[]){
        
        int i,j,temp;
        int n = A.length;
        
        for (i = 0; i <n; i++) {
            for ( j = 0; j < n-i-1; j++) {
                
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubble_sort(a);
        
        for(int i=0; i < a.length; i++){  
                System.out.print(a[i] + " ");  
            }  
        
        
    }
}
  