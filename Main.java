import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        Student student = new Student();
        for(int i = 0; i < x; i++)
        {
            String name = in.nextLine();
            String id = in.nextLine();
            String number = in.nextLine();
            HeadNode headNode = new HeadNode(name, id, number);
            student.add(headNode);
            student.list();
        }
    }
}

class Student
{
    private HeadNode head = new HeadNode("", "", "");   //初始化头节点,头节点不能动
    public void add(HeadNode headNode)   //添加节点到单向链表
    {
        HeadNode temp = head;   //创建一个临时节点
        while (true)   //循环遍历到链表的结尾,当循环退出的时候temp就指向了链表的结尾
        {
            if(temp.next == null)   //找到结尾的null的时候退出循环
            {
                break;
            }
            temp = temp.next;   //没到结尾就把temp指向链表的下一个位置
        }
        temp.next = headNode;   //把结尾的next(也就是下一位)指向新的节点
    }
    public void list()    //遍历输出节点
    {
        if(head.next == null)   //判断链表是否为空
        {
            System.out.print("链表为空!\n");
            return;
        }
        HeadNode temp = head.next;   //创建一个临时节点
        while (true)   //循环遍历到链表的结尾
        {
            if(temp == null)
            {
                break;
            }
            temp.print();   //输出节点的信息
            temp = temp.next;   //没到结尾就把temp指向链表的下一个位置
        }
    }
}

class HeadNode   //头节点
{
    public String name;   //声明姓名属性
    public String id;   //声明学号属性
    public String number;   //声明号码属性
    public HeadNode next;   //指向下一个节点
    public HeadNode(String name, String id, String number)   //声明一个多参构造方法
    {
        this.name = name;
        this.id = id;
        this.number = number;
    }
    public void print()   //声明一个打印数据的方法
    {
        System.out.print("[name = "+name+"][id = "+id+"][number = "+number+"]\n");
    }
}