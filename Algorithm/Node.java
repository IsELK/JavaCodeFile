package Algorithm;

import java.util.Scanner;

public class Node
{
    public class Friend   //构建一个成员内部类
    {
        public Friend next;
        private String Name;   //声明一个名字属性
        private String Tel;   //声明一个手机号码属性
        private String Email;   //声明一个地址属性
        private String BornAdd;   //声明一个家庭住址属性
        public Friend(){}   //声明一个无参的构造方法
        public Friend(String Name,String Tel,String Email,String BornAdd)   //声明一个多参的构造方法
        {
            this.setName(Name);   //通过setter给Name赋值
            this.setTel(Tel);   //通过setter给Tel赋值
            this.setEmail(Email);   //通过setter给Email赋值
            this.setBornAdd(BornAdd);   //通过setter给BornAdd赋值
        }
        public void setName(String Name)   //用setter方法使得类中的Name可以被赋值
        {
            this.Name=Name;
        }
        public String getName()   //用getter方法使得类中的Name可以被读取
        {
            return this.Name;
        }
        public void setTel(String Tel)   //用setter方法使得类中的Tel可以被赋值
        {
            this.Tel=Tel;

        }
        public String getTel()   //用getter方法使得类中的Tel可以被读取
        {
            return this.Tel;
        }
        public void setEmail(String Email)   //用setter方法使得类中的Email可以被赋值
        {
            this.Email=Email;
        }
        public String getEmail()   //用getter方法使得类中的Email可以被读取
        {
            return this.Email;
        }
        public void setBornAdd(String BornAdd)   //用setter方法使得类中的BornAdd可以被赋值
        {
            this.BornAdd=BornAdd;
        }
        public String getBornAdd()   //用getter方法使得类中的BornAdd可以被读取
        {
            return this.BornAdd;
        }

        public void message(String Name,String Tel,String Email,String BornAdd)   //声明一个方法可以直接给类中的属性赋值
        {
            this.Name=Name;
            this.Tel=Tel;
            this.Email=Email;
            this.BornAdd=BornAdd;
        }
        public String toString()   //直接输出类中的属性
        {
            return this.Name+"\t"+this.Tel+"\t"+this.Email+"\t"+this.BornAdd;

        }
    }

    private int size;
    private Friend head;
    {
        this.size=0;   //初始化
        this.head=null;   //初始化
    }

    public void insertHead(Friend s)   //导入数据
    {
        if (this.size == 0)
        {
            this.head=s;
        }
        else
        {
            s.next=this.head;
            this.head=s;
        }
        this.size++;
    }

    public boolean delete(String Name)   //删除联系人
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

    public Friend select(String Name)   //查找数据并且返回找到的数据
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

    public void display()   //输出通讯录
    {
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

    public static void main(String[] args)   //主方法
    {
        Node sm = new Node();   //声明且实例化Node对象
        Scanner in = new Scanner(System.in);
        boolean open = true;   //控制输入的循环
        while (open)   //循环让用户可以一直选择功能
        {
            printMenu();   //输出目录
            System.out.println("请输入菜单序号进行操作");
            int menu = -1;
            try   //捕获例外异常，防止输入不为int值
            {
                menu = in.nextInt();
            }
            catch (Exception e)
            {
                in = new Scanner(System.in);
            }
            switch (menu)   //根据用户的输入选择功能
            {
                case 0:   //创建链表
                {
                    System.out.println("创建成功");
                }
                break;
                case 1:   //插入联系人
                {
                    System.out.println("请输入姓名");
                    String Name1 = in.next();   //输入姓名
                    System.out.println("手机号，邮箱地址，家庭地址（空格结束，回车确认插入）");
                    try   //捕获例外异常
                    {
                        String Tel = in.next();   //输入电话号码
                        String Email = in.next();   //输入邮箱地址
                        String BornAdd = in.next();   //输入家庭地址
                        Friend news = sm.new Friend(Name1, Tel, Email, BornAdd);   //声明Friend类的多参方法导入数据
                        sm.insertHead(news);   //导入数据
                    }
                    catch (Exception e)
                    {
                        System.out.println("输入信息有误");
                        in = new Scanner(System.in);
                    }
                    break;
                }
                case 2:   //查找联系人
                {
                    System.out.println("请输入要查询联系人的姓名");
                    String Name2 = in.next();
                    Friend selectS = sm.select(Name2);   //调用方法查找
                    if (selectS == null)   //判断是否有此人
                    {
                        System.out.println("查无此人");
                    }
                    else
                    {
                        System.out.println("姓名\t手机号\t邮箱地址\t家庭地址");
                        System.out.println(selectS.toString());
                    }
                }
                break;
                case 3:   //删除联系人
                {
                    System.out.println("请输入要删除联系人的姓名");
                    String Name3 = in.next();
                    if (sm.delete(Name3))   //判断返回是否删除成功
                    {
                        System.out.println("删除成功");
                    }
                    else
                    {
                        System.out.println("删除失败");
                    }
                    sm.display();   //打印数据
                }
                break;
                case 4:   //输出通讯录
                {
                    sm.display();
                }
                break;
                case 5:   //退出系统
                {
                    System.out.println("系统已退出");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("输入错误");
            }
        }
        in.close();   //关闭输入流
    }

    public static  void printMenu()   //输出目录
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
