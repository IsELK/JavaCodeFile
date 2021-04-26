package Algorithm;

//         >>code by ELK<<

import java.util.Arrays;
import java.util.Scanner;

public class ZuoYe20210425      //2021年4月25日课堂作业
{
    public static void main(String[] args)
    {
        System.out.print("情输入第一条非零多项式(空格间隔):\n");
        int [] m = InPut();
        System.out.print("情输入第二条非零多项式(空格间隔):\n");
        int [] n = InPut();
        System.out.print("两个多项式相加的结果为:\n");
        AddArrays(m, n);
    }

    public static void AddArrays(int [] m, int [] n)   //非零多项式相加操作
    {
        int [] c = CiShu(m, n);
        int [][] o = new int[c.length][2];   //创建存放多项式次数和系数的二位数组
        int t = o.length - 1;
        for(int i = 0; i < o.length; i++)   //倒序导入次数实现降序
        {
            o[i][1] = c[t];
            t--;
        }
        for(int i = 0; i < o.length; i++)   //遍历实现系数相加
        {
            for(int j = 2; j < m.length; j += 2)
            {
                if(m[j] == o[i][1])
                {
                    o[i][0] += m[j - 1];
                }
            }
            for(int j = 2; j < n.length; j += 2)
            {
                if(n[j] == o[i][1])
                {
                    o[i][0] += n[j - 1];
                }
            }
        }
        System.out.print(c.length);   //输出后面存放的个数
        for(int i = 0; i < o.length; i++)
        {
            System.out.print(" "+o[i][0]+" "+o[i][1]);
        }
    }

    public static int[] CiShu(int [] m, int [] n)  //寻找两个多项式中有的次数并且去重
    {
        int [] temp = new int[m[0]+n[0]];   //建立一个零时顺序表数组存放次数
        int templen = 0;   //记录顺序表的长度
        for(int i = 2; i < m.length; i += 2)   //导入第一个多项式的次数
        {
            temp[templen] = m[i];
            templen++;
        }
        for(int i = 2; i < n.length; i += 2)   //导入第二个多项式的次数
        {
            temp[templen] = n[i];
            templen++;
        }
        Arrays.sort(temp);   //排序次数
        for(int i = 0; i < templen - 1; i++)   //遍历去重
        {
            int dlen = i + 1;  //指向要删除的地方
            while(temp[i] == temp[dlen] && dlen < templen)  //判断重复
            {
                for(int j = dlen; j < templen - 1; j++)   //从要删除的数后面全部往前推一位覆盖
                {
                    temp[j] = temp[j + 1];
                }
                templen--;   //覆盖后长度少一位
            }
        }
        int [] c = new int[templen];
        for(int i = 0; i < c.length; i++)   //放入新的数组以便连同顺序表的长度一起返回，顺序表的长度为c.length
        {
            c[i] = temp[i];
        }
        return c;
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
