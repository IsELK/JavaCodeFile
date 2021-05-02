package Algorithm;

//         >>code by ELK<<

import java.util.Arrays;
import java.util.Scanner;

public class ZuoYe20210420   //2021年4月20日课堂作业
{
    public static void main(String[] args)
    {
        System.out.print("请输入顺序表一，数字用空格间隔，以回车号结束:\n");
        int [] m = inPut();
        System.out.print("请输入顺序表二，数字用空格间隔，以回车号结束:\n");
        int [] n = inPut();
        System.out.print("下面进行两个长度不一的顺序表合并，并进行去重和排序操作:\n");
        Combinet(m, n);
    }

    public static void Combinet(int [] m, int [] n)   //把两个数组合并排序后查重输出
    {
        int Max = m.length + n.length;
        int [] o = new int[Max];   //新建用于存放两个数组的总顺序表数组
        int ol = 0;   //用于记录总顺序表存放数据的长度
        for(int i = 0; i < m.length; i++)   //把顺序表一放入总顺序表中
        {
            o[ol] = m[i];
            ol++;
        }
        for(int i = 0; i < n.length; i++)   //把顺序表二放入总顺序表中
        {
            o[ol] = n[i];
            ol++;
        }
        ol--;
        Arrays.sort(o);   //把导入完数据的总顺序表排序
        for(int i = 0; i < ol-1; i++)   //遍历数组查重并删除
        {
            int dl = i + 1;
            while (o[i] == o[dl] && dl < ol)   //检测是否有相同
            {
                for(int j = dl; j < ol-1; j++)   //从重复的数开始后面的数全部往前推一位并覆盖重复数(等同于删除)
                {
                    o[j] = o[j+1];
                }
                ol--;   //删除后总顺序表的计数少一
            }
        }
        for(int i = 0; i < ol; i++)   //遍历并输出总顺序表的数
        {
            System.out.print(o[i]+" ");
        }
    }

    public static int[] inPut()   //输入顺序表，其中已处理用户输入多空格的问题
    {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine().trim();
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