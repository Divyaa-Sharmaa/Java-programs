// package Java-programs;
import java.util.Scanner;

public class functions {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int pr = productOfNum(num1,num2);
        System.out.println("product of " + num1 + " and " + num2 + " is: " + pr); 
    } 

    public static int productOfNum(int a, int b){
        int prod = a *b;
        return prod;
    }
}
    

