package Algorithm;

//         >>code by ELK<<

import java.util.Arrays;
import java.util.Scanner;

class ZuoYe20210430   //2021年4月30日课堂作业
{
    public static void main(String[]args)
    {
        MergeArrays ma = new MergeArrays();
        Scanner in = new Scanner(System.in);
        int temp;   //临时存放int数据
        int [] temparr;   //临时存放int数组数据
        boolean b = true;   //做判断条件用于终止循环
        while (b)   //循环
        {
            features();   //打印功能列表
            switch (in.nextInt())   //选择功能
            {
                case 0:
                    b = false;
                    System.out.print("\n>>>已退出!<<<");
                    break;

                case 1:
                    System.out.print("\n>>>请输入要添加的数组(数之间以空格间隔,回车确认):");
                    temp = ma.addNode(new OneNode(ma.inPutSpare()));
                    System.out.print("添加成功!添加在链表的第["+temp+"]节!\n\n");
                    break;

                case 2:
                    System.out.print("\n>>>请输入一个要读取的节点位置(回车确认):");
                    temp = in.nextInt();
                    temparr = ma.readNode(temp);
                    if(temparr != null)
                    {
                        System.out.print("读取成功!第"+temp+"节的数组为:"+Arrays.toString(temparr)+"\n\n");
                    }
                    else
                    {
                        System.out.print("读取失败!链表中无此节点!\n\n");
                    }
                    break;

                case 3:
                    System.out.print("\n>>>请输入一个要删除的节点位置(回车确认):");
                    temp = in.nextInt();
                    temp = ma.deleteNode(temp);
                    if(temp != -1)
                    {
                        System.out.print("删除成功!已删除第"+temp+"节!\n\n");
                    }
                    else
                    {
                        System.out.print("删除失败!链表中无此节点!\n\n");
                    }
                    break;

                case 4:
                    System.out.print("\n>>>请输入要插入的数组(数之间以空格间隔,回车确认):");
                    temparr = ma.inPutSpare();
                    System.out.print(">>>请输入插入的位置(回车确认):");
                    temp = in.nextInt();
                    temp = ma.insertNode(new OneNode(temparr), temp);
                    if(temp != -1)
                    {
                        System.out.print("插入成功!已插入到第"+temp+"节!\n\n");
                    }
                    else
                    {
                        System.out.print("插入失败!超出链表连接的长度!\n\n");
                    }
                    break;

                case 5:
                    System.out.print("\n遍历打印链表:\n");
                    ma.printNode();
                    System.out.print("遍历打印完毕!\n\n");
                    break;

                case 6:
                    System.out.print("\n请输入要进行合并去重的两个数组(空格分隔,回车确认):");
                    temparr = ma.inPutSpare();
                    temp = ma.mardNode(ma, temparr[0], temparr[1]);
                    if(temp != -1)
                    {
                        System.out.print("合并去重!已插入到第"+temp+"节!\n\n");
                    }
                    else
                    {
                        System.out.print("合并去重失败!没有此节点!\n\n");
                    }
                    break;

                default:
                    System.out.print("\n没有此功能!请重新输入!\n\n");
            }
        }
    }

    public static void features()   //打印功能菜单
    {
        System.out.print("可使用的功能{0 >>>退出}:\n");
        System.out.print("| 1 >>>添加数组 | 2 >>>读取数组 |\n");
        System.out.print("| 3 >>>删除数组 | 4 >>>插入数组 |\n");
        System.out.print("| 5 >>>打印链表 | 6 >>>合并去重 |\n");
        System.out.print(">>>请选择你的功能:");
    }
}

//   实现功能：
//   1. 添加数组 (添加数组在链表的结尾处)
//   2. 读取数组 (读取链表中指定位置的数组)
//   3. 删除数组 (删除链表中指定位置的数组)
//   4. 插入数组 (插入数组在链表的指定位置)
//   5. 打印链表 (遍历打印链表中的全部内容)
//   6. 合并去重 (选择两个数组进行合并去重并放入链表结尾)

class MergeArrays   //声明合并数组
{
    OneNode head = new OneNode(null);   //声明一个头节点，节点不能改变

