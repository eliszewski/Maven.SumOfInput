/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Sum is " +sumOfNumbers(number)+ " " + gaussianSumOfNumbers(number));
    }
    
    public static int sumOfNumbers(int n) {
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        } return sum;
    }
    
    // for Extra Credit
    public static int gaussianSumOfNumbers(int n) {
        return (n *(n+1)/2);
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
