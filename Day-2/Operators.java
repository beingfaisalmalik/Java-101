public class Operators
{
    public static void main(String[] args)
    {
        System.out.println("Operators");

        // Arthemetic Operators
        int a = 1;
        int b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        //Assingment Operators

        a +=3; // a = a+3
        System.out.println("Value of a after adding 3: "+a);
        a -=3; //a = a-3
        System.out.println("Value of a after Subtracting 3: "+a);
        a *=3; // a= a*3
        System.out.println("Value of a after Mul 3: "+a);
        

        // bitwise operators 
        a &=3; // AND
        System.out.println("Value of a after adding 3: "+a);
        a |=3; // OR
        System.out.println("Value of a after Subtracting 3: "+a);
        a ^=3; // XOR
        System.out.println("Value of a after Mul 3: "+a);

        //Comparision Operators

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a<b);


        // Logical Operators

        System.out.println(a>b&&a<b);
        System.out.println(a>b||a<b);
        System.out.println(!(a>b));


         System.out.println("Operations");

         // When One is Integar other one is decimal if we perform the arthimetic operations than it will return the result in the ecimal form
         // when there are two same data types int and int or long and long the resultant will be computed into the same form Alu will perform the explicit forced type conversion

         int aa = 2000000;
         int bb = 2000000;
         long cc = aa*bb;
         // Now The Resultant will be in the int form it wwill assing the long as integare since Alu has performed the forced conversion
         System.out.println(cc);
        }
}