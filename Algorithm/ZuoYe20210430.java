package Algorithm;

//         >>code by ELK<<

import java.util.Arrays;
import java.util.Scanner;

class ZuoYe20210430   //2021年4月30日课堂作业
{
    public static void main(String[]args)
    {
        MergeArrays ma = new MergeArrays();


    }


}

class MergeArrays   //声明合并数组
{
    OneNode head = new OneNode(null);   //声明一个头节点，节点不能改变

    public int add(OneNode node)   //声明一个添加节点的方法并且返回添加的位置
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int hl = 1;   //记录数据存放在哪一个位置
        while (temp.next != null)   //遍历到链表结尾
        {
            temp = temp.next;
            hl++;
        }
        temp.next = node;   //导入数据到链表结尾的下一个节点
        return hl;   //返回存放的位置
    }

    public int[] read(int hl)   //声明一个根据指定节点读取节点的方法
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int lt = 0;   //记录到达了哪一个位置
        while (temp.next != null && lt != hl)   //判断是否遍历到需要读取的地方或者是否到达了结尾
        {
            temp = temp.next;
            lt++;
        }
        if(lt == hl)   //判断是否到了要读取的地方
        {
            return temp.getArr();
        }
        else
        {
            return null;
        }
    }

    public int mard(int m, int n)   //合并并且去重,类全名(Merge and remove duplicates)
    {

    }

    public static int[] inPutSpare()   //返回一个处理了空格的int输入数组
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        int sp = s.indexOf("  ");
        while(sp != -1)
        {
            s = s.substring(0, sp) + s.substring(sp + 1);
            sp = s.indexOf("  ");
        }
        String [] sa = s.split(" ");
        int [] ia = new int[sa.length];
        for(int i = 0; i < ia.length; i++)
        {
            ia[i] = Integer.parseInt(sa[i]);
        }
        return ia;
    }
}

class OneNode   //声明节点
{
    private int[] arr;   //声明一个封装的int数组
    public OneNode next;   //指向下一个节点
    public OneNode(int [] arr)   //声明一个多参的构造方法
    {
        this.arr = arr;
    }
    public void setArr(int[] arr)   //通过setter来给数组赋值
    {
        this.arr = arr;
    }
    public int[] getArr()   //通过getter来获取数组
    {
        return arr;
    }
    public String toString()   //重新构造String来获取节点的内容
    {
        return "OneNode{" + "arr=" + Arrays.toString(arr) + "}";
    }
}