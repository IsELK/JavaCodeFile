package Algorithm;

//         >>code by ELK<<

import java.util.Scanner;

public class ZuoYe20210514   //2021年5月14日课堂作业
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(">>>进制转换工具开启(输入-1关闭)<<<\n");
        while (true)   //使进制转换工具处于循环状态
        {
            BaseConversion bc = new BaseConversion();   //声明且构造一个进制转换对象
            System.out.print("\n>>>请输入需要转换的数(回车确认):");
            long m = in.nextLong();   //扫描要转换的数
            if(m == -1)   //检测是否使退出条件
            {
                System.out.print(">>>进制转换工具已结束<<<\n");
                break;
            }
            System.out.print(">>>请输入转换为多少进制(回车确认):");
            long n = in.nextLong();   //扫描要转换的进制
            if(n == -1)   //检测是否使退出条件
            {
                System.out.print(">>>进制转换工具已结束<<<\n");
                break;
            }
            System.out.print(">>>结果为:");
            bc.conversion(m, n);   //调用计算进制方法
            bc.print();   //打印结果
        }
    }
}

class BaseConversion   //构造一个进制转换类
{
    Node head = new Node(-1);   //声明且实例化一个顶部指针
    Node tail = new Node(-1);   //声明且实例化一个底部指针

    public void conversion(Long m, Long n)   //计算进制并且存入链表堆栈中
    {
        head.next = tail;
        while (m != 0)   //一直给数做除法并取余得出转化进制后的数
        {
            int data = (int)(m % n);   //取余
            m /= n;
            Node temp = new Node(data);   //把得出的余数压入堆栈的顶部
            temp.next = head.next;
            head.next = temp;
        }
    }

    public void print()   //从开头开始打印打印链表
    {
        String [] zm = {"a","b","c","d","e","f","g","h","i","j","k","l", "m","n","o","p","q","r","s","t","u","v","w","s","y","z"};
        while (head.next.getData() != -1)   //当检测到底部的指针就退出
        {
            if(head.next.getData() >= 10)   //检测是否大于10，大于10则用字母输出
            {
                System.out.print(zm[head.next.getData() - 10]+" ");
            }
            else
            {
                System.out.print(head.next.getData()+" ");
            }
            head.next = head.next.next;   //取出顶部数据后删除
        }
        System.out.println();
    }
}

class Node   //构造一个节点类
{
    private int data;   //声明一个data属性存数
    public Node next;   //声明一个next属性指向下一个节点
    public Node(int data)   //声明一个多参的构造方法
    {
        this.data = data;
    }
    public void setData(int data)   //使用setter设置data属性
    {
        this.data = data;
    }
    public int getData()   //使用getter访问data属性
    {
        return data;
    }
}
