import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Age Please");
        int x = scn.nextInt();
        System.out.println("Your Age Is : "+x);
    }
}