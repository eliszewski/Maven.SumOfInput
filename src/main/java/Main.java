/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static final double NANOS_PER_SEC = 1000000000.0;


    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Sum is " +sumOfNumbers(number)+ " and sum was solved by gaussian " + gaussianSumOfNumbers(number));
    }
    
    public static String sumOfNumbers(int n) {
        long start = System.nanoTime();
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }
        long stop = System.nanoTime();
        long time = (start - stop); /// NANOS_PER_SEC;
        return "" + sum + " finished in " + time;
    }
    
    // for Extra Credit
    public static String gaussianSumOfNumbers(int n) {
        long start = System.nanoTime();
        int sum =(n *(n+1)/2);
        long stop = System.nanoTime();
        long time = (start - stop); /// NANOS_PER_SEC;
        return "" + sum + " finished in " ;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
