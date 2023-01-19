import java.util.Scanner;
public class Project_from_all_5_video {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Mark Of 5 Subject:");
        float num1 = scan.nextInt();
        float num2 = scan.nextInt();
        float num3 = scan.nextInt();
        float num4 = scan.nextInt();
        float num5 = scan.nextInt();
        float sum = num1+num2+num3+num4+num5;
        float percent=sum*100/500;
        System.out.println("The Percent Of All Marks is:");
        System.out.println(percent);


    }
}
