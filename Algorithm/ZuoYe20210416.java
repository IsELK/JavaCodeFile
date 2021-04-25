package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

//         >>code by ELK<<

public class ZuoYe20210416   //2021年4月16日课堂作业
{
    public static void main(String[] args)   //选择功能并调用
    {
        SqList SL = new SqList();
        System.out.print(">>>>>>>>>>>>>>>>>>>可使用的操作<<<<<<<<<<<<<<<<<\n");
        System.out.print("| 1.创建 | 3.删除 | 5.顺序查找 | 7.输出 | 9.排序 |\n");
        System.out.print("| 2.插入 | 4.倒置 | 6.折半查找 | 8.清空 | 0.退出 |\n");
        boolean b = true;
        do{
            System.out.print("\n");
            System.out.print(">>>>>>请选择你的操作:");
            int t = Integer.parseInt(SL.in.nextLine());
            switch (t)
            {
                case 1:
                    SL.CreateList(SL);
                    break;
                case 2:
                    SL.InsertList(SL);
                    break;
                case 3:
                    SL.ListDelete(SL);
                    break;
                case 4:
                    SL.Reverse(SL);
                    break;
                case 5:
                    SL.LocateElem(SL);
                    break;
                case 6:
                    SL.SplitElem(SL);
                    break;
                case 7:
                    SL.PrintList(SL);
                    break;
                case 8:
                    SL.ClearList(SL);
                    break;
                case 9:
                    SL.SplitSort(SL);
                    break;
                case 0:
                    b = false;
                    System.out.print("已结束!");
                    break;
                default:
                    System.out.print("输入错误！");
                    break;
            }
        }while (b);
    }
}

class SqList
{
    Scanner in = new Scanner(System.in);
    int Max = 100;   //设定顺序表的最大容量
    int [] Sz = new int[Max];  //创建存放顺序表的数组
    int SzL;   //记录顺序表的长度

    public void CreateList(SqList SL)   //创建顺序表
    {
        InitList(SL);   //初始化顺序表
        boolean b = false;
        do{
            System.out.print("请输入要创建的顺序表长度(1<y<101):");
            int t = Integer.parseInt(in.nextLine());
            if(t > 1 && t < 101)   //判断是否符合规定长度
            {
                do{
                    System.out.print("请输入"+t+"个数(空格隔开,可无序输入):");
                    String [] temp = in.nextLine().split(" ");
                    if(temp.length == t)   //判断是否准确输入符合长度的个数
                    {
                        for(int i = 0; i < temp.length; i++)
                        {
                            SL.Sz[i] = Integer.parseInt(temp[i]);   //导入顺序表
                            SL.SzL++;
                        }
                        b = true;
                    }
                    else
                    {
                        System.out.println("输入数的数量错误，请重新输入!");
                    }
                }while (!b);
                b = true;
            }
            else
            {
                System.out.println("输入范围错误，请重新输入!");
            }
        }while (!b);
        System.out.println("创建成功!");
        PrintList(SL);
    }

    public void InsertList(SqList SL)   //插入元素
    {
        boolean b = false;
        do{
            System.out.print("请输入要插入的位置(从1开始到"+SL.SzL+")及元素(空格隔开):");
            String [] temp = in.nextLine().split(" ");
            if(temp.length == 2)   //判断是否只输入了两个数
            {
                int x = Integer.parseInt(temp[0]);
                if(x >= 1 && x <= SL.SzL)   //判断是否在顺序表范围内
                {
                    for(int i = SL.SzL; i >= x; i--)   //把每个数往后推一位直到到了要插入的位置
                    {
                        SL.Sz[i] = SL.Sz[i-1];
                    }
                    SL.Sz[x-1] = Integer.parseInt(temp[1]);   //插入元素
                    SL.SzL++;
                    b = true;
                }
                else
                {
                    System.out.print("输入数的范围错误，请重新输入!\n");
                }
            }
            else
            {
                System.out.print("输入数的个数错误,请重新输入!\n");
            }
        }while (!b);
        System.out.print("插入成功!\n");
        SL.PrintList(SL);
    }

    public void ListDelete(SqList SL)   //删除元素
    {
        boolean b = false;
        do{
            System.out.print("请输入要删除的位置(从1开始到"+SL.SzL+"):");
            int x = Integer.parseInt(in.nextLine());
            if(x >= 1 && x <= SL.SzL)   //判断是否在顺序表范围内
            {
                for(int i = x-1; i <= SL.SzL; i++)   //把要删除的数后面的数全部往前诺一位
                {
                    SL.Sz[i] = SL.Sz[i+1];
                }
                SL.Sz[SL.SzL] = 0;   //删除元素
                SL.SzL--;
                b = true;
            }
            else
            {
                System.out.print("输入数的范围错误，请重新输入!\n");
            }
        }while (!b);
        System.out.print("删除成功!\n");
        SL.PrintList(SL);
    }

