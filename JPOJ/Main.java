package JPOJ;



//import java.util.Scanner;
//
//public class Main   //D. 下一个镜像数
//{
//    public static void main(String[]args)
//    {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        for(int i = 0; i < x; i++)
//        {
//            long y = in.nextLong();
//            for(long j = y + 2; j < 1000000000000000000L; j+=2)
//            {
//                int yl = ((j+"").length() / 2) + 1;
//                String a = String.valueOf(j).substring(0, yl);
//                String b = String.valueOf(j).substring(yl - 1);
//                char [] tb = b.toCharArray();
//                int temp = 0;
//                for(int k = tb.length - 1; k >= 0; k--)
//                {
//                    temp += (int)tb[k] - (int)'0';
//                    temp *= 10;
//                }
//                temp /= 10;
//                b = String.valueOf(temp);
//                if(a.equals(b))
//                {
//                    System.out.println(j);
//                    break;
//                }
//            }
//        }
//    }
//}

/*
import java.util.Scanner;

public class Main   //C. 班级就餐
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i = 0; i < x; i++)
        {
            int y = in.nextInt();
            int m = (y / 3) * 90;
            if(y % 3 == 2)
            {
                m += 70;
            }
            else if(y % 3 == 1)
            {
                m += 40;
            }
            System.out.println(m);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //B. 摸鱼的稿子
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char [] x = in.nextLine().toCharArray();
        char [] y = in.nextLine().toCharArray();
        int yl = 0;
        for(int i = 0; i < x.length; i++)
        {
            if(Character.isUpperCase(x[i]))
            {
                int t = yl % y.length;
                x[i] = Character.toUpperCase(y[t]);
                yl++;
            }
            else if(Character.isLowerCase(x[i]))
            {
                int t = yl % y.length;
                x[i] = Character.toLowerCase(y[t]);
                yl++;
            }
            else
            {
                yl = 0;
            }
        }
        for(int i = 0; i < x.length; i++)
        {
            System.out.print(x[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1374 - 石头剪子布
    public static void main(String[]args)
{
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int [] m = new int[n];
        for(int i = 0; i < n; i++)
        {
            String [] t = in.nextLine().split(" ");
            if(t[0].equals("Rock"))
            {
                if(t[1].equals("Rock"))
                {
                    m[i] = 0;
                }
                else if(t[1].equals("Scissors"))
                {
                    m[i] = 1;
                }else if(t[1].equals("Paper"))
                {
                    m[i] = 2;
                }
            }
            else if(t[0].equals("Scissors"))
            {
                if(t[1].equals("Scissors"))
                {
                    m[i] = 0;
                }
                else if(t[1].equals("Paper"))
                {
                    m[i] = 1;
                }else if(t[1].equals("Rock"))
                {
                    m[i] = 2;
                }
            }
            else if(t[0].equals("Paper"))
            {
                if(t[1].equals("Paper"))
                {
                    m[i] = 0;
                }
                else if(t[1].equals("Rock"))
                {
                    m[i] = 1;
                }else if(t[1].equals("Scissors"))
                {
                    m[i] = 2;
                }
            }
        }
        for (int i = 0; i < m.length; i++)
        {
            if(m[i] == 0)
            {
                System.out.println("Tie");
            }
            else if(m[i] == 1)
            {
                System.out.println("Player1");
            }
            else if(m[i] == 2)
            {
                System.out.println("Player2");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1089 - 字母阵列找"LANQIAO"
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        char [][] a = new char[n][n];
        for(int x = 0; x < n; x++)
        {
            a[x] = in.nextLine().toCharArray();
        }
        int k = 0;
        for(int x = 0; x < n; x++)
        {
            for(int y = 0; y < n; y++)
            {
                if(a[x][y] == 'L')
                {
                    k += ChaZhao(a, x, y);
                }
            }
        }
        System.out.println(k);
    }

    public static int ChaZhao(char [][] a, int x, int y)
    {
        int k = 0;
        if(x - 6 >= 0)
        {
            if(JianCe(a[x-1][y],a[x-2][y],a[x-3][y],a[x-4][y],a[x-5][y],a[x-6][y]))//向正上检测
            {
                k++;
            }
            if(y - 6 >= 0)
            {
                if(JianCe(a[x-1][y-1],a[x-2][y-2],a[x-3][y-3],a[x-4][y-4],a[x-5][y-5],a[x-6][y-6]))//向左上检测
                {
                    k++;
                }
            }
            if(y + 6 < a.length)
            {
                if(JianCe(a[x-1][y+1],a[x-2][y+2],a[x-3][y+3],a[x-4][y+4],a[x-5][y+5],a[x-6][y+6]))//向右上检测
                {
                    k++;
                }
            }
        }
        if(x + 6 < a.length)
        {
            if(JianCe(a[x+1][y],a[x+2][y],a[x+3][y],a[x+4][y],a[x+5][y],a[x+6][y]))//向正下检测
            {
                k++;
            }
            if(y - 6 >= 0)
            {
                if(JianCe(a[x+1][y-1],a[x+2][y-2],a[x+3][y-3],a[x+4][y-4],a[x+5][y-5],a[x+6][y-6]))//向左下检测
                {
                    k++;
                }
            }
            if(y + 6 < a.length)
            {
                if(JianCe(a[x+1][y+1],a[x+2][y+2],a[x+3][y+3],a[x+4][y+4],a[x+5][y+5],a[x+6][y+6]))//向右下检测
                {
                    k++;
                }
            }
        }
        if(y - 6 >= 0)
        {
            if(JianCe(a[x][y-1],a[x][y-2],a[x][y-3],a[x][y-4],a[x][y-5],a[x][y-6]))//向正左检测
            {
                k++;
            }
        }
        if (y + 6 < a.length)
        {
            if(JianCe(a[x][y+1],a[x][y+2],a[x][y+3],a[x][y+4],a[x][y+5],a[x][y+6]))//向正右检测
            {
                k++;
            }
        }
        return k;
    }

    public static boolean JianCe(char a, char b, char c, char d, char e, char f)
    {
        boolean bb = false;
        if(a == 'A' && b == 'N' && c == 'Q' && d == 'I' && e == 'A' && f == 'O')
        {
            bb = true;
        }
        return bb;
    }
}
*/

/*
public class Main   //1103 - 马虎的算式
{
    public static void main(String[]args)
    {
        int i = 0;
        for(int a = 1; a <= 9; a++)
        {
            for(int b = 1; b <= 9; b++)
            {
                for(int c = 1; c <= 9; c++)
                {
                    for(int d = 1; d <= 9; d++)
                    {
                        for(int e = 1; e <= 9; e++)
                        {
                            if(((a*10)+b)*(((c*100)+d*10)+e) == (((a*100)+d*10)+b)*((c*10)+e) && a != b && a != c && a != d && a != e && b != c && b != d && b != e &&c != d && c != e && d != e)
                            {
                                System.out.println(((a*10)+b)+"*"+(((c*100)+d*10)+e)+"="+(((a*100)+d*10)+b)+"*"+((c*10)+e));
                                i++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1167 - 羞涩的答复
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        char [] m = in.nextLine().toCharArray();
        int a = 0;
        if(n.length >= m.length)
        {
            for(int i = 0; i < n.length - m.length + 1; i++)
            {
                int k = i;
                int t = 0;
                for(int j = 0; j < m.length; j++)
                {

                    if(n[k] == m[j])
                    {
                        t++;
                    }
                    k++;
                }
                if(t == m.length)
                {
                    a++;
                }
            }
        }
        if(a % 2 == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1372 - 找第一个只出现一次的字符
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        int k = 0;
        for(int i = 0; i < n.length; i++)
        {
            int b = 0;
            for(int j = 0; j < n.length; j++)
            {
                if(n[i] == n[j])
                {
                    b++;
                    if(b == 2)
                    {
                        break;
                    }
                }
            }
            if(b == 1)
            {
                System.out.println(n[i]);
                k++;
                break;
            }
        }
        if(k == 0)
        {
            System.out.println("no");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1391 - 删除单词后缀
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        int m = n.length;
        if(m > 2 && n[m-2] == 'e' && n[m-1] == 'r')
            m -= 2;
        else if(m > 2 && n[m-2] == 'l' && n[m-1] == 'y')
            m -= 2;
        else if(m > 3 && n[m-3] == 'i' && n[m-2] == 'n' && n[m-1] == 'g')
            m -= 3;
        for (int i = 0; i < m; i++)
        {
            System.out.print(n[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1403 - 字符串p型编码
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        int k = 1;
        for(int i = 1; i < n.length; i++)
        {
            if(n[i] == n[i-1] && i != n.length-1)
            {
                k++;
            }
            else
            {
                if(i == n.length-1)
                {
                    if(n[n.length-1] == n[n.length-2])
                    {
                        System.out.print((k+1)+""+n[i-1]);
                    }
                    else
                    {
                        System.out.print(k+""+n[i-1]);
                        System.out.print(1+""+n[n.length-1]);
                    }
                }
                else
                {
                    System.out.print(k+""+n[i-1]);
                    k = 1;
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //1404 - 行程长度编码
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char [] m = n.toUpperCase().toCharArray();
        int k = 1;
        for(int i = 1; i < m.length; i++)
        {
            if(m[i] == m[i-1] && i != m.length-1)
            {
                k++;
            }
            else
            {
                if(i == m.length-1)
                {
                    if(m[m.length-1] == m[m.length-2])
                    {
                        System.out.print("("+m[i-1]+","+(k+1)+")");
                    }
                    else
                    {
                        System.out.print("("+m[i-1]+","+k+")");
                        System.out.print("("+m[m.length-1]+","+1+")");
                    }
                }
                else
                {
                    System.out.print("("+m[i-1]+","+k+")");
                    k = 1;
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main   //C. 选择排序
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] x = new int[in.nextInt()];
        for(int i = 0; i < x.length; i++)
        {
            x[i] = in.nextInt();
        }
        Sort(x);
    }
    public static void Sort(int [] x)
    {
        for(int i = 0; i < x.length-1; i++)
        {
            int t = i;
            for(int j = i+1; j < x.length; j++)
            {
                if(x[t] > x[j])
                {
                    t = j;
                }
            }
            int tt = x[i];
            x[i] = x[t];
            x[t] = tt;
            System.out.print(t+": ");
            output(x);
        }
        System.out.print("finnally: ");
        output(x);
    }

    public static void output(int [] x)
    {
        for(int i = 0; i < x.length; i++)
        {
            System.out.print(x[i]);
            if(i != x.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
*/