    public int addNode(OneNode node)   //添加节点的方法并且返回结果
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int lt = 1;   //记录到达了哪一个位置
        while (temp.next != null)   //遍历到链表结尾
        {
            temp = temp.next;
            lt++;
        }
        temp.next = node;   //导入数据到链表结尾的下一个节点
        return lt;   //返回存放的位置
    }

    public int[] readNode(int hl)   //根据指定位置读取节点并返回结果
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int lt = 0;   //记录到达了哪一个位置
        while (temp.next != null && lt != hl)   //遍历到要读取的节点或者到达链表结尾
        {
            temp = temp.next;
            lt++;
        }
        if(lt == hl)   //判断是否到了要读取的地方
        {
            return temp.getArr();   //返回节点的数组表示找到了数组
        }
        else
        {
            return null;   //返回null表示没有此节点
        }
    }

    public int deleteNode(int dl)   //删除指定位置的节点并且返回结果
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int lt = 0;   //记录到达哪一个节点
        while (lt != (dl - 1) && temp.next != null)   //遍历到要删除的节点的前一个节点或者到达链表结尾
        {
            temp = temp.next;
            lt++;
        }
        if(temp.next == null)   //判断是否到链表结尾
        {
            return -1;   //返回-1表示没有此节点
        }
        else
        {
            temp.next = temp.next.next;   //让要删除的节点的前一个节点指向要删除的节点的下一个节点
            return dl;   //返回删除位置表示删除成功
        }
    }

    public int insertNode(OneNode node, int il)   //插入数组到指定位置并返回结果
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int lt = 0;   //记录到达哪一个节点
        while (lt != (il - 1) && temp.next != null)   //遍历到要插入的节点位置的前一个节点或者到达链表结尾
        {
            temp = temp.next;
            lt++;
        }
        if(temp.next == null)   //判断是否到链表结尾
        {
            return -1;   //返回-1表示超出链表连接的长度
        }
        else
        {
            OneNode tmp = temp.next;   //声明一个临时节点指向插入位置原本有的节点
            temp.next = node;   //插入位置指向新的插入的节点
            node.next = tmp;   //新插入的节点指向原本后面的节点
            return il;   //返回插入位置表示插入成功
        }
    }

    public void printNode()   //遍历打印链表的全部数组
    {
        OneNode temp = head;   //声明一个临时节点用来指向后面的节点
        int lt = 0;   //记录到达哪一个节点
        while (temp.next != null)
        {
            temp = temp.next;
            System.out.print("第"+(++lt)+"节:"+Arrays.toString(temp.getArr())+"\n");
        }
    }

    public int mardNode(MergeArrays ma, int m, int n)   //合并和去重并且返回结果,类全名(Merge and remove duplicates)
    {
        int [] x = ma.readNode(m);
        int [] y = ma.readNode(n);
        if(x != null && y != null)   //判断给的是不是空节点
        {
            int Max = x.length + y.length;
            int [] o = new int[Max];   //新建用于存放两个数组的总顺序表数组
            int ol = 0;   //用于记录总顺序表存放数据的长度
            for(int i = 0; i < x.length; i++)   //把顺序表一放入总顺序表中
            {
                o[ol] = x[i];
                ol++;
            }
            for(int i = 0; i < y.length; i++)   //把顺序表二放入总顺序表中
            {
                o[ol] = y[i];
                ol++;
            }
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
            int [] p = new int[ol];
            for(int i = 0; i < p.length; i++)
            {
                p[i] = o[i];
            }
            int lt = ma.addNode(new OneNode(p));
            return lt;
        }
        else
        {
            return -1;
        }
    }

    public int[] inPutSpare()   //返回一个处理了空格的int输入数组
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();   //去除字符串两头的空格
        int sp = s.indexOf("  ");   //寻找两个空格的位置
        while(sp != -1)   //当检测到没有两个空格以后就不再循环
        {
            s = s.substring(0, sp) + s.substring(sp + 1);   //通过拼接去除多于空格
            sp = s.indexOf("  ");   //寻找两个空格的位置
        }
        String [] sa = s.split(" ");   //分割字符串成数组
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