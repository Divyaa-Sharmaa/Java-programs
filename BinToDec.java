// package Java-programs;

import java.util.Scanner;

public class BinToDec {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        // int num1 = sc.nextInt();
        int num1 = sc.nextInt();
        int binTodec = binToDec(num1);
        System.out.println("Binary number is " + num1 + " and will be " +  binTodec + " in decimal" );
    }

    public static int binToDec (int binNum){
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        return decNum;
    }

}