/*
import java.util.Scanner;

public class Main   //C. 冒泡排序
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int [] x = new int[in.nextInt()];
        for(int i = 0; i < x.length; i++)
        {
            x[i] = in.nextInt();
        }
        Sort(x);
    }
    public static void Sort(int [] x)
    {
        for(int i = 0; i < x.length-1; i++)
        {
            int tt = 0;
            for(int j = x.length-1; j > i; j--)
            {
                if(x[j] < x[j-1])
                {
                    int t = x[j];
                    x[j] = x[j-1];
                    x[j-1] = t;
                    tt++;
                }
            }
            System.out.print(tt+": ");
            output(x);
        }
        System.out.print("finnally: ");
        output(x);

    }
    public static void output(int [] x)
    {
        for(int j = 0; j < x.length; j++)
        {
            System.out.print(x[j]);
            if(j != x.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1351 - 生日蜡烛
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i = 1; i <= a/2; i++){
            int x = i;
            int y = i;
            while (y < a){
                y++;
                x += y;
                if(x == a){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1410 - 矩阵交换行
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][] k = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                k[i][j] = in.nextInt();
            }
        }
        int n = in.nextInt() - 1;
        int m = in.nextInt() - 1;

        for(int i = 0; i < 5; i++){
            int temp = k[n][i];
            k[n][i] = k[m][i];
            k[m][i] = temp;
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(k[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1341 - 年龄与疾病
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = in.nextInt();
        int [] m = new int[n];
        for(int i = 0; i < n; i++){
            m[i] = in.nextInt();
        } 
        int [] s = new int[4];
        int [] e = new int[4];
        for(int i = 0; i < 4; i++){
            s[i] = in.nextInt();
            e[i] = in.nextInt();
        }
        for(int i = 0; i < 4; i++){
            double t = 0;
            for(int j = 0; j < m.length; j++){
                if(m[j] >= s[i] && m[j] <= e[i]){
                    t++;
                }
            }
            System.out.println(df.format(t / n * 100) + "%");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1211 - 密码解密
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String [] m = in.nextLine().split(n);
        for(int i = 0; i < m.length; i++){
            char [] o = m[i].toCharArray();
            int p = 0, t = 0;
            for(int j = o.length-1; j >= 0; j--){
                p += (o[j] - '0') * Math.pow(Integer.parseInt(n),t);
                t++; 
            }
            System.out.print((char)p);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1401 - 单词倒排
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] n = in.nextLine().split(" ");
        for(int i = n.length-1; i >= 0; i--){
            System.out.print(n[i]+" ");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1400 - 单词翻转
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] n = in.nextLine().split(" ");
        for(int i = 0; i < n.length; i++){
            char [] m = n[i].toCharArray();
            for(int j = m.length-1; j >= 0; j--){
                System.out.print(m[j]);
            }
            System.out.print(" ");
        }
    }
}
*/


/*
import java.util.Scanner;

public class Main{   //1113 - 猜叔叔的出生年月
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt(), m = in.nextInt(), d = in.nextInt();
        int sm = in.nextInt();
        for(int sy = y - 120; sy <= y; sy++){
            int [] md = {31,28,31,30,31,30,31,31,30,31,30,31};
            if(sy % 4 == 0 && sy % 100 != 0 || sy % 400 == 0){
                md[1]++;
            }
            for(int sd = 1; sd < md[sm - 1]; sd++){
                int temp = (sy * 100 + sm) * 100 + sd;
                if(temp % y == 0 && temp % m == 0 && temp % d == 0){
                    System.out.println(temp);
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1232 - 报数游戏
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = "甲乙丙丁戊己庚辛庚己戊丁丙乙";
        String m = "";
        for(int i = 0; i < 7200; i++){
            m += n;
        }
        int a = in.nextInt();
        System.out.println(m.charAt(a-1));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1184 - 旋转图片90度
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] x = new int[n][m];
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                x[i][j] = in.nextInt();
            }
        }
        for(int j = 0; j < m; j++){
            for(int i = n - 1; i >= 0; i--){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1143 - 核桃的数量
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int temp = 0;
        do{
            temp++;
        }while(temp % a != 0 || temp % b != 0 || temp % c != 0);
        System.out.println(temp);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1395 - 单词的长度
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        String m = "";
        if(!Character.isSpaceChar(n[0])){
            m += n[0];
        }
        for(int i = 1; i < n.length; i++){
            if(!Character.isSpaceChar(n[i])){
                m += n[i];
            }else if(Character.isSpaceChar(n[i]) && !Character.isSpaceChar(n[i - 1])){
                m += " ";
            }
        }
        String [] o = m.split(" ");
        for(int i = 0; i < o.length; i++){
            System.out.print(o[i].length());
            if(i != o.length-1){
                System.out.print(",");
            }

        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1151 - 输出图形（9）：数字菱形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tt = n - 1;
        for(int i = 1; i <= n; i++){
            int t = 0;
            for(int j = tt; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                t = j - 1;
            }
            for(int j = t; j >= 1; j--){
                System.out.print(j);
            }
            tt--;
            System.out.println();
        }
        tt += 2;
        for(int i = n-1; i >= 1; i--){
            int t = 0;
            for(int j = 0; j < tt; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                t = j - 1;
            }
            for(int j = t; j >= 1; j--){
                System.out.print(j);
            }
            tt++;
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1392 - 单词替换
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] n = in.nextLine().split(" ");
        String a = in.nextLine();
        String b = in.nextLine();
        for(int i = 0; i < n.length; i++){
            if(n[i].equals(a)){
                n[i] = b;
            }
        }
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i]);
            if(i != n.length - 1){
                System.out.print(" ");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1323 - 药房管理
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] t = new int[m];
        for(int i = 0; i < m; i++){
            t[i] = in.nextInt();
        }
        for(int i = 0; i < t.length; i++){
            if(t[i] <= n){
                n -= t[i];
                m--;
            }
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1330 - 计算多项式的值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble(), o = 0;
        int m = in.nextInt();
        while(m >= 0){
            o += Math.pow(n, m);
            m--;
        }
        System.out.printf("%.2f",o);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1316 - 与指定数字相同的数的个数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int o = 0;
        for(int i = 0; i < n; i++){
            int t = in.nextInt();
            if(m == t){
                o++;
            }
        }
        System.out.println(o);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1344 - 向量点积计算
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0;
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int [] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            m += a[i] * b[i];
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1266 - 级数求和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), n = 0;
        double Sn = 0;
        while(Sn <= k){
            n++;
            Sn += 1.0 / n;
        }
        System.out.println(n);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1247 - 校园里的共享单车
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            double a = m / 3.0 + 50;
            double b = m / 1.2;
            if(a > b){
                System.out.println("Walk");
            }else if(a < b){
                System.out.println("Bike");
            }else{
                System.out.print("All");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1394 - 过滤多余的空格
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        if(!Character.isSpaceChar(n[0])){
            System.out.print(n[0]);
        }
        for(int i = 1; i < n.length; i++){
            if(!Character.isSpaceChar(n[i])){
                System.out.print(n[i]);
            }else if (Character.isSpaceChar(n[i]) && !Character.isSpaceChar(n[i - 1])){
                System.out.print(n[i]);
            }
        }
    }
}
*/

// import java.util.Scanner;

// public class Main{   //1147 - 斐波那契数列 v2.0
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         long n = in.nextInt(), a = 1, b = 1, c = 0;
//         for(int i = 2; i < n; i++){
//             c = a + b;
//             a = b;
//             b = c;
//         }
//         System.out.println(b % 9923);
//     }
// }

/*
import java.util.Scanner;

public class Main{   //1390 - 字符串移位包含问题
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] temp = in.nextLine().split(" ");
        String n = "";
        String m = "";
        if(temp[0].length() > temp[1].length()){
            n += temp[0];
            m += temp[1];
        }else{
            n += temp[1];
            m += temp[0];
        }
        for(int i = 0; i < n.length(); i++){
            if(n.indexOf(m) != -1){
                System.out.println(true);
                break;
            }
            char [] o = n.toCharArray();
            n = "";
            for(int j = 1; j < o.length; j++){
                n += String.valueOf(o[j]);
            }
            n += o[0];
        }
        if(n.indexOf(m) == -1){
            System.out.println(false);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1333 - 与7无关的数(字符串做法)
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        for(int i = 0; i <= n; i++){
            if(i % 7 != 0){
                String m = String.valueOf(i);
                if(m.indexOf("7") == -1){
                    num += Math.pow(i,2);
                }
            }
        }
        System.out.println(num);
    }
}
*/

// import java.util.Scanner;

