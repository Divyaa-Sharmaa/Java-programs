import java.util.Scanner;

public class Average {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double av = aveargeOfNum(num1,num2,num3);
        System.out.println("Average of " + num1 + ", " + num2 + ", " + num3 + " is: " + av); 
    } 

    public static double aveargeOfNum(double a, double b, double c){
        return (a+b+c)/3 ;
    }
    
}
