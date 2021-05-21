package Algorithm;

//         >>code by ELK<<

import java.util.Scanner;

public class ZuoYe20210518   //2021年5月18日课堂作业
{
    //1.排队——输入排队病人的病历号，加入到病人排队队列中。
    //2.就诊——病人排队队列中最前面的病人就诊，并将其从队列中删除。
    //3.查看排队——从队首到队尾列出所有的排队病人的病历号。
    //4.不再排队，余下顺序就诊——从队首到队尾列出所有的排队病人的病历号，并退出运行。
    //5.下班——退出运行，提示未就诊的病人明天再来。
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        SeeDoctorQueue sd = new SeeDoctorQueue();
        sd.initial();   //初始化链表
        boolean b = false;
        while(true)
        {
            if(b)
                break;
            System.out.print("| 1.排队 | 2.就诊 | 3.查看排队 | 4.不再排队,余下顺序就诊 | 5.下班 |\n");
            System.out.print(">>>请选择你的操作:");
            switch ((in.nextInt()))
            {
                case 1:
                    System.out.print(">>>请输入你要添加的病历号:");
                    sd.inPut(in.nextInt());
                    System.out.print("排队成功!\n\n");
                    break;
                case 2:
                    int t = sd.outPut();
                    if(t != -1)
                    {
                        System.out.print("请"+t+"号病人前往就诊!\n\n");
                    }
                    else
                    {
                        System.out.print("暂时没有病人排队就诊!\n\n");
                    }
                    break;
                case 3:
                    System.out.print("当前排队的病人为:\n");
                    if(!sd.print())
                    {
                        System.out.print("暂时没有病人排队就诊!\n\n");
                    }
                    break;
                case 4:
                    System.out.print("请以下病人依次就诊!\n");
                    if(!sd.print())
                    {
                        System.out.print("暂时没有病人排队就诊!\n\n");
                    }
                    break;
                case 5:
                    System.out.print("已下班!\n\n");
                    b = true;
                    break;
                default:
                    System.out.print("没有这个操作!\n\n");
            }
        }
    }

}

class SeeDoctorQueue
{
    QueueNode front = new QueueNode(-1);   //声明且实例化一个头指针
    QueueNode rear = new QueueNode(-1);   //声明且实例化一个尾指针

    public void initial()   //初始化
    {
        front.next = rear;
        rear.previous = front;
    }

    public void inPut(int data)   //在尾部插入数据
    {
        QueueNode node = new QueueNode(data);   //声明且实例化要插入的节点
        node.previous = rear.previous;
        rear.previous = node;
        node.next = rear;
        node.previous.next = node;
    }

    public int outPut()   //在头部导出数据
    {
        if(front.next.getData() != -1)   //判断队列是否为空
        {
            QueueNode node = front.next;
            front.next = node.next;
            node.next.previous = front;
            return node.getData();
        }
        else
        {
            return -1;
        }
    }

    public boolean print()   //打印队列
    {
        if(front.next.getData() != -1)   //判断队列是否为空
        {
            QueueNode temp = front.next;   //声明且实例化一个零时节点作为指针
            while(temp.getData() != -1)   //循环到尾指针
            {
                System.out.print(temp.getData() + " ");
                temp = temp.next;
            }
            System.out.print("\n\n");
            return true;
        }
        else
        {
            return false;
        }
    }
}

class QueueNode   //队列节点类
{
    private int data;   //声明一个data属性存放数
    public QueueNode next;   //声明一个next指向下一个节点
    public QueueNode previous;   //声明一个previous指向上一个节点
    public QueueNode(int data)   //声明一个构造方法访问数据
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    public void setData(int data)   //构造一个setter方法来设置数据
    {
        this.data = data;
    }
    public int getData()   //构造一个getter方法来访问数据
    {
        return data;
    }
}
