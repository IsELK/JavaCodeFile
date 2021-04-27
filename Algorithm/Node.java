package Algorithm;

import java.util.Scanner;

public class Node
{
    public class Friend
    {
        public Friend next;
        private String Name;   //声明一个名字属性
        private String Tel;   //声明一个手机号码属性
        private String Email;   //声明一个地址属性
        private String BornAdd;   //声明一个家庭住址属性
        public Friend(){}   //声明一个无参的构造方法
        public Friend(String Name,String Tel,String Email,String BornAdd)
        {
            this.Name=Name;
            this.Tel=Tel;
            this.Email=Email;
            this.BornAdd=BornAdd;
        }
        public String getName()
        {
            return Name;
        }
        public void setName(String Name)
        {
            this.Name=Name;
        }
        public void setTel(String Tel)
        {
            this.Tel=Tel;

        }
        public String getTel()
        {
            return Tel;
        }
        public void setEmail(String Email)
        {
            this.Email=Email;
        }
        public String getEmail()
        {
            return Email;
        }
        public void setBornAdd(String BornAdd)
        {
            this.BornAdd=BornAdd;
        }
        public String getBornAdd()
        {
            return BornAdd;
        }
        public void message(String Name,String Tel,String Email,String BornAdd)
        {
            this.Name=Name;
            this.Tel=Tel;
            this.Email=Email;
            this.BornAdd=BornAdd;
        }
        public String toString()
        {
            return this.Name+"\t"+this.Tel+"\t"+this.Email+"\t"+this.BornAdd;

        }
    }
    private int size;
    private Friend head;
    {
        this.size=0;
        this.head=null;

    }

    public void insertHead(Friend s)
    {
        if (this.size == 0)
        {
            this.head=s;
        }
        else{s.next=this.head;
            this.head=s;
        }
        this.size++;
    }

    public boolean delete(String Name)
    {
        Friend front=this.head;
        if(Name.equals(front.getName()))
        {
            this.head=this.head.next;
            this.size--;
            return true;

        }
        while(!Name.equals(front.next.getName()))
        {
            front=front.next;
        }
        if(front.next!=null)
        {
            front.next=front.next.next;
            this.size--;
            return true;
        }
        return false;
    }

    public Friend select(String Name)
    {
        Friend front=this.head;
        if(Name.equals(front.getName()))
        {
            Friend s=new Friend(Name,front.getTel(),front.getEmail(),front.getBornAdd());
            return s;
        }
        while (front.next!=null)
        {
            front=front.next;
            if(Name.equals(front.getName()))
            {
                Friend s=new Friend(Name,front.getTel(),front.getEmail(),front.getBornAdd());
                return s;
            }
        }
        return null;
    }

    public void display(){
        System.out.println("姓名\t手机号\t邮箱地址\t家庭住址");
        Friend front=this.head;
        while (front!=null&&front.getName()!=null)
        {
            System.out.println(front.toString());
            front=front.next;
        }
        if(this.head==null||this.head.getName()==null)
        {
            System.out.println("无相关信息");
        }
    }

    public static void main(String[] args)
    {
        Node sm = new Node();
        Scanner in = new Scanner(System.in);
        boolean open = true;
        while (open)
        {
            printMenu();
            System.out.println("请输入菜单序号进行操作");
            int menu = -1;
            try
            {
                menu = in.nextInt();
            }
            catch (Exception e)
            {
                in = new Scanner(System.in);
            }
            switch (menu)
            {
                case 0:
                {
                    System.out.println("创建成功");
                }
                break;
                case 1:
                {
                    System.out.println("请输入姓名");
                    String Name1 = in.next();

                    System.out.println("手机号，邮箱地址，家庭地址（空格结束，回车确认插入）");
                    try
                    {
                        String Tel = in.next();
                        String Email = in.next();
                        String BornAdd = in.next();
                        Friend news = sm.new Friend(Name1, Tel, Email, BornAdd);
                        sm.insertHead(news);
                    }
                    catch (Exception e)
                    {
                        System.out.println("输入信息有误");
                        in = new Scanner(System.in);
                    }
                    break;
                }
                case 2: {
                    System.out.println("请输入要查询联系人的姓名");
                    String Name2 = in.next();
                    Friend selectS = sm.select(Name2);
                    System.out.println("姓名\t手机号\t邮箱地址\t家庭地址");
                    if (selectS == null)
                    {

                    }
                    else
                    {
                        System.out.println(selectS.toString());
                    }
                }
                break;
                case 3:
                {
                    System.out.println("请输入要删除联系人的姓名");
                    String Name3 = in.next();
                    if (sm.delete(Name3))
                    {
                        System.out.println("删除成功");
                    }
                    else
                    {
                        System.out.println("删除失败");
                    }
                    sm.display();
                }
                break;
                case 4:
                {
                    sm.display();
                }
                break;
                case 5:
                {
                    System.out.println("系统已退出");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("输入错误");
            }
        }
        in.close();
    }

    public static  void printMenu()
    {
        System.out.println("通讯录管理系统");
        System.out.println("*****************");
        System.out.println("* 0----创建链表   *");
        System.out.println("* 1----插入联系人 *");
        System.out.println("* 2----查找联系人 *");
        System.out.println("* 3----删除联系人 *");
        System.out.println("* 4----输出通讯录 *");
        System.out.println("* 5----退出系统   *");
        System.out.println("*****************");
    }
}
