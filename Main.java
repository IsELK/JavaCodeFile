public class Main
{
    public static void main(String[]args)
    {
        try
        {
            int i = 10;
            int j = 0;
            System.out.println(i / j);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}