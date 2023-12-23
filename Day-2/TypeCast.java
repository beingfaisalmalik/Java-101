
public class TypeCast {
    public static void main(String[] args){
        // implicit conversion
        int x = 20000000;
        double d = x;
        System.out.println("Implicit Conversion:"+ d);

        int a = x;
        long l = a;
        System.out.println("Long : "+l);

        // Explicit Conversion
        long ll = 200000000L;
        int ii = (int)ll;
        System.out.println(ii);

        double dd = 223232.323232;
        float ff = (float)dd;
        System.out.println(ff);
    }
}
