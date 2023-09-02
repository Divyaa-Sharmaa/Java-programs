// package Java-programs;

import java.util.Scanner;

public class factorial {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
    int num1 = sc.nextInt();
    int fact = factorialOfNum(num1);
    System.out.println("factorial of " + num1 + " : " + fact);
    }

    public static int factorialOfNum(int a){
        int f = 1;
        for(int i=a;i>=1;i--){
            f = f*i;
        }
        return f;
    }
}
