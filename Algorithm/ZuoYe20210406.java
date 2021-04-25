package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

//         >>code by ELK<<

public class ZuoYe20210406   //2021年04月06日算法课搜索算法作业
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] a = new int[18];
        int [] aa = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean [] bb = new boolean[20];
        Arrays.fill(bb,false);
        int k = 0;
        System.out.println("请输入18个数,回车作为间隔：");
        while (k < 18)
        {
            double tt = in.nextDouble();
            int t = (int)tt;
            boolean b = true;
            if(t >= 1 && t <= 20 && t == tt)
            {
                for(int i = 0; i < a.length; i++)
                {
                    if(a[i] == t)
                    {
                        System.out.println("您输入的"+t+"已重复,请重新输入！！！");
                        b = false;
                        break;
                    }
                }
            }
            else
            {
                System.out.println("您输入的数已超出范围或不为整数,请重新输入！！！");
                b = false;
            }
            if(b)
            {
                for(int i = 0; i < aa.length; i++)
                {
                    if(aa[i] == t)
                    {
                        bb[i] = true;
                    }
                }
                a[k] = t;
                k++;
            }
        }
        System.out.println("已输入数："+Arrays.toString(a));
        System.out.println("未输入的两个数：");
        for(int i = 0; i < bb.length; i++)
        {
            if(!bb[i])
            {
                System.out.print(aa[i]+" ");
            }
        }
    }
}