// package Java-programs;

import java.util.Scanner;

public class DecToBin {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int num1 = sc.nextInt();
        int decToBin = DecToBina(num1);
        System.out.println("Decimal number is " + num1 + " and will be " +  decToBin + " in binary" );
    }

    public static int DecToBina(int decNum){
        int pow = 0;
        int binNum = 0;
        while(decNum>0){
            int rem = decNum%2;
            binNum = binNum+(rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        return binNum;    
    }
    
}
