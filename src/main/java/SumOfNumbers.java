import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class SumOfNumbers {

    public static void main(String[] args){

        SumOfNumbers main_object = new SumOfNumbers();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int newN = scanner.nextInt();

        int result = main_object.sumOfNumbers(newN);
        System.out.println(result);
        scanner.close();

    }

    int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    }
