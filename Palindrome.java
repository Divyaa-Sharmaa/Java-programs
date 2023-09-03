import java.util.Scanner;

public class Palindrome {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int num = sc.nextInt();
        boolean isPalin = isPalindrome(num);
        System.out.println(num +" is palindrome number or not?.." + isPalin);
    }
    
    public static boolean isPalindrome(int num){
        if (num < 0)
          return false;
        else{
            int palindromeNum = num;
            int reverse = 0;
            while(palindromeNum!=0){
                int rem = palindromeNum%10;
                reverse = reverse*10 + rem;
                palindromeNum = palindromeNum/10;
            }
            if(reverse == num){
            return true;
        }
        }
        return false;
    }
}
