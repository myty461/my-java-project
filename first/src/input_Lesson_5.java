
import java.util.Scanner;
public class input_Lesson_5 {
    public static void main(String[] args) {
        System.out.println("Input Lesson");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number One:");
        int num1 = scan.nextInt();
        System.out.println("Enter Number Two");
        int num2 = scan.nextInt();
        int sum=num1+num2;
        System.out.println("the  sum of two number is:");
        System.out.println(sum);

    }
}
