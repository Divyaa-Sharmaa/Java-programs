// package Java-programs;

import java.util.Scanner;

public class primeNum {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        // int num1 = sc.nextInt();
        int num1 = sc.nextInt();
        boolean isPrime = isPrimeNum(num1);
        System.out.println( num1 + " is prime: true or false...? " + isPrime);
    }

    public static boolean isPrimeNum(int num){
        if (num == 0 || num==1) return false ;
        if(num == 2) return true;
        for(int i =2; i<=num-1;i++){ // for(int i =2; i<=num/2-1;i++){ or for(int i =2; i<=Math.sqrt(n);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
