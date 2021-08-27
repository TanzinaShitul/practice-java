package Tanzina;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num_1;
        int num_2;
        int sum;


        Scanner input = new Scanner(System.in);
        System.out.println("num1 =");
        num_1 = input.nextInt();

        System.out.println("num2 =");

        num_2 = input.nextInt();

        input.close();
        sum = num_1 + num_2;
        System.out.println(sum);

    }
}
