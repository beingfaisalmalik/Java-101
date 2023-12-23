import java.util.Scanner;

public class Loops {
    public static void main(String[] args)
    {
        System.out.println("Entr The Number For Checking Its Factorial");
        Scanner scn  = new Scanner(System.in);
        int number = scn.nextInt();
        int count =0;
        for(int i=1; i<=number; i++) 
        {
            if (number%i==0 )
            {
                count++;

            }

            
        }

        if (count == 2)
            {
                System.out.print("Number is Prime");
            }
        else 
            {
                System.out.println("Not Prime");
            }
    }
}

