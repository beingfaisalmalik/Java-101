import java.util.Scanner;

public class ifElse {
    public static void main(String[] args)
    {
        System.out.println("Enter Values of a ");
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("Enter Values of b ");
        Scanner scn2 = new Scanner(System.in);
        int b=scn2.nextInt();
        System.out.println("Enter Values of c ");
        Scanner scn3 = new Scanner(System.in);
        int c=scn3.nextInt();

        //greates number amoung three of them
        if (a>b && a>c)
        {
            System.out.println("a is the greatest number");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is the greatest number");
        }
        else
        {
            System.out.println("c is the greatest number");
        }

    }
}
