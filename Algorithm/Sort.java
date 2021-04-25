package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

//         >>code by ELK<<

public class Sort   //排序算法
{
    //复制数组使数组初始化
    public static int[] ArrayCopy(int[]input)
    {
        int [] a = new int[input.length];
        System.arraycopy(input, 0, a, 0, a.length);
        return a;
    }

    //生成一个装有不重复随机数的数组
    public static int[] RandomNumber(int x)
    {
        int [] a = new int[x];
        int k = 0;
        while(k != x)
        {
            //随机数
            int t = (int)(Math.random()*1000);
            boolean b = false;
            //遍历数组
            for(int i = 0; i < a.length; i++)
            {
                if(t == a[i])
                {
                    b = true;
                }
            }
            if(!b)
            {
                a[k] = t;
                k++;
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入位数(0到1000位): ");
        int x = in.nextInt();
        int [] a = RandomNumber(x);

        //选择算法模块
        System.out.println("[ <0>算法结束 <1>插入排序 <2>冒泡排序 <3>选择排序 <4>希尔排序 <5>快速排序 <6>基数排序]");
        System.out.println("请输入你要使用的算法: ");
        while(in.hasNextInt())
        {
            Sort s = new Sort();
            switch(in.nextInt())
            {
                case 0:
                    System.out.println("算法结束！！！");
                    break;

                case 1: 
                    s.InserSort(ArrayCopy(a));
                    break;

                case 2:
                    s.BubbleSort(ArrayCopy(a));
                    break;

                case 3:
                    s.SelectionSort(ArrayCopy(a));
                    break;

                case 4:
                    s.ShellSort(ArrayCopy(a));
                    break;

                case 5:
                    s.UseQuickSort(ArrayCopy(a));
                    break;

                case 6:
                    s.RadixSort(ArrayCopy(a));
                    break;

                default:
                System.out.println("未知算法噢！请重新输入！");
            }
        }
    }

    //插入排序算法   时间复杂度为O(n²)   最好情况为O(n)
    public void InserSort(int[] a)
    {
        System.out.println("插入排序算法: ");
        System.out.println("初始状态: "+Arrays.toString(a));
        int i, j, k;
        for(i = 1; i < a.length; i++)
        {
            for(j = 0; j <= i; j++)
            {
                if(a[i] < a[j])
                {
                    int temp = a[i];
                    for(k = i; k > j; k--)
                    {
                        a[k] = a[k - 1];
                    }
                    a[j] = temp;
                }
            }
            System.out.println("第"+i+"次排序结果: "+Arrays.toString(a));
        }
        System.out.println("最终状态: "+Arrays.toString(a)+"\n");
        System.out.println("\n");
    }

    //冒泡排序算法   时间复杂度为O(n²)   最好情况为O(n)
    public void BubbleSort(int[]a)
    {
        System.out.println("冒泡排序算法: ");
        System.out.println("初始状态: "+Arrays.toString(a));
        int i, j, temp;
        for(i = a.length-1; i > 0; i--)
        {
            boolean b = false;
            for(j = 0; j < i; j++)
            {
                if(a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    b = true;
                }
            }
            if(!b)
            {
                break;
            }
            System.out.println("第"+(a.length-i)+"次排序结果: "+Arrays.toString(a));
        }
        System.out.println("最终状态: "+Arrays.toString(a)+"\n");
        System.out.println("\n");
    }

    //选择排序算法      时间复杂度为O(n²)
    public void SelectionSort(int [] a)
    {
        System.out.println("选择排序算法: ");
        System.out.println("初始状态: "+Arrays.toString(a));
        int i, j, temp;
        for(i = 0; i < a.length-1; i++)
        {
            for(j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("第"+(i + 1)+"次排序结果: "+Arrays.toString(a));
        }
        System.out.println("最终状态: "+Arrays.toString(a)+"\n");
        System.out.println("\n");
    }

    //希尔排序算法   时间复杂度为O(n²/³)
    public void ShellSort(int [] a)
    {
        System.out.println("希尔排序算法: ");
        System.out.println("初始状态: "+Arrays.toString(a));
        int i, j, k, n, temp;
        k = 1;
        n = a.length/2;
        while(n >= 1)
        {
            for(i = n; i < a.length; i++)
            {
                temp = a[i];
                j = i - n;
                while(j >= 0 && temp < a[j])
                {
                    a[j + n] = a[j];
                    j -= n;
                }
                a[j + n] = temp;
            }
            n /= 2;
            System.out.println("第"+(k++)+"次排序结果: "+Arrays.toString(a));
        }
        System.out.println("最终结果: "+Arrays.toString(a));
        System.out.println("\n");
    }

    //使用快速排序算法
    public void UseQuickSort(int [] a)
    {
        System.out.println("快速排序算法: ");
        System.out.println("初始数组: "+Arrays.toString(a));
        int k = 1;
        QuickSort(a, 0, a.length-1, k);
        System.out.println("最终结果: "+Arrays.toString(a));
        System.out.println("\n");
    }

    //快速排序算法   最好情况的时间复杂度为O(nlog2n)   最坏情况为O(n²)
    public static void QuickSort(int [] a, int m, int n, int k)
    {
        if(m < n)
        {
            int i = m, j = n, temp = a[m];
            boolean b = false;
            while(i < j)
            {
                //由右向左找到小于temp的数
                while(i < j && a[j] >= temp)
                    j--;
                if(i < j)
                {
                    a[i++] = a[j];
                    b = true;
                }
                //由左向右找到大于等于temp的数
                while(i < j && a[i] < temp)
                    i++;
                if(i < j)
                {
                    a[j--] = a[i];
                    b = true;
                }
            }
            a[i] = temp;
            if(b)
            System.out.println("第"+(k++)+"次排序结果: "+Arrays.toString(a));
            QuickSort(a, m, i - 1, k);
            QuickSort(a, i + 1, n, k);
        }
    }

    //基数排序算法   最好情况的时间复杂度为O(nlogpk)
    public void RadixSort(int [] a)
    {
        System.out.println("基数排序算法: ");
        System.out.println("初始数组: "+Arrays.toString(a));
        //找到数组中的最大值，并计算出长度
        int m = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(m < a[i])
            {
                m = a[i];
            }
        }
        int mlenght = (m + "").length();
        //创建一个用于零时放数据的二维数组的桶
        int [][] t = new int[10][a.length];
        //创建一个用于记录每个桶中有多少数放进去了
        int [] ts = new int[a.length];
        //用于取余的移位
        int o = 1;
        //开始循环
        for(int i = 0; i < mlenght; i++)
        {
            //进行取余并放到桶里面
            for(int j = 0; j < a.length; j++)
            {
                //取余
                int temp = (a[j] / o) % 10;
                //放进桶里面并且计数
                t[temp][ts[temp]] = a[j];
                ts[temp]++;
            }
            //从桶中取出来并放置回原数组中
            int p = 0;
            for(int j = 0; j < t.length; j++)
            {
                //判断桶中是否有存入的数据
                if(ts[j] != 0)
                {
                    for(int k = 0; k < ts[j]; k++)
                    {
                        a[p] = t[j][k];
                        p++;
                    }
                    //计数清零
                    ts[j] = 0;
                }
                System.out.println("第"+i+"次排序结果: "+Arrays.toString(a));
            }
            //移到下一位
            o *= 10;
        }
        System.out.println("最终结果: "+Arrays.toString(a));
        System.out.println("\n");
    }
}   //这是最后一个括号！！！