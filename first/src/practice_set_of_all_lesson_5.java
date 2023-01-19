import java.util.Scanner;
public class practice_set_of_all_lesson_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //   1. make program to calculate CGPA from All Marks
       // float sub1 = 67;
       // float sub2 = 56;
       // float sub3 = 90;
       // float sub4 = 89;
       // float sub5 = 78;
       // float cgpa = (sub1+sub2+sub3+sub4+sub5)/50;
       // System.out.println(cgpa);

        //   2. make a program to wish your name
        // System.out.println("Enter your good name");
        // String name = scan.next();
        // System.out.println("hello " + name + " Have a Good Day");


         //  3. make program to convert kilometer in miles
        System.out.println("Enter Your Distance ");
        float km = scan.nextFloat();
        float miles= 0.6213711922f*km;
        System.out.println("the distance of km in miles is:" + miles);
    }
}