    public void Reverse(SqList SL)   //倒置顺序表
    {
        int [] temp = new int[SL.SzL];   //建立一个临时数组存放倒置的数
        int i = 0;
        for(int j = SL.SzL-1; j >= 0; j--)   //将顺序表中的数倒置输入临时数组中
        {
            temp[i] = SL.Sz[j];
            i++;
        }
        for(int j = 0; j < SL.SzL; j++)   //将已有倒置数据的临时数组中的数导入回顺序表中
        {
            SL.Sz[j] = temp[j];
        }
        System.out.print("倒置成功!\n");
        SL.PrintList(SL);
    }

    public void LocateElem(SqList SL)   //顺序查找顺序表
    {
        System.out.print("请输入要查找的值(一个):");
        int t = Integer.parseInt(in.nextLine());
        boolean b = false;
        for(int i = 0; i < SL.SzL; i++)   //遍历顺序表
        {
            if(SL.Sz[i] == t)   //查找
            {
                System.out.print("该元素位置为:"+(i+1)+"\n");
                b = true;
                break;
            }
        }
        if(!b)
        {
            System.out.print("未找到该元素!\n");
        }
    }

    public void SplitElem(SqList SL)   //折半查找顺序表
    {
        System.out.print("请输入要查找的值(一个):");
        int t = Integer.parseInt(in.nextLine());
        QuickSort(SL.Sz, 0, SL.SzL-1);   //排序顺序表
        int x = 0, y = SL.SzL-1, z = 0;   //二分排序法
        boolean b = false;
        while (x <= y)
        {
            z = x + (y - x) / 2;   //取中间值
            if(SL.Sz[z] == t)
            {
                System.out.print("该元素位置为:"+(t)+"\n");
                b = true;
            }
            if(t < SL.Sz[z])
            {
                y = z - 1;
            }
            else
            {
                x = z + 1;
            }
        }
        if(!b)
        {
            System.out.print("未找到该元素!\n");
        }
    }

    public void SplitSort(SqList SL)   //奇偶分开排序顺序表
    {
        int [] Odd = new int[SL.SzL];   //存放奇数
        int [] Even = new int[SL.SzL];   //存放偶数
        int o = 0, e = 0;
        for(int i = 0; i < SL.SzL; i++)   //把顺序表中的奇数偶数分开
        {
            if(SL.Sz[i] % 2 == 1)   //判断是奇数还是偶数
            {
                Odd[o] = SL.Sz[i];   //存入奇数数组
                o++;
            }
            else
            {
                Even[e] = SL.Sz[i];   //存入偶数数组
                e++;
            }
        }
        int ol = o, el = e;
        QuickSort(Odd, 0, o-1);   //使用快速排序法
        QuickSort(Even, 0, e-1);   //分别排序奇偶数组
        o = 0;
        e = 0;
        for(int i = 0; i < SL.SzL; i++)   //把存放奇偶的两个数组排回去
        {
            if(o < ol && e < el)   //检测奇偶数组是否有排完的
            {
                if(Odd[o] < Even[e])
                {
                    SL.Sz[i] = Odd[o];
                    o++;
                }
                else
                {
                    SL.Sz[i] = Even[e];
                    e++;
                }
            }
            else
            {
                if(o < ol)
                {
                    SL.Sz[i] = Odd[o];
                    o++;
                }
                else if(e < el)
                {
                    SL.Sz[i] = Even[e];
                    e++;
                }
            }
        }
        System.out.print("排序成功!\n");
        SL.PrintList(SL);
    }

    public void InitList(SqList SL)   //初始化顺序表
    {
        SL.SzL = 0;
        System.out.print("成功初始化顺序表!\n");
    }

    public void PrintList(SqList SL)   //输出顺序表
    {
        System.out.print("当前顺序表所有元素为(顺序表长度为"+SL.SzL+"):");
        for(int i = 0; i < SL.SzL; i++)   //遍历顺序表
        {
            System.out.print(SL.Sz[i]+" ");
        }
        System.out.print("\n");
    }

    public void ClearList(SqList SL)   //清空顺序表
    {
        Arrays.fill(SL.Sz, 0);   //清空
        SL.SzL = 0;
        System.out.print("成功清除顺序表!\n");
    }

    public static void QuickSort(int [] a, int m, int n)   //快速排序法
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
                }
                //由左向右找到大于等于temp的数
                while(i < j && a[i] < temp)
                    i++;
                if(i < j)
                {
                    a[j--] = a[i];
                }
            }
            a[i] = temp;
            QuickSort(a, m, i - 1);
            QuickSort(a, i + 1, n);
        }
    }
}