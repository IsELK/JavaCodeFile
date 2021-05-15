public class Main
{
    public static void main(String[] args)
    {
        int m = 123789456;
        int n = 2;
        while (m != 0)
        {
            int data = m % n;
            m /= n;
            System.out.print(data+" ");
        }
    }
}