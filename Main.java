import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        long number, temp;
        number = in.nextLong();
        while(number != 0)
        {
            temp = number % 10;
            System.out.println(temp);
            number /= 10;
        }
    }
}