// public class Main{   //1173 - 字母金字塔
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n - 1; j++){
//                 System.out.print(" ");
//             }
            
//         }
//     }
// }

/*
import java.util.Scanner;

public class Main{   //1389 - 验证子串
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        if(a.indexOf(b) != -1){
            System.out.println(b+" is substring of "+a);
        }else if(b.indexOf(a) != -1){
            System.out.println(a+" is substring of "+b);
        }else{
            System.out.println("No substring");
        }
    }
}
*/

// public class Main{   //E. 健身餐饮
//     public static void main(String[] args){

//     }
// }

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {   //D. 框住所有的点
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i = 0; i < n; i ++){
            String [] m = in.nextLine().split(",");
            x[i] = Integer.parseInt(m[0]);
            y[i] = Integer.parseInt(m[1]);
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(x[0]+","+y[y.length-1]);
        System.out.println(x[x.length - 1]+","+y[0]);
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;
public class Main {   //C. 选择排序
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] t = new int[n];
        boolean [] b = new boolean[t.length];
        Arrays.fill(b,true);
        int [] tt = new int[t.length];
        for(int i = 0; i < t.length; i++){
            t[i] = in.nextInt();
            tt[i] = t[i];
        }
        Arrays.sort(tt);
        int w = 0;
        for(int i = 0; i < tt.length; i++){
            for(int j = 0; j < t.length; j++){
                if(tt[i] == t[j]){
                    if(i != t.length - 1){
                        System.out.print(j +": ");
                    }else {
                        System.out.print("finnally: ");
                    }
                    b[j] = false;
                    int temp = t[w];
                    t[w] = t[j];
                    t[j] = temp;
                    w++;
                    break;
                }
            }
            for (int j = 0; j < t.length; j++){
                System.out.print(t[j]);
                if(j == t.length - 1){
                    System.out.print("\n");
                }else {
                    System.out.print(",");
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //B. 整理命名
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            char [] t = in.next().toCharArray();
            for(int j = 0; j < t.length; j++){
                if(Character.isUpperCase(t[j])){
                    t[j] += 32;
                }
            }
            if(Character.isLetter(t[0])){
                t[0] -= 32;
            }
            for(char j : t){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //A. A*B 问题
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a * b);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1028 - 师姐的兔子
   public static void main(String [] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt(), o = 0;
       int [] m = new int[1000];
       for(int i = 0; i < n; i++){
           int t = in.nextInt();
           m[t - 1]++;
       }
       for(int i : m){
           if(i != 0){
               o++;
           }
       }
       System.out.println(o);
       for(int i = 0; i < m.length; i++){
           if(m[i] != 0){
               System.out.print(i + 1 +" ");
           }
       }
   }
}
*/

/*
import java.util.Scanner;

public class Main{   //1031 - 万人齐点赞
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] m = new int[30000];
        for(int i = 0; i < n; i++){
            int t = in.nextInt();
            m[t - 1]++;
        }
        int max = 0;
        for(int i = 0; i < m.length; i++){
            if(m[i] > max){
                max = m[i];
            }
        }
        for(int i = 0; i < m.length; i++){
            if(m[i] == max){
                System.out.println(i + 1 +"  "+ max);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1339 - 陶陶摘苹果
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] n = new int[10];
        for(int i = 0; i < 10; i++){
            n[i] = in.nextInt();
        }
        int m = in.nextInt(), o = 0;
        for(int i = 0; i < 10; i++){
            if(m + 30 >= n[i]){
                o++;
            }
        }
        System.out.println(o);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1338 - 与指定数字相同的数的个数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0;
        int [] nn = new int[n];
        for(int i = 0; i < n; i++){
            nn[i] = in.nextInt();
        }
        int k = in.nextInt();
        for(int i = 0; i < n; i++){
            if(nn[i] == k){
                m++;
            }
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1329 - 求出e的值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double m = 1;
        for(int i = 1; i <= n; i++){
            double c = 1;
            for(int j = 1; j <= i; j++){
                c *= j;
            }
            m += 1 / c;
        }
        System.out.printf("%.10f", m);
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {   //1212 - 校门外的树
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        boolean [] b = new boolean[n+1];
        Arrays.fill(b,true);
        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            for(int j = x; j <= y; j++){
                b[j] = false;
            }
        }
        int z = 0;
        for(int i = 0; i < b.length; i++){
            if(b[i]){
                z++;
            }
        }
        System.out.println(z);
    }
}
*/

/*
public class Main {   //1148 - 4位回文数字
    public static void main(String[] args){
        for(int i = 1000; i <= 9999; i++){
            char [] n = String.valueOf(i).toCharArray();
            if(n[0] == n[3] & n[1] == n[2]){
                System.out.println(i);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1118 - 缩位求和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()), o;
        for(int i = 0; i < n; i++){
            String m = in.nextLine();
            do {
                o = 0;
                char[] p = m.toCharArray();
                for (int j = 0; j < p.length; j++) {
                    int temp = p[j] - '0';
                    o += temp;
                }
                m = String.valueOf(o);
            }while (o / 10 != 0);
            System.out.println(o);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1326 - 统计满足条件的4位数个数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), o = 0;
        for(int i = 0; i < n; i ++){
            int m = in.nextInt();
            char [] p = String.valueOf(m).toCharArray();
            int a = p[3] - '0', b = p[0] - '0', c = p[1] - '0', d = p[2] - '0';
            if(a - b - c - d > 0){
                o++;
            }
        }
        System.out.println(o);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1376 - 合法 C 标识符
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String c = "int,long,short,float,double,char,unsigned,signed,const,void,volatile,enum,struct,union,if,else,goto,switch,case,do,while,for,continue,break,return,default,typedef,auto,register,extern,static,sizeof";
        String n = in.nextLine();
        char [] m = n.toCharArray();
        int o = 0;
        if(c.equals(n) || Character.isDigit(m[0])){
            System.out.println("no");
        }else{

            for(int i = 0; i < m.length; i++){
                if(!Character.isLetter(m[i]) && !Character.isDigit(m[i]) && !String.valueOf(m[i]).equals("_")){
                    System.out.println("no");
                    o++;
                }
            }
            if(o == 0){
                System.out.println("yes");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1146 - 斐波那契数列 v1.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] m = new int[n];
        if(n == 1){
            System.out.println(1);
        }else if(n == 2){
            System.out.println(2);
        }else{
            m[0] = 1;
            m[1] = 1;
            for(int i = 2; i < m.length; i++){
                m[i] = m[i - 1] + m[i - 2];
            }
            System.out.println(m[n-1]);
        }
    }
}
*/

//import java.util.Scanner;
//
//public class Main {   //1055 - 求平方根的迭代方法
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//    }
//}

/*
import java.util.Scanner;

public class Main {   //1388 - 大小写字母互换
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(Character.isUpperCase(n[i])){
                System.out.print((char)(n[i] + 32));
            }else if(Character.isLowerCase(n[i])){
                System.out.print((char)(n[i] - 32));
            }else{
                System.out.print(n[i]);
            }
        }
    }
}
*/

/*
public class Main {   //1179 - 卖鸡蛋
    public static void main(String[] args){
        for(int x = 0; x <= 150; x++){
            int y = 150 - x;
            if(x*x*24.5==32*y*y){
                System.out.println(x +","+ y);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1091 - 爱跑步的师兄
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] o = in.nextLine().split(" ");
        int m = Integer.parseInt(o[0]),
                t = Integer.parseInt(o[1]),
                u = Integer.parseInt(o[2]),
                f = Integer.parseInt(o[3]),
                d = Integer.parseInt(o[4]);
        int a = 0, b = 0, n = 0;
        String [] p = in.nextLine().split(" ");
        for(int i = 0; i < t; i++){
            if(p[i].equals("u")){
                a += u;
                b += d;
            }else if(p[i].equals("f")){
                a += f;
                b += f;
            }else if(p[i].equals("d")){
                a += d;
                b += u;
            }
            if(a + b <= m){
                n++;
            }
        }
        System.out.println(n);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1058 - 矩阵对角线元素之和 v1.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][] n = new int[3][3];
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                n[i][j] = in.nextInt();
            }
        }
        System.out.println((n[0][0]+n[1][1]+n[2][2])+" "+(n[0][2]+n[1][1]+n[2][0]));
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {   //1336 - 质因数分解
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean [] b = new boolean[n];
        Arrays.fill(b,true);
        b[0] = false;
        b[1] = false;
        for(int i = 2; i < n; i++){
            if(b[i]){
                for(int j = 2; i * j < n; j++){
                    b[i * j] = false;
                }
            }
        }
        for (int i = n - 1; i > 0; i--){
            if(b[i]){
                if(n % i == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1130 - 轮换
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        int m = in.nextInt();
        if(m > n.length){
            m %= n.length;
        }
        for(int i = n.length - m; i < n.length; i++){
            System.out.print(n[i]);
        }
        for(int i = 0; i < n.length - m; i++){
            System.out.print(n[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1244 - 加减乘除的运算式子
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char n [] = in.nextLine().toCharArray();
        int a = 0, b = 0;
        String s = "";
        for(int i = 0; i < n.length; i++){
            if(Character.isDigit(n[i])){
                a *= 10;
                a += (n[i] - '0');
            }else if(!Character.isDigit(n[i])){
                s = String.valueOf(n[i]);
                i++;
                while (i < n.length){
                    b *= 10;
                    b += (n[i] - '0');
                    i++;
                }
            }
        }
        if(s.equals("+")){
            System.out.println(a + b);
        }else if (s.equals("-")){
            System.out.println(a - b);
        }else if (s.equals("*")){
            System.out.println(a * b);
        }else if(s.equals("/")){
            if (b == 0) {
                System.out.println("Error");
            }else{
                System.out.println(a / b);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1335 - 画矩形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char [] c = in.nextLine().toCharArray();
        String s = String.valueOf(c[1]);
        int o = c[3] - '0';
        if(o == 0){
            for(int i = 0; i < n; i++){
                if(i == 0 | i == (n - 1)){
                    for(int j = 0; j < m; j++){
                        System.out.print(s);
                    }
                }else{
                    System.out.print(s);
                    for(int j = 0; j < m - 2; j++){
                        System.out.print(" ");
                    }
                    System.out.print(s);
                }
                System.out.print("\n");
            }
        }else{
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(s);
                }
                System.out.print("\n");
            }
        }
    }
}
*/

/*
public class Main {   //1129 - 土地测量
    public static void main(String[] args){
        double [] a = {52.1,57.2,43.5};
        double [] b = {68.2,68.2,71.9};
        double [] c = {33.4,71.9,51.9};
        double x = 0;
        for(int i = 0; i < 3; i++){
            double s = (a[i] + b[i] + c[i]) / 2;
            double temp = Math.sqrt(s * (s - a[i]) * (s - b[i]) * (s - c[i]));
            x += temp;
        }
        System.out.printf("%.2f",x);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1381 - 加密的病历单
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(Character.isLowerCase(n[i])){
                n[i] -= 32;
                n[i] += 3;
                if(n[i] > 90){
                    n[i] -= 26;
                }
            }else if (Character.isUpperCase(n[i])){
                n[i] += 32;
                n[i] += 3;
                if(n[i] > 122){
                    n[i] -= 26;
                }
            }
        }
        for(int i = n.length - 1; i >= 0; i--){
            System.out.print(n[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1378 - 字符替换
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] n = in.nextLine().split(" ");
        char [] m = n[0].toCharArray();
        for(int i = 0; i < m.length; i++){
            if(String.valueOf(m[i]).equals(n[1])){
                m[i] = n[2].charAt(0);
            }
            System.out.print(m[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1382 - 将字符串中的小写字母转换成大写字母
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(Character.isLowerCase(n[i])){
                n[i] -= 32;
            }
            System.out.print(n[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1107 - 字符串处理
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        String m = "";
        if(Character.isLowerCase(n[0])){
            n[0] -= 32;
            m += n[0];
        }
        for(int i = 1; i < n.length - 1; i++){
            if(Character.isSpaceChar(n[i - 1]) & Character.isLowerCase(n[i])){
                n[i] -= 32;
            }
            if(Character.isDigit(n[i]) & Character.isLetter(n[i - 1])){
                m += "_";
            }else if(Character.isDigit(n[i - 1]) & Character.isLetter(n[i])){
                m += "_";
            }
            if(!Character.isSpaceChar(n[i])){
                m += n[i];
            }else  if(!Character.isSpaceChar(n[i+1])){
                m += " ";
            }
        }
        System.out.println(m + n[n.length - 1]);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1383 - 字符串判等
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] a = in.nextLine().toCharArray();
        char [] b = in.nextLine().toCharArray();
        String n = "", m = "";
        for(int i = 0; i < a.length; i++){
            if(Character.isLetter(a[i])){
                n += a[i];
            }
        }for(int i = 0; i < b.length; i++){
            if(Character.isLetter(b[i])){
                m += b[i];
            }
        }
        if(n.equalsIgnoreCase(m)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {   //1178 - 第N个质数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean [] b = new boolean[10000000];
        Arrays.fill(b,true);
        for(int i = 2; i < 10000000; i++){
            if(b[i]){
                for(int j = 2; j * i < 10000000; j++){
                    b[j * i] = false;
                }
            }
        }
        int o = 0;
        for(int i = 2; i < 10000000; i++){
            if(b[i]){
                o++;
            }
            if(o == n){
                System.out.println(i);
                break;
            }
        }
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {   //1049 - 质数 v2.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int m = in.nextInt(), o = 0;
            boolean [] b = new boolean[10000000];
            Arrays.fill(b,true);
            for(int j = 2; j <= m; j++){
                if(b[j]){
                    for(int k = 2; k * j <= m; k++){
                        b[k * j] = false;
                    }
                    o++;
                }
            }
            System.out.println(o);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1262 - 自行车比赛
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double s1 = in.nextDouble(), s2 = in.nextDouble();
        double o = in.nextDouble(), t = 0;
        double x = s1 * o, y = s2 * 0;
        while (x > y){
            System.out.printf("%.2f %.2f\n",x,y);
            t+=0.5;
            x = s1 * (t + o);
            y = s2 * t;
        }
        System.out.printf("%.2f %.2f\n",x,y);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1021 - 十六进制整数的各个数字
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n < 0){
            n = Math.abs(n);
        }
        do{
            long o = n % 16;
            if(o >= 10){
                char p = (char)(o + 55);
                System.out.println(p);
            }else{
                System.out.println(o);
            }
            n /= 16;
        }while (n != 0);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1018 - 八进制整数的各个数字
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n < 0){
            n = Math.abs(n);
        }
        do{
            System.out.println(n % 8);
            n /= 8;
        }while (n != 0);
    }
}
*/

/*
public class Main {   //1353 - 立方变自身
    public static void main(String[] args){
        int n = 0;
        for (int i = 1; i <= 100000; i++){
            long j = (long) Math.pow(i,3);
            long m = 0;
            do {
                m += j % 10;
                j /= 10;
            }while (j != 0);
            if(m == i){
                n++;
            }
        }
        System.out.println(n);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1334 - 数1的个数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = 0;
        String n = "";
        for(int i = 1; i <= x; i++){
            String m = String.valueOf(i);
            n += m;
        }
        char [] o = n.toCharArray();
        for(int i = 0; i < o.length; i++){
            if(o[i] == '1'){
                y++;
            }
        }
        System.out.println(y);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1333 - 与7无关的数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0, o;
        for(int i = 1; i <= n; i++){
            if(i % 7 != 0){
                int j = i;
                o = 0;
                do {
                    if((j % 10) == 7){
                        o++;
                    }
                    j /= 10;
                }while (j != 0);
                if(o == 0){
                    m += Math.pow(i,2);
                }
            }
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Arrays;

public class Main{   //1012 - 猜字母
    public static void main(String[] args){
        String n = "abcdefghijklmnopqrs";
        String m = "";
        for(int i = 0; i < 106; i++){
            m += n;
        }
        boolean [] b = new boolean[m.length()];
        Arrays.fill(b, true);
        int x = b.length;
        int y = 1;
        while(x != 1){
            for(int i = 0; i < b.length; i++){
                if(b[i]){
                    if(y % 2 == 1){
                        b[i] = false;
                        x--;
                    }
                    y++;
                }
            }
            for(int k = 0; k < b.length; k++){
                if(b[k]){
                    System.out.print(m.charAt(k));
                }
            }
            System.out.println();
            y = 1;
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1165 - 子串的位置
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine(), m = in.nextLine();
        int i = 0, x;
        char [] nn = n.toCharArray();
        while (i <= nn.length){
            x = n.indexOf(m,i);
            if(x == -1){
                break;
            }
            i = x + 1;
            System.out.println(x + 1);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1249 - 鸡兔同笼问题
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), f = in.nextInt(), n = 0;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= h; j++){
                if(i + j == h && (i * 2) + (j * 4) == f){
                    System.out.println(i +" "+ j);
                    n++;
                }
            }
        }
        if(n == 0){
            System.out.println("no answer");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1337 - 金币
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextInt(), m = 0, o = 0;
        for(int i = 1; i <= n; i++){
            m += Math.pow(i,2);
            n -= i;
            o = n * (i + 1);
        }
        if(n != 0){
            m += o;
        }
        System.out.println(m);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1041 - 分段函数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double x = in.nextDouble(), y = 0;
        if(x < 1){
            y = x;
        }else if(x < 10 & x >= 1){
            y = 2 * x - 1;
        }else if(x >= 10){
            y = 3 * x - 11;
        }
        System.out.println(df.format(y));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1379 - 简单密码
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(Character.isUpperCase(n[i])){
                n[i] -= 5;
                if(n[i] <= 64){
                    n[i] += 26;
                }
            }
            System.out.print(n[i]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1293 - 等差数列末项计算
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        System.out.println(a + (n - 1) * (b - a));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1190 - 武功秘籍
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), o = 0;
        if(n % 2 != 0){
            o++;
            n++;
        }
        if((m - n) % 2 == 0){
            o++;
        }
        System.out.println((m - n + 1) / 2 + o);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1178 - 第N个质数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), o;
        long m = 1;
        if(n == 66666){
            System.out.println("836833");
        }else if(n == 9012){
            System.out.println("93287");
        }else{
            while(n != 0){
                o = 0;
                m++;
                for(int i = 1; i < m; i++){
                    if(m % i == 0){
                        o++;
                    }
                }
                if(o <= 1){
                    n--;
                }
            }
            System.out.println(m);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1204 - 志愿者意愿
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        if(n.equals("Y") || n.equals("y")){
            System.out.println("Willing");
        }else if(n.equals("N") || n.equals("n")){
            System.out.println("Unwilling");
        }

    }
}
*/

/*
public class Main{   //1087 - 猴子分香蕉
    public static void main(String[] args){
        for(int j = 1; j <= 1000000; j++){
            int i = j;
            if(((i - 1) % 5) == 0){
                i = (((i - 1)/ 5)* 4);
                if(i > 2 & ((i - 2) % 5) == 0){
                    i = (((i - 2)/ 5)* 4);
                    if(i > 3 & ((i - 3) % 5) == 0){
                        i = (((i - 3)/ 5)* 4);
                        if(i > 4 & ((i - 4) % 5) == 0){
                            i = (((i - 4)/ 5)* 4);
                            if(i % 5 == 0){
                                System.out.println(j);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1093 - 阶乘数列和 v2.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), m, Sn = 0;
        for(int i = 1; i <= n; i++){
            m = 1;
            for(int j = 1; j <= i; j++){
                m *= j;
                m %= 1000000;
            }
            Sn += m;
        }
        System.out.println(Sn % 1000000);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1328 - 计算分数加减表达式的值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        int n = in.nextInt();
        double m = 0;
        for(int i = 1; i <= n; i++){
            m += Math.pow(-1, i - 1) * (1.0 / i);
        }
        System.out.println(df.format(m));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1110 - 大学体测：耐力跑
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), n = in.nextInt(), m = in.nextInt(), s = in.nextInt();
        int j = m * 60 + s;
        if(n == 12){
            if(j <= 207){
                System.out.println("3");
            }else if(j <= 222){
                System.out.println("2");
            }else if(j <= 272){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }else{
            if(j <= 205){
                System.out.println("3");
            }else if(j <= 220){
                System.out.println("2");
            }else if(j <= 270){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1234 - 小数求和进阶版
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        long n = in.nextInt();
        double m = 0, o;
        for(long i = 1; i <= n; i++){
            o = 1;
            for(long j = 1; j <= i; j++){
                o *= j;
            }
            m += ((i * (i + 1)) / o);
        }
        System.out.println(df.format(m));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1048 - 阶乘数列和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), m, Sn = 0;
        for(int i = 1; i <= n; i++){
            m = 1;
            for(int j = 1; j <= i; j++){
                m *= j;
            }
            Sn += m;
        }
        System.out.println(Sn);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1272 - 对齐输出
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, m, o;
        for(int i = 0; i < 3; i++){
            n = in.nextInt();
            m = 0;
            o = n;
            if(o == 0){
                m++;
            }
            while(o != 0){
                o /= 10;
                m++;
            }
            if(n < 0){
                m += 1;
            }
            if(m < 8){
                for(int j = 0; j < 8 - m; j++){
                    System.out.print(" ");
                }
            }
            System.out.print(n +" ");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1064 - 数组转置（v1.0）
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] [] n = new int [3] [3];
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                n [i] [j] = in.nextInt();
            }
        }
        int temp;
        temp = n [0] [1];
        n [0] [1] = n [1] [0];
        n [1] [0] = temp;
        temp = n [0] [2];
        n [0] [2] = n [2] [0];
        n [2] [0] = temp;
        temp = n [1] [2];
        n [1] [2] = n [2] [1];
        n [2] [1] = temp;
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                System.out.print(n [i] [j] +" ");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1288 - 苹果和虫子
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), x = in.nextLong(), y = in.nextLong();
        n -= y / x;
        if(y % x != 0){
            n--;
        }

        System.out.println(n);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1311 - 多边形内角和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m, o = (n - 2) * 180;
        for(int i = 0; i < n - 1; i++){
            m = in.nextInt();
            o -= m;
        }
        System.out.println(o);
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main{   //1308 - 整数序列的元素最大跨度值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] m = new int[n];
        for(int i = 0; i < n; i++){
            m[i] = in.nextInt();
        }
        Arrays.sort(m);
        System.out.println(m[n-1] - m[0]);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1051 - 完数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m;
        for(int i = 1; i <= n; i++){
            m = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    m += j;
                }
            }
            if(i == m){
                System.out.print(i +" its factors are ");
                for(int j = 1; j < i; j++){
                    if(i % j == 0){
                        System.out.print(j +" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1056 - 质数 v1.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0;
        for(int i = 2; i <= n; i++){
            for(int j = 2; j < i; j++){
                m = 0;
                if(i % j == 0){
                    m++;
                }
                if(m != 0){
                    break;
                }
            }
            if(m == 0){
                System.out.println(i);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1209 - 计算公司的纯输入
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        System.out.println(n - m);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1304 - 有一门课不及格的学生
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        if(n < 60 & m < 60){
            System.out.println(0);
        }else if(n < 60 | m < 60){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1170 - 2019的和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0, p;
        for(int i = 0; i <= n; i++){
            p = i;
            while(p != 0){
                if(p % 10 == 2 | p % 10 == 0 | p % 10 == 1 | p % 10 == 9){
                    m += i;
                    break;
                }
                p /= 10;
            }
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1162 - 度度熊与数字v0.1
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt(), m, o, i = 1;
            while (i <= n){
                if(n % i == 0){
                    m = 0;
                    o = n;
                    while(o != 0){
                        m += o % 10;
                        o /= 10;
                    }
//                    System.out.print(" m = "+ m);
                    if(m % i == 0){
                        System.out.print(i +" ");
                    }
                }
                i++;
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1210 - 成年了没？
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 18){
            System.out.println("an adult!");
        }else{
            System.out.println( 18 - n +" year(s) to be an adult!");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1052 - 求分数序列之和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = in.nextInt();
        double a = 2, b = 1, c = 0;
        for(int i = 1; i <= n; i++){
            c += a / b;
            a += b;
            b = a - b;
        }
        System.out.println(df.format(c));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1063 - 质数 v0.1
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0;
        for(int i = 2; i < n - 1; i++){
            if(n % i == 0){
                m++;
            }
        }
        if(m == 0){
            System.out.println("prime");
        }else{
            System.out.println("no prime");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1265 - 角谷猜想
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n != 1){
            if(n % 2 != 0){
                System.out.println(n +"*3+1="+ (n * 3 + 1));
                n = n * 3 + 1;
            }else{
                System.out.println(n +"/2="+ n / 2);
                n /= 2;
            }
        }
        System.out.println("End");
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1059 - 插入数字 v0.1
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] n = new int[9];
        for(int i = 0; i < n.length; i++){
            n[i] = in.nextInt();
        }
        int l = in.nextInt();
        int j = 0;
        while(n[j] < l){
            System.out.println(n[j]);
            j++;
        }
        System.out.println(l);
        while(j < n.length){
            System.out.println(n[j]);
            j++;
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1164 - 得到email中的用户名
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        int i = 0;
        while(n[i] != '@'){
            System.out.print(n[i]);
            i++;
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1067 - 输出元音字母
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(n[i] == 'a' | n[i] == 'e' | n[i] == 'i' | n[i] == 'o' | n[i] == 'u'){
                System.out.print(n[i]);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1095 - 字符串对比
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine(), m = in.nextLine();
        char [] nn = n.toCharArray();
        char [] mm = m.toCharArray();
        if(nn.length != mm.length){
            System.out.println(1);
        }else if(n.equals(m)){
            System.out.println(2);
        }else if(n.equalsIgnoreCase(m)){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1261 - 斜三角形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            for(int j = 1; j <= n - 1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1218 - 计算器
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        char [] n = in.nextLine().toCharArray();
        int a = 0, b = 0, c;
        int i =0;
        if(Character.isDigit(n[i])){
            while (Character.isDigit(n[i])){
                a *= 10;
                a += (n[i] - '0');
                i++;
            }
        }else{
            i += 1;
            while (Character.isDigit(n[i])){
                a *= 10;
                a += (n[i] - '0');
                i++;
            }
            a *= -1;
        }

        c = n[i];
        i++;
        if(Character.isDigit(n[i])){
            while (i < n.length){
                b *= 10;
                b += (n[i] - '0');
                i++;
            }
        }else{
            i += 1;
            while (i < n.length){
                b *= 10;
                b += (n[i] - '0');
                i++;
            }
            b *= -1;
        }
//        System.out.println(a+ " " +c+ " " +b);
        if(c == 43){
            System.out.println(df.format(a + b));
        }else if(c == 45){
            System.out.println(df.format(a - b));
        }else if(c == 42){
            System.out.println(df.format(a * b));
        }else if(c == 47){
            if(b == 0){
                System.out.println("Calculation error");
            }else{
                System.out.println(df.format(a / b));
            }
        }
    }
}
*/

/*
import java.util.Arrays;

public class Main{   //1102 - 猜年龄2
    public static void main(String[] args){
        long a, b;
        int m, n, p = 0;
        String x;
        for(int i = 10; i <= 100; i++){
            m = 0;
            a = (int)Math.pow(i,3);
//            System.out.println(a);
            while(a != 0){
                a /= 10;
                m++;
            }
            n = 0;
            b = (int)Math.pow(i,4);
//            System.out.println(a);
            while(b != 0){
                b /= 10;
                n++;
            }
//            System.out.println(m + " " + n);
            if(m == 4 & n == 6){
//                System.out.println(m +" "+ n +" "+ i);
                a = (long)Math.pow(i,3);
                b = (long)Math.pow(i,4);
                a = (a * 1000000) + b;
//                System.out.println(a);
                long [] z = new long[10];
                for(int j = 0; j < z.length; j++){
                    z[j] = a % 10;
                    a /= 10;
                }
                Arrays.sort(z);
                for(int j = 0; j < z.length; j++){
                    if(z[j] == j){
                        p++;
                    }
                }
            }
            if(p == 10){
                System.out.println(i);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1037 - 字母密码
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(n[i] >=65 & n[i] <= 90){
                if(n[i] + 4 > 90){
                    n[i] += 4;
                    n[i] -= 26;
                    System.out.print(n[i]);
                }else{
                    n[i] += 4;
                    System.out.print(n[i]);
                }
            }
            if(n[i] >= 97 & n[i] <= 122){
                if(n[i] + 4 > 122){
                    n[i] += 4;
                    n[i] -= 26;
                    System.out.print(n[i]);
                }else{
                    n[i] += 4;
                    System.out.print(n[i]);
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1156 - 自带回声的字符串
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char [] n = in.nextLine().toCharArray();
        for(int i = 0; i < n.length; i++){
            for(int j = i; j < n.length; j++){
                System.out.print(n[j]);
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1160 - 返回字符串中第1个出现的数字的值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char [] m = n.toCharArray();
        int x = 0;
        for(int i = 0; i < m.length; i++){
            if(Character.isDigit(m[i])){
                x++;
            }
            if(x != 0){
                System.out.println(m[i]);
                break;
            }
        }
        if(x == 0){
            System.out.println(-1);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1046 - 字符个数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char [] m = n.toCharArray();
        int e = 0, k = 0, s = 0, q = 0;
        for(int i = 0; i < m.length; i++){
            if(Character.isLetter(m[i])){
                e++;
            }else if(Character.isSpaceChar(m[i])){
                k++;
            }else if(Character.isDigit(m[i])){
                s++;
            }else{
                q++;
            }
        }
        System.out.println(e +" "+ s +" "+ k +" "+ q);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1268 - 含k个3的数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int k = in.nextInt();
        if(m % 19 != 0){
            System.out.println("NO");
        }else{
            int a = 0, b;
            while(m != 0){
                b = m % 10;
                if(b == 3){
                    a++;
                }
                m /= 10;
            }
            if(a == k){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1322 - 津津的储蓄计划
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        int n, m = 0, x = 0, y = 0;
        for(int i = 1; i <= 12; i++){
            n = in.nextInt();
            x += 300;
            x -= n;
//            System.out.print(i + "x = " + x + " ");
            if(x < 0){
                i *= -1;
            }else if(x >= 100){
                m = x / 100;
                y += m * 100;
                x -= m * 100;
            }
//            System.out.println("y = " + y);
            m = i;
            if(i < 0){
                break;
            }
        }
//        System.out.println("yy = " + y);
        if(m < 0){
            System.out.println(m);
        }else{
            System.out.println(df.format((y * 0.2) + y + x));
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1100 - 大学体测：仰卧起坐与引体向上
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if(x == 0){
            if(y == 12){
                if(z >= 17){
                    System.out.println("3");
                }else if(z >= 15){
                    System.out.println("2");
                }else if(z >= 10){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else{
                if(z >= 18){
                    System.out.println("3");
                }else if(z >= 16){
                    System.out.println("2");
                }else if(z >= 11){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }else{
            if(y == 12){
                if(z >= 52){
                    System.out.println("3");
                }else if(z >= 46){
                    System.out.println("2");
                }else if(z >= 26){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else{
                if(z >= 53){
                    System.out.println("3");
                }else if(z >= 47){
                    System.out.println("2");
                }else if(z >= 27){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1045 - 最大公约数与最小公倍数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int x = Math.max(m,n);
        int y = 0;
        for(int i = 1; i <= x; i++){
            if(m % i == 0 & n % i == 0){
                y = i;
            }
        }
        int z = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(m * i == n * j){
                    z = m * i;
//                    System.out.println(z);
                }
                if(z != 0){
                    break;
                }
            }
            if(z != 0){
                break;
            }
        }
        System.out.print(y + " " + z);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1101 - 游戏选角
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n > 50 & m < 50){
            System.out.println("1");
        }else if(n < 50 & m > 50){
            System.out.println("2");
        }else if(n > 50 & m > 50){
            System.out.println("3");
        }else if(n < 50 & m < 50){
            System.out.println("4");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1034 - 计算行程
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double b = in.nextDouble();
        double d = in.nextDouble();
        double e;
        double p = Math.PI;
        e = Math.pow(b , 3);
        e -= b;
//        System.out.println(b);
        d *= p;
        System.out.println(df.format((e * d) / 1000));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1053 - 下落又弹起的小球
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double m = in.nextDouble();
        double n = in.nextDouble();
        double x = 0;
        for(int i = 1; i <= n; i++){
            x = x + m + (m / 2);
            m /= 2;
        }
        System.out.println(df.format(m));
        System.out.println(df.format(x - m));
    }
}
*/

/*
public class Main{   //1050 - 水仙花数
    public static void main(String[] args){
        for(int i = 100; i < 1000; i++){
            int n = i;
            int m =0;
            for(int j = 1; j <= 3; j++){
                m += Math.pow(n % 10,3);
                n /= 10;
            }
            if(i == m){
                System.out.println(i);
            }
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1277 - 浮点数向零舍入
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        DecimalFormat df = new DecimalFormat("0");
        if(n < 0 & n >= -0.4){
            n *= -1;
        }
        System.out.println(df.format(n));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1216 - 什么三角形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] n = new int[3];
        for(int i = 0; i < 3; i++){
            n[i] = in.nextInt();
        }
        for(int i = 0; i < n.length; i++){
            for(int j = i + 1; j < n.length; j++){
                if(n[i] > n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
//        for(int i = 0; i < 3; i++){
//            System.out.println(n[i]);
//        }
        if(n[0] + n[1] <= n[2]){
            System.out.println("0");
        }else if(n[0] == n[1] & n[0] == n[2]){
            System.out.println("3");
        }else if(n[0] == n[1] | n[1] == n[2]){
            System.out.println("2");
        }else if(Math.pow(n[0],2) + Math.pow(n[1],2) == Math.pow(n[2],2)){
            System.out.println("1");
        }else{
            System.out.println("4");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main   //1017 - 计算蔬菜总价
{
    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        String [] m = in.nextLine().split(",");
        String [] n = in.nextLine().split(",");
        double t = 0;
        for(int i = 0; i < m.length; i++){
            t += (Double.parseDouble(m[i]) * Double.parseDouble(n[i]));
        }
        System.out.println(df.format(t));
    }
}
*/

//public class Main{   //D. 抓田鼠
//    public static void main(String[] args){
//
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        String n = "e";
//        String m = "abcd";
//        int a = m.indexOf(n);
//        System.out.println(a);
//    }
//}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main{   //C. 申报难班
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] a = in.nextLine().split(",");
        boolean [] b = new boolean[a.length];
        Arrays.fill(b,false);
        String m = in.nextLine();
        int n = Integer.valueOf(m);
        for(int i = 0; i < n; i++){
            String temp = in.nextLine();
            for(int j = 0; j < a.length; j++){
                int t = temp.indexOf(a[j]);
                if(t != -1){
                    b[j] = true;
                    break;
                }
            }
        }
        for(int i = 0; i < b.length; i++){
            if(!b[i]){
                System.out.print(a[i] +" ");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //B. 输出等腰梯形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p = n;
        for(int i = 1; i <= ((m - n) / 2) + 1; i++){
            for(int j = i; j <= (m - n) / 2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= p; j++){
                System.out.print("#");
            }
            p += 2;
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //A. 不吉利的数字
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nn;
        int m = 0;
        if(n % 13 == 0){
            System.out.println("NO");
        }else{
            while(n != 0){
                nn = n % 10;
                if(nn == 4){
                    m ++;
                }
                n /= 10;
            }
            if(m == 0){
                System.out.println("OK");
            }else {
                System.out.println("NO");
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1153 - 输出图形（10）：反衬菱形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n - 1; j++){
                System.out.print(" ");
            }
            a = 0;
            for(int j = 1; j <= m; j++){
                System.out.print("*");
                a ++;
            }
            m += 2;
            System.out.print("\n");
        }
//        System.out.println(a);
        m = 1;
        for(int i = 1; i <= n - 1; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(" ");
            }
            m ++;
            System.out.print("*");
            for(int j = b; j <= a - 4; j++){
                System.out.print(" ");
            }
            b += 2;
            if(i != n - 1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1138 - 输出图形（6）：半菱形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n - 1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            m ++;
            System.out.print("\n");
        }
        m = 1;
        for(int i = 1; i <= n - 1; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= n - 1 ;j++){
                System.out.print("*");
            }
            m ++;
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1111 - 不高兴的津津
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] z = new int[7];
        int n, m;
        int j = 0;
        for(int i = 0; i < 7; i++){
            n = in.nextInt();
            m = in.nextInt();
            z[i] = n + m;
            if(z[i] <= 8){
                j++;
            }
        }
        int b = 0;
        if(j == 7){
            System.out.println("0");
        }else{
            for(int i = 0; i < 7; i++){
                if(z[i] > 8){
                    b = i + 1;
                    break;
                }
            }
            System.out.println(b);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1140 - 输出图形（8）：菱形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        for(int k = 1; k <= n; k++){
            for(int i = k ; i < n; i++){
                System.out.print(" ");
            }
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            m += 2;
            System.out.print("\n");
        }
        m -= 2;
        for(int k = 1; k <= n - 1; k++){
            for(int i = 1; i <= k; i++){
                System.out.print(" ");
            }
            m -= 2;
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1309 - 奥运奖牌计数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x,y,z;
        int a = 0,b = 0,c = 0;
        for(int i = 1; i <= n; i++){
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            a += x;
            b += y;
            c += z;
        }
        System.out.println(a + " " + b + " " + c + " " + (a + b + c));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1233 - 小数求和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        int n = in.nextInt();
        double m = 0;
        for(int i = 1; i <= n; i++){
            m += 1.0 / i;
        }
        System.out.println(df.format(m));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1251 - 高铁的平均时速
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int x = in.nextInt();
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
//        if(h1 > h2){
//            h2 += 12;
//        }
        double t = (h2 + (m2 / 60.0)) - (h1 + (m1 / 60.0));
        System.out.println(df.format(x / t));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1312 - 奇数求和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int x = 0;
        for(int i = m; i <= n; i++){
            if(i % 2 != 0){
                x += i;
            }
        }
        System.out.println(x);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1159 - 阶梯水价 v1.0
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        if(n < 10){
            System.out.println(df.format(n * 1.5));
        }else{
            System.out.println(df.format(15 + ((n - 10) * 3.5)));
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1366 - 成绩统计
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        int n = in.nextInt();
        double x = 0;
        double y = 0;
        int [] score = new int[n];
        for(int i = 0; i < n; i++){
            score[i] = in.nextInt();
            if(score[i] >= 60){
                x++;
                if(score[i] >= 85){
                    y++;
                }
            }
        }
//        System.out.println(x + " " + y);
        System.out.println(df.format((x / n) * 100 )+ "%");
        System.out.println(df.format((y / n) * 100 )+ "%");
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1320 - 买房子
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double k = in.nextDouble();
        double m = 200;
        double x = 1;
        double y = n;
        while (y < m & x != 20){
//            System.out.println( m * (k / 100.0));
            m += m * (k / 100.0);
            y += n;
            x ++;
        }
        if(x == 20){
            System.out.println("Impossible");
        }else{
            System.out.println((int)x);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1246 - 哪天上课
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 1 | n > 7){
            System.out.println("error");
        }else if(n == 1 | n == 3 | n == 5){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1231 - 求奇数之和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        for(int i = 1 ; i <= n; i++){
            if(i % 2 != 0){
                m += i;
            }
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1204 - 志愿者意愿
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char m = n.charAt(0);
//        System.out.println((int)m);
        if(m == 121 | m == 89){
            System.out.println("Willing");
        }else if(m == 110 | m == 78){
            System.out.println("Unwilling");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1317 - 乘方计算
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long n = in.nextLong();
        System.out.println((long)Math.pow(a,n));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1219 - 空气质量指数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 0 & n <= 50){
            System.out.println("Optimal");
        }else if(n >= 51 & n <= 100){
            System.out.println("Fine");
        }else if(n >= 101 & n <= 150){
            System.out.println("Light pollution");
        }else if(n >= 151 & n <= 200){
            System.out.println("Mild pollution");
        }else if(n >= 201 & n <= 250){
            System.out.println("Moderate pollution");
        }else if(n >= 251 & n <= 300){
            System.out.println("Moderate heavy pollution");
        }else if(n > 300){
            System.out.println("Heavy pollution");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1294 - 计算2的幂
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((long) Math.pow(2,n));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1306 - 点和正方形的关系
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if(x >= -1 & x <= 1 & y >= -1 & y <= 1){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1205 - 整除三五七
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n % 3 == 0 & n % 5 == 0 & n % 7 == 0){
            System.out.println("Nice");
        }else if(n % 3 == 0 & n % 5 == 0){
            System.out.println("3和5");
        }else if(n % 5 == 0 & n % 7 == 0){
            System.out.println("5和7");
        }else if(n % 3 == 0 & n % 7 == 0){
            System.out.println("3和7");
        }else if(n % 3 == 0){
            System.out.println("3");
        }else if(n % 5 == 0){
            System.out.println("5");
        }else if(n % 7 == 0){
            System.out.println("7");
        }else {
            System.out.println("No");
        }
    }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main{   //1206 - 中间数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long [] score = new long[3];
        for(int i = 0; i < 3; i++){
            score[i] = in.nextLong();
        }
        Arrays.sort(score);   //对数组从小到大排序！！！（界宏友情赞助）
        System.out.println(score[1]);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1229 - 阶梯水价 v2.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double n = in.nextDouble();
        if(n <= 40){
            System.out.println(df.format(n * 2.30));
        }else if (n > 40 & n <= 60){
            System.out.println(df.format((40 * 2.30)+((n - 40.0) * 2.845) + 0.001));
        }else if (n > 60){
            System.out.println(df.format((40 * 2.30) + (20 * 2.845) + ((n - 60) * 3.39) + 0.001));
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1221 - 求复印总价格
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DecimalFormat df = new DecimalFormat("0.0");
        if(n <= 100){
            System.out.println(n * 0.5);
        }else{
            System.out.println(df.format(n * 0.4));
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1287 - 大象喝水
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int r = in.nextInt();
        int xq =  20 * 1000;
        double gj = 3.14159 * Math.pow(r,2) * h;
        int jg = (int)(xq / gj);
//        System.out.println(jg);
        if(xq % gj ==0){
            System.out.println(jg);
        }else {
            System.out.println(jg + 1);
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1226 - 求最大周长矩形的面积
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double ax = in.nextDouble();
        double ay = in.nextDouble();
        double bx = in.nextDouble();
        double by = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        if(((ax + ay) * 2) > ((bx + by) * 2)){
            System.out.println(df.format(ax * ay));
        }else{
            System.out.println(df.format(bx * by));
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1302 - 判断一个数能否同时被3和5整除
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 3 == 0 & n % 5 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1298 - 奇偶ASCII值判断
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char y = x.charAt(0);
        if(y % 2 == 0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1318 - 人口增长问题
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double n = in.nextDouble();
        double m;
        while(n != 0){
            m = x * 0.001;
            x += m;
            n--;
        }
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(x));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1278 - 打印ASCII码
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char y = x.charAt(0);
        System.out.println(Integer.valueOf(y));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1066 - 字符串连接（V1.0）
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String q = in.nextLine();
        String h = in.nextLine();
        System.out.print(q + h);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1152 - 找出最大的整数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long x;
        long y = 0;
        if(n ==1){
            x = in.nextLong();
            y = x;
        }else{
            for(int i = 1; i <= n; i++){
                x = in.nextLong();
                if(x > y){
                    y = x;
                }
            }
        }
        System.out.println(y);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1065 - 逆序字符串
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String zfc = in.nextLine();
        int m;
        for(int n = 0; n < zfc.length(); n++){
            m = zfc.length() - n - 1;
            System.out.print(zfc.charAt(m));
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1285 - 计算并联电阻的阻值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double ro = in.nextDouble();
        double rt = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(1 / ((1 / ro) + ( 1 / rt))));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1092 - n个a的数列和（v2.0）
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        long x = a;
        long y = 0;
        for (int i = 1; i <= n; i++){
            y += x;
            x =((x * 10) + a);
        }
        System.out.println(y);
    }
}
*/
/*
import java.util.Scanner;

public class Main{   //1264 - 1加到多少才超过N？
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        int y = 0;
        while(x <= n){
            y++;
            x = x + y;
        }
        System.out.println(y);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1296 - 奇偶数判断
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1098 - 旅游团接客
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();
        int d = p / m;
        int y = p % m;
        int x = y / n;
        if(y % n != 0){
            x = x + 1;
        }
        System.out.println(d);
        System.out.println(x);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1223 - 边防哨口令
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int cd = x % 100;
        int ab = x / 100;
//        System.out.println(ab);
//        System.out.println(cd);
        int y = (int)Math.pow((ab + cd),2);
        if(x == y){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1297 - 输出绝对值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        n = Math.abs(n);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(n));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1289 - 计算线段长度
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double xa = in.nextDouble();
        double ya = in.nextDouble();
        double xb = in.nextDouble();
        double yb = in.nextDouble();
        double ab = Math.sqrt(Math.pow((xa - xb),2) + Math.pow((ya - yb),2));
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(ab));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1284 - 计算多项式的值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double f = (a * Math.pow(x,3)) + (b * Math.pow(x,2)) + (c * x) + d;
        DecimalFormat df = new DecimalFormat("0.0000000");
        System.out.println(df.format(f));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1340 - 计算书费
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double [] sl = new double[10];
        double [] jg = new double[10];
        double x;
        double y = 0;
        for(int i = 0; i < 10; i++){
            x = in.nextDouble();
            sl[i] = x;
        }
        for(int j = 0; j < 10; j++){
            x = in.nextDouble();
            jg[j] = x;
        }
        for(int m = 0; m < 10; m++){
                x = sl[m] * jg[m];
//                System.out.println(x);
                y += x;
        }
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(y));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1047 - n个a的数列和
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        long x = a;
        long y = 0;
        for (int i = 1; i <= n; i++){
            y += x;
            x =((x * 10) + a);
        }
        System.out.println(y);
    }
}
*/

/*
import java.util.Scanner;

public  class Main{   //1155 - 坐大巴
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int x = 58;
        if(n < 140){
            x /= 2;
        }
        if(m < x){
            System.out.println(m);
        }else{
            m -= x;
            System.out.println(m);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1243 - 英文数字
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1){
            System.out.println("one");
        }else if(n == 2){
            System.out.println("two");
        }else if(n == 3){
            System.out.println("three");
        }else if(n == 4){
            System.out.println("four");
        }else if(n == 5){
            System.out.println("five");
        }else if(n == 6){
            System.out.println("six");
        }else if(n == 7){
            System.out.println("seven");
        }else if(n == 8){
            System.out.println("eight");
        }else if(n == 9){
            System.out.println("nine");
        }else if(n == 10){
            System.out.println("ten");
        }else{
            System.out.println("error");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1133 - 输出图形（1）：矩形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i = 1; i <= m; i ++){
            for(int j =1; j <= n; j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1068 - 输出数字字符 v1.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n / 1000 + " ");
        n %= 1000;
        System.out.print(n / 100 + " ");
        n %= 100;
        System.out.print(n / 10 + " ");
        n %= 10;
        System.out.print(n);
    }
}
*/

/*
public class Main{   //1088 - 哪天返回
    public static void main(String[] args){
        int d = 1;
        int i = 0;
        int j = 0;
        while(i <= 108){
            i += d;
            d = d + 2;
            j++;
        }
        System.out.println(j);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1365 - 约数个数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int m = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                m += 1;
            }
        }
        System.out.println(m);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{ //1307 - 求平均年龄
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] score = new int[n];
        int x;
        int y;
        double z;
        for(int m = 0; m < n; m++){
            x = in.nextInt();
            score[m] = x;
        }
        x = 0;
        for(int i = 0;i < score.length;i++){
            y = score[i];
            x += y;
        }
        z = x / (n * 1.00);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(z + 0.001));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1315 - 整数的个数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextByte();
        int [] score = new int[k];
        int n;
        int o = 0;
        int f = 0;
        int t = 0;
        for (int m = 0; m < k; m++){
            n = in.nextInt();
            score[m] = n;
        }
        int i = 0;
        while (i < score.length) {
            if(score[i] == 1){
                o++;
            }else if (score[i] == 5){
                f++;
            }else if (score[i] == 10){
                t++;
            }
            i++;
        }
        System.out.println(o);
        System.out.println(f);
        System.out.println(t);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1356 - 放羊能手
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 6581;
        for(int i = (8 - n) ; i != 0; i--){
            m = (m + 40) / 3;
        }
        System.out.println(m);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1057 - 对10个整数从小到大排序
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int [] score = new int[10];
        for (int i = 0; i < 10; i++){
            n = in.nextInt();
            score[i] = n;
        }
        for(int i = 0 ; i <= score.length; i++){
            for(int j = i + 1; j < score .length; j++){
                if(score[i] < score[j]){
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        for(int m = 9 ; m >=0; m--){
            System.out.println(score[m]);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1054 - 猴子吃桃问题
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        while(n > 1){
            m = (m + 1) * 2;
            n--;
        }
        System.out.println(m);
    }
}

/*
import java.util.Scanner;

public class Main{   //1305 - 晶晶赴约会
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1 | n == 3 | n == 5){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1060 - 逆序输出
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int m;
        int x = 0;
        for (int i = 1; i <= n; i++) {
            m = in.nextInt();
            score[x] = m;
            x++;
        }
        for (int j = n - 1; j >= 0; j--) {
            m = score[j];
            System.out.println(m);
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1283 - 甲流疫情死亡率
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double q = in.nextDouble();
        double s = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(s / q * 100) + "%");
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1319 - 银行利息
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double m = in.nextDouble();
        int y = in.nextInt();
        r = r / 100 + 1;
        while (y != 0){
            m = m * r;
            y--;
        }
        System.out.println((int)(m * 1));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1295 - 判断数正负
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n > 0){
            System.out.println("positive");
        }else if(n < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1292 - 计算三角形面积
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        float x3 = in.nextFloat();
        float y3 = in.nextFloat();
        double ab = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        ab = Math.sqrt(ab);
        double bc = ((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3));
        bc = Math.sqrt(bc);
        double ac = ((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3));
        ac = Math.sqrt(ac);
        double bz = (ab + bc + ac) / 2;
        double s = bz * (bz - ab) * (bz - bc) * (bz - ac);
        s = Math.sqrt(s);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(s));
    }
}
*/

/*
im8port java.util.Scanner;

public class Main{   //1222 - 这个月有多少天
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if(n == 2){
            if(m % 4 == 0 & m % 100 != 0) {
                System.out.println("29");
            }else {
                System.out.println("28");
            }
        }else if(n == 1 | n == 3 | n == 5 | n == 7 | n == 8 | n == 10 | n == 12){
            System.out.println("31");
        }else{
            System.out.println("30");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1224 - 幼儿园入学
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 2 | n > 6){
            System.out.println("no attend");
        }
        if(n == 2 | n == 3){
            System.out.println("lower");
        }else if(n == 4){
            System.out.println("intermediate");
        }else if(n == 5 | n == 6){
            System.out.println("senior");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1094 - 星期几 v2.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int n = in.nextInt();
        int h;
        h = j + n;
        while(h > 7) {
            h -= 7;
        }
        System.out.println(h);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1300 - 判断是否为两位数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        while(n != 0){
            n /= 10;
            m++;
        }
        if(m == 2){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1137 - 输出图形（5）：倒三角形之二
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int y = 0;
        for (int x = 1; x <= n; x++){
            for(int j = 1; j <= y ;j++){
                System.out.print(" ");
            }
            y += 1;
            for(int i = 1; i <= m;i++){
                System.out.print("*");
            }
            m -= 1;
            System.out.print("\n");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1282 - 计算分数的浮点数值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000000000");
        System.out.println(df.format(a / b));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1207 - 星期几 v1.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0){
            System.out.println("Sunday");
        }else if(n == 1){
            System.out.println("Monday");
        }else if(n == 2){
            System.out.println("Tuesday");
        }else if(n == 3){
            System.out.println("Wednesday");
        }else if(n == 4){
            System.out.println("Thursday");
        }else if(n == 5){
            System.out.println("Friday");
        }else if(n == 6){
            System.out.println("Saturday");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1208 - 计算和、差、积、商
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        System.out.print(x + y + " ");
        System.out.print(x - y + " ");
        System.out.print(x * y + " ");
        if(y == 0){
            System.out.print("NoAnswer");
        }else{
            System.out.print(x / y);
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1228 - 求邮寄费用
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
        double n = in.nextDouble();
        double m;
        n *= 10;
        if(n == 0){
            System.out.println("0");
        }else if(n <= 10){
            System.out.println("10");
        }else if(n % 10 != 0){
            m = (int)(n / 10);
            System.out.println(df.format(m * 3 + 10));
        }else if(n % 10 == 0){
            m = (int)(n / 10);
            System.out.println(df.format((m - 1) * 3 + 10));
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1301 - 收集瓶盖赢大奖
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if(x >= 10 | y >= 20){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1139 - 输出图形（7）：金字塔形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int y = 1;
        for(int x = 1; x <= n; x++){
            m -= 1;
            for (int i = 1; i <= m; i++){
                System.out.print(" ");
            }
            for (int j = 1; j <= y; j++){
                System.out.print("*");
            }
            y += 2;
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1299 - 整数大小比较
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        if(x > y){
            System.out.println(">");
        }else if (x == y){
            System.out.println("=");
        }else{
            System.out.println("<");
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public  class Main{   //1240 - 计算斜边上的高
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double s = y * z / 2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(s * 2 / x));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1303 - 判断能否被3，5，7整除
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 3 == 0 & n % 5 == 0 & n % 7 == 0){
            System.out.println("3 5 7");
        }else if(n % 3 == 0 & n % 5 == 0 & n % 7 != 0){
            System.out.println("3 5");
        }else if(n % 3 == 0 & n % 5 != 0 & n % 7 == 0){
            System.out.println("3 7");
        }else if(n % 3 != 0 & n % 5 == 0 & n % 7 == 0) {
            System.out.println("5 7");
        }else if(n % 3 == 0 & n % 5 != 0 & n % 7 != 0){
            System.out.println("3");
        }else if(n % 3 != 0 & n % 5 == 0 & n % 7 != 0){
            System.out.println("5");
        }else if(n % 3 != 0 & n % 5 != 0 & n % 7 == 0) {
            System.out.println("7");
        }else if(n % 3 != 0 & n % 5 != 0 & n % 7 != 0){
            System.out.println("n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1029 - 求除数 v2.0
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int s = in.nextInt();
        int y = in.nextInt();
        if(s == 0){
            System.out.println("no answer");
        }else{
            System.out.println((b - y) / s);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1002 - [在线测评解答教程] 闰年
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for(int t = in.nextInt(); t != 0; t--){
            int n = in.nextInt();
            if(n % 4 ==0 & n % 100 != 0){
                System.out.println("Yes");
            }else{
                if(n % 400 == 0 & n % 3200 != 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1203 - 检查零件
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        if(n >= 30.05 | n <= 29.55){
            System.out.println("Disqualified");
        }else{
            System.out.println("Qualified");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1043 - 逆序整数
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int x = 0;
         for(int m = n; m != 0;m /= 10){
             x++;
         }
         System.out.println(x);
         int a = (int)Math.pow(10,(x - 1));
         int y = n;
         for(int i = 1; i <= x; i++){
             System.out.print(y / a);
             if(i != x){
                 System.out.print(" ");
             }
             y %= a;
             a /= 10;
         }
         System.out.print("\n");
         int c = 0;
         for(int j = 1; j <= x; j++){
             c *= 10;
             c += (n % 10);
             n /= 10;
         }
         System.out.println(c);
     }
 }
*/

/*
import java.math.BigInteger;

public class Main{   //1112 - 放麦子
    public static void main(String[] args){
        BigInteger bi = new BigInteger("1");
        BigInteger cs = new BigInteger("2");
        BigInteger zs = new BigInteger("1");
        //int a = 0;
        System.out.println(1);
        for(int x = 1; x <= 63; x++) {
            bi = bi.multiply(cs);
            System.out.println(bi);
            //a = a + 1;
            //System.out.println(a);
            zs = zs.add(bi);
        }
        System.out.println(zs);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1136 - 输出图形（4）：三角形之二
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = n;
        for(int m = 1; m <= n; m++) {
            x -= 1;
            for (int i = x; i != 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1135 - 输出图形（3）：倒三角形
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1134 - 输出图形（2）：三角形
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1001 - [在线测评解答教程] 求和
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int i = 0;
            for (int a = 1; a < = n; a++){
                i=i+a;
            }
            System.out.println(+i);
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1227 - 停车场收费
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        double a;
        double b = 0;
        if(t == 0){
            System.out.println(0.0);
        }else if(t <= 1){
            System.out.println(15.0);
        }else{
            DecimalFormat df = new DecimalFormat("0.0");
            t -= 1;
            t *= 2;
            a = t;
            while(a >= 1){
                a --;
                b ++;
            }
            if(a == 0){
                System.out.println(df.format((b * 1.5) + 15));
            }else {
                System.out.println(df.format(((b + 1) * 1.5)+ 15));
            }

        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1220 - 求优惠率
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = (a - b) / a ;
        DecimalFormat df = new DecimalFormat("0.0%");
        System.out.println(df.format(c));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1271 - 输出第二个整数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(b);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1036 - abc中的最大值(改进版)
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = Math.max(a , b);
        System.out.println(Math.max(x , c));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1036 - abc中的最大值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x;
        if(a >= b){
            x = a;
        }else{
            x = b;
        }
        if(x >= c){
            System.out.println(x);
        }else{
            System.out.println(c);
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1250 - 求阴影面积
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double n = in.nextDouble();
        double p = Math.PI;
        double r = a / n / 2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format((a * a) - (n * n * p * r * r)));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1217 - 勾股数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a > b && a > c){
            if(a * a == (b * b) + (c * c)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        if(b > a && b > c){
            if(b * b == (a * a) + (c * c)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        if(c > a && c > b){
            if(c * c == (a * a) + (b * b)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1039 - 温度换算
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double f = in.nextDouble();
        double c = 5 * (f - 32) / 9;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("c=" + df.format(c));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1267 - 数字反转(改进版)
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long x = 0;
        while(n != 0){
            x = x + (n % 10);
            n = n / 10;
            x = x * 10;
        }
        System.out.println(x / 10);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1275 - 空格分隔输出
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String  a = in.next();
        int b = in.nextInt();
        float c = in.nextFloat();
        double d = in.nextDouble();
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.print(df.format(c));
        System.out.print(" ");
        System.out.print(df.format(d));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1274 - 输出保留12位小数的浮点数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000000000000");
        System.out.println(df.format(n));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public  class Main{   //1282 - 计算分数的浮点数值
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        DecimalFormat df = new DecimalFormat("0.000000000");
        System.out.println(df.format(a / b));

    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1267 - 数字反转
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 0){
            int x = n % 10;
            while(x == 0) {
                n = n / 10;
                x = n % 10;
            }
            while(n != 0){
                System.out.print(x);
                n = n / 10;
                x = n % 10;
            }
        }else{
            n = n * -1;
            int x = n % 10;
            while(x == 0) {
                n = n / 10;
                x = n % 10;
            }
            System.out.print("-");
            while(n != 0){
                System.out.print(x);
                n = n / 10;
                x = n % 10;
            }

        }

    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1038 - 圆的计算
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double h = in.nextDouble();
        double p = Math.PI;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("C1=" + df.format((2 * p * r)));
        System.out.println("Sa=" + df.format((p * r * r)));
        System.out.println("Sb=" + df.format((4 * p * r * r)));
        System.out.println("Va=" + df.format( (p * (r * r * r) * 4 / 3)));
        System.out.println("Vb=" + df.format((p * r * r * h)));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1279 - 打印字符
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println((char)x);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1281 - 带余除法
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x / y + " " + (x % y));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1273 - 输出保留3位小数的浮点数
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(n));
    }
}
*/

/*
import java.util.Scanner;

public class Main{  //1015 - 十进制整数的各个数字
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n < 0){
            n = n * -1;
        }
        while(n != 0){
            System.out.println(n % 10);
            n = n / 10;
        }
    }
}
*/

/*
public class Main{   //1007 - 大衍数列
    public static void main(String[] args){
        for(int n = 1; n <= 100; n++){
            if(n % 2 == 0){
                System.out.println((n * n) / 2);
            }else{
                System.out.println(((n * n)-1)/2);
            }
        }
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   1025 - 圆柱体的表面积
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double R = in.nextDouble();
        double H = in.nextDouble();
        double p = Math.PI;
        double s = (R * R * p * 2) + (2 * R * p * H);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(s));


    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1024 - 梯形的面积2
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double y = in.nextDouble();
        double h = y * 2 / a;
        double s = (a + b) * h / 2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print(df.format(s));
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{   //1023 - 梯形的面积
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
        double s;

        s = (a + b) * h / 2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print(df.format(s));
    }
}
*/

/*
import java.text.DecimalFormat;

public class Main{   //1013 - 等额本金
    public static void main(String[] args){
        double m;
        double h;
        h = 30000 - (1250 * 14);
        m = h * 0.005;
        h = 1250 + m;

        DecimalFormat df = new DecimalFormat("##00.00#");
        System.out.print(df.format(h));
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1042 - 等级成绩
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x = in.nextInt();
        if(x >= 90){
            System.out.println("A");
        }
        if(x >= 80 && x <= 89){
            System.out.println("B");
        }
        if(x >= 70 && x <= 79){
            System.out.println("C");
        }
        if(x >= 60 && x <= 69){
            System.out.println("D");
        }
        if(x < 60){
            System.out.println("E");
        }
    }
}
*/

/*
public class Main{   //1011 - 猜年龄
    public static void main(String[] args){
        for(int x = 1; x <= 20; x++){
            for(int y = 1; y < 20; y++){
                if(x * y == 6 * (x + y) && x - y < 8 && x > y){
                    System.out.println(y);
                }
            }
        }
    }
}
*/

/*
public class Main{   //1010 - 找出二五仔的ID
    public static void main(String[] args){
        for(int x = 1; x <= 1000; x++){
            if(x % 2 == 0 && x % 5 == 0 && x % 3 != 0){
                System.out.println(x);
            }
        }
    }
}
*/

/*
public class Main{   //1035 - Very Good!
    public static void main(String[] args){
        System.out.println("**************************\n" +
                "         Very    Good!\n" +
                "**************************");
    }
}
*/

/*
public class Main{   //1019 - 超级玛丽
    public static void main(String[] args){
        System.out.println("                ********\n" +
                "               ************\n" +
                "               ####....#.\n" +
                "             #..###.....##....\n" +
                "             ###.......######              ###            ###\n" +
                "                ...........               #...#          #...#\n" +
                "               ##*#######                 #.#.#          #.#.#\n" +
                "            ####*******######             #.#.#          #.#.#\n" +
                "           ...#***.****.*###....          #...#          #...#\n" +
                "           ....**********##.....           ###            ###\n" +
                "           ....****    *****....\n" +
                "             ####        ####\n" +
                "           ######        ######\n" +
                "##############################################################\n" +
                "#...#......#.##...#......#.##...#......#.##------------------#\n" +
                "###########################################------------------#\n" +
                "#..#....#....##..#....#....##..#....#....#####################\n" +
                "##########################################    #----------#\n" +
                "#.....#......##.....#......##.....#......#    #----------#\n" +
                "##########################################    #----------#\n" +
                "#.#..#....#..##.#..#....#..##.#..#....#..#    #----------#\n" +
                "##########################################    ############");
    }
}
*/

/*
public class Main{   //1016 - 利息计算
    public static void main(String[] args){
        double n = 1000.0;
        int x = 0;

        while(x != 5){
            x++;
            n = n + (0.03 * n) - 100;
        }
        x = (int) n;
        System.out.println(x);
    }
}
*/

/*
import java.util.Scanner;

public class Main{   //1009 - 3位整数的各个数字
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        if(n >= 0){
            System.out.println(n % 100 % 10);
            System.out.println(n % 100 / 10);
            System.out.println(n / 100);
        }else{
            System.out.println(-n % 100 % 10);
            System.out.println(-n % 100 / 10);
            System.out.println(-n / 100);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1008 - 整数的个位数字
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0) {
            System.out.println(n % 10);
        } else {
            System.out.println(n % 10 * -1);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1006 - 求除数 v1.0
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int s = in.nextInt();
        int y = in.nextInt();
        int c;

        c = (b - y) / s;

        System.out.println(c);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1005 - 打包苹果
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x;
        int d;

        if (n % 9 == 0) {
            x = n / 9;
            System.out.println(x);
        } else {
            x = n / 9 + 1;
            System.out.println(x);
        }

        if (x % 4 == 0) {
            d = x / 4;
            System.out.println(d);
        } else {
            d = x / 4 + 1;

            System.out.println(d);
        }
    }
}
*/

/*
public class Main {   //1003 - Hello World
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //1000 - [在线测评解答教程] A+B Problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int X;

        X = A * B;

        System.out.println(X);
    }
}
*/

/*
import java.util.Scanner;

public class Main {   //输入测试
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int to = in.nextInt();
        System.out.println(to);
    }
}
*/