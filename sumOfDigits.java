import java.util.Scanner;

public class sumOfDigits {
public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int num = sc.nextInt();
        int sumOfNum = sumOfDigit(num);
        System.out.println(" Sum of digits are: " + sumOfNum);
    }
    
    public static  int sumOfDigit(int num){
        int sum = 0;
        while(num!=0){
           int r = num%10;
           sum = sum+r;
           num = num/10; 
        }
        return sum;
    }
}
