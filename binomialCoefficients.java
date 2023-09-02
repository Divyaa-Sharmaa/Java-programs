// package Java-programs;

import java.util.Scanner;

public class binomialCoefficients {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int bioCoeff = binomialCoeff(num1,num2);
        System.out.println("binomial Coefficient of " + num1+ " and " + num2 + " is: " + bioCoeff);
    }

    public static int binomialCoeff(int a, int b){
        int a_fact = fact(a);
        int b_fact = fact(b);
        int ab_fact = fact(a-b);
        int bi_coefficient = a_fact/(b_fact* ab_fact);
        return bi_coefficient;
    }

    public static int fact(int a){
        int f = 1;
        for(int i=a;i>=1;i--){
            f = f*i;
        }
        return f;
    }
}
