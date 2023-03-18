import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();

        int re = powerof(base, exponent);

        System.out.println("Result: " + re);
    }

    public static int powerof(int a, int b)
    {
        int result=1;
        while (b != 0)
        {
            result = result* a;
            --b;
        }
        return result;
    }

}




