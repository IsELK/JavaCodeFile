package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

//         >>code by ELK<<

public class ZuoYe20210425      //2021年4月25日课堂作业
{
    public static void main(String[]args)
    {
        System.out.print("请输入第一个多项式数组(以空格为间隔):\n");
        int [] m = InPut();
        System.out.print("请输入第二个多项式数组(以空格为间隔):\n");
        int [] n = InPut();
        System.out.print("您输入的两个多项式数组为:\n");
        System.out.print("1:"+ Arrays.toString(m)+" 2:"+Arrays.toString(n)+"\n");
        int Max = m.length + n.length;
        int [] o = new int[Max + 1];
        for(int i = 2; i < m.length; i+=2)
        {
            o[m[i]] += m[i-1];
            o[n[i]] += n[i-1];
        }
        System.out.print(Arrays.toString(o));
    }

    public static int[] InPut()   //输入顺序表，其中已处理用户输入多空格的问题
    {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int x = t.indexOf("  ");   //搜索有两个空格的位置，没有则返回-1并不会进入循环
        while (x != -1)   //循环处理有两个空格的地方
        {
            t = t.substring(0,x) + t.substring(x+1);   //检测到两个空格后，把多的空格前面的字符串和后面的字符串拼接在一起
            x = t.indexOf("  ");   //继续搜索有两个空格的位置
        }
        String [] temp = t.split(" ");  //分割字符串为字符串数组
        int [] tmp = new int[temp.length];
        for(int i = 0; i < tmp.length; i++)   //遍历填入Int数组中
        {
            tmp[i] = Integer.parseInt(temp[i]);
        }
        return tmp;   //返回处理完毕的数组
    }
}